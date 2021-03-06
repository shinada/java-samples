package jp.co.np.p2netex.sample1.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;
import org.seasar.framework.exception.SQLRuntimeException;

import jp.co.np.p2netex.sample1.allcommon.Sample1QLog;
import jp.co.np.p2netex.sample1.allcommon.Sample1DBFluteConfig;
import jp.co.np.p2netex.sample1.allcommon.cbean.Sample1ConditionBeanContext;
import jp.co.np.p2netex.sample1.allcommon.exception.Sample1EntityAlreadyExistsException;
import jp.co.np.p2netex.sample1.allcommon.exception.Sample1SQLFailureException;
import jp.co.np.p2netex.sample1.allcommon.s2dao.internal.sqllog.Sample1InternalSqlLogRegistry;
import jp.co.np.p2netex.sample1.allcommon.s2dao.internal.util.Sample1InternalBindVariableUtil;
import jp.co.np.p2netex.sample1.allcommon.util.Sample1SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class Sample1InternalBasicHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DataSource dataSource;
    private String sql;
    private StatementFactory statementFactory;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public Sample1InternalBasicHandler(DataSource ds, StatementFactory statementFactory) {
        setDataSource(ds);
        setStatementFactory(statementFactory);
    }

    public Sample1InternalBasicHandler(DataSource ds, String sql, StatementFactory statementFactory) {
        setDataSource(ds);
		setSql(sql);
        setStatementFactory(statementFactory);
    }

	// ===================================================================================
    //                                                           Basic Method for SubClass
    //                                                           =========================
    protected void bindArgs(PreparedStatement ps, Object[] args, Class<?>[] argTypes) {
        if (args == null) {
            return;
        }
        for (int i = 0; i < args.length; ++i) {
            ValueType valueType = getValueType(argTypes[i]);
            try {
                valueType.bindValue(ps, i + 1, args[i]);
            } catch (SQLException e) {
                handleSQLException(e, ps);
            }
        }
    }

    protected Class<?>[] getArgTypes(Object[] args) {
        if (args == null) {
            return null;
        }
        Class<?>[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; ++i) {
            Object arg = args[i];
            if (arg != null) {
                argTypes[i] = arg.getClass();
            }
        }
        return argTypes;
    }

    protected String getCompleteSql(Object[] args) {
        return Sample1InternalBindVariableUtil.getCompleteSql(sql, args);
    }

    protected String getBindVariableText(Object bindVariable) {
        return Sample1InternalBindVariableUtil.getBindVariableText(bindVariable);
    }

    protected ValueType getValueType(Class<?> clazz) {
        return ValueTypes.getValueType(clazz);
    }

    protected void logSql(Object[] args, Class<?>[] argTypes) {
        if (Sample1QLog.isLogEnabled() || Sample1InternalSqlLogRegistry.existsSqlLogRegistry()) {
            final String completeSql = getCompleteSql(args);
			if (isContainsLineSeparatorInSql()) {
                Sample1QLog.log(getLineSeparator() + completeSql);
			} else {
                Sample1QLog.log(completeSql);
			}
		    if (Sample1InternalSqlLogRegistry.existsSqlLogRegistry()) {
			    final Object sqlLogRegistry = Sample1InternalSqlLogRegistry.findContainerSqlLogRegistry();
				if (sqlLogRegistry != null) {
				    Sample1InternalSqlLogRegistry.push(getSql(), completeSql, args, argTypes, sqlLogRegistry);
				}
			}
        }
    }
	
	protected boolean isContainsLineSeparatorInSql() {
	    return sql != null ? sql.contains(getLineSeparator()) : false;
	}

    // ===================================================================================
    //                                                                   Exception Handler
    //                                                                   =================
    protected void handleSQLException(SQLException e, Statement statement) {
        handleSQLException(e, statement, false, null);
    }

    protected void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid, Object resource) {
        new SQLExceptionHandler().handleSQLException(e, statement, uniqueConstraintValid, resource);
    }

    public static class SQLExceptionHandler {

	    public void handleSQLException(SQLException e, Statement statement) {
	        handleSQLException(e, statement, false, null);
	    }
	    
	    public void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid, Object resource) {
	        if (isSqlExceptionOldStyleHandling()) {
	            throw new SQLRuntimeException(e);
	        }
	        if (uniqueConstraintValid && isUniqueConstraintException(e)) {
	            throwEntityAlreadyExistsException(e, statement, resource);
	        }
	        throwSQLFailureException(e, statement, resource);
	    }
	
	    protected boolean isUniqueConstraintException(SQLException e) {
	        Sample1DBFluteConfig.UniqueConstraintDeterminator determinator = getUniqueConstraintDeterminator();
	        if (determinator != null) {
	            return determinator.isUniqueConstraintException(e);
	        }
	        return Sample1ConditionBeanContext.isUniqueConstraintException(extractSQLState(e), e.getErrorCode());
	    }
	
	    protected Sample1DBFluteConfig.UniqueConstraintDeterminator getUniqueConstraintDeterminator() {
	        return Sample1DBFluteConfig.getInstance().getUniqueConstraintDeterminator();
	    }
	
	    protected boolean isSqlExceptionOldStyleHandling() {
	        return Sample1DBFluteConfig.getInstance().isSqlExceptionOldStyleHandling();
	    }
	
	    protected void throwEntityAlreadyExistsException(SQLException e, Statement statement, Object resource) {
	        String msg = "Look! Read the message below." + getLineSeparator();
	        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
	        msg = msg + "The entity already exists on the database!" + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[Advice]" + getLineSeparator();
	        msg = msg + "Please confirm the primary key whether it already exists on the database." + getLineSeparator();
	        msg = msg + "And confirm the unique constraint for other columns." + getLineSeparator();
	        msg = msg + getLineSeparator();
	        if (statement != null) {
	            msg = msg + "[Statement]" + getLineSeparator() + statement + getLineSeparator();
	            msg = msg + getLineSeparator();
	        }
            if (resource != null) {
	            msg = msg + "[Resource]" + getLineSeparator() + resource.getClass().getName() + getLineSeparator();
	            msg = msg + buildResourceDisplay(resource) + getLineSeparator();
	            msg = msg + getLineSeparator();
            }
	        msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
	        msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
	            msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
	                msg = msg + getLineSeparator();
	                msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
	                msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
	        msg = msg + "* * * * * * * * * */";
	        throw new Sample1EntityAlreadyExistsException(msg, e);
	    }
	
	    protected void throwSQLFailureException(SQLException e, Statement statement, Object resource) {
	        String msg = "Look! Read the message below." + getLineSeparator();
	        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
	        msg = msg + "The SQL failed to execute!" + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[Advice]" + getLineSeparator();
	        msg = msg + "Please confirm the SQLException message." + getLineSeparator();
	        msg = msg + getLineSeparator();
	        if (statement != null) {
	            msg = msg + "[Statement]" + getLineSeparator() + statement + getLineSeparator();
	            msg = msg + getLineSeparator();
	        }
            if (resource != null) {
	            msg = msg + "[Resource]" + getLineSeparator() + resource.getClass().getName() + getLineSeparator();
	            msg = msg + buildResourceDisplay(resource) + getLineSeparator();
	            msg = msg + getLineSeparator();
            }
	        msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
	        msg = msg + getLineSeparator();
	        msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
	        msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
	            msg = msg + getLineSeparator();
	            msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
	            msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
	                msg = msg + getLineSeparator();
	                msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
	                msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
            msg = msg + "* * * * * * * * * */";
            throw new Sample1SQLFailureException(msg, e);
        }

        protected String buildResourceDisplay(Object resource) {
            if (resource == null) { return ""; }
            if (resource instanceof CommandContext) {
                CommandContext ctx = (CommandContext)resource;
                Object[] variables = ctx.getBindVariables();
                return buildResourceDisplay(variables);
            } else if (resource instanceof Object[]) {
                return buildResourceDisplay((Object[])resource);
            } else {
                return resource.toString();
            }
        }
        
        protected String buildResourceDisplay(Object[] resources) {
            if (resources == null) { return ""; }
            StringBuilder sb = new StringBuilder();
            for (Object resource : resources) {
                sb.append(", ").append(resource);
            }
            sb.delete(0, ", ".length()).insert(0, "{").append("}");
            return sb.toString();
        }
        
        protected String extractSQLState(SQLException e) {
            String sqlState = e.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next
            SQLException nextEx = e.getNextException();
            if (nextEx == null) {
                return null;
            }
            sqlState = nextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next
            SQLException nextNextEx = nextEx.getNextException();
            if (nextNextEx == null) {
                return null;
            }
            sqlState = nextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next Next
            SQLException nextNextNextEx = nextNextEx.getNextException();
            if (nextNextNextEx == null) {
                return null;
            }
            sqlState = nextNextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // It doesn't use recursive call by design because JDBC is unpredictable fellow.
            return null;
        }

        protected String getLineSeparator() {
            return Sample1SimpleSystemUtil.getLineSeparator();
        }
    }

    // ===================================================================================
    //                                                                      JDBC Delegator
    //                                                                      ==============
    protected Connection getConnection() {
        if (dataSource == null) {
            throw new IllegalStateException("The dataSource should not be null!");
        }
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }

    protected PreparedStatement prepareStatement(Connection conn) {
        if (sql == null) {
            throw new IllegalStateException("The sql should not be null!");
        }
        return statementFactory.createPreparedStatement(conn, sql);
    }

    protected int executeUpdate(PreparedStatement ps, Object resource) {
        try {
            return ps.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e, ps, true, resource);
            return 0;// Unreachable!
        }
    }

    protected void setFetchSize(Statement statement, int fetchSize) {
        if (statement == null) {
            return;
        }
        try {
            statement.setFetchSize(fetchSize);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void setMaxRows(Statement statement, int maxRows) {
        if (statement == null) {
            return;
        }
        try {
            statement.setMaxRows(maxRows);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(Statement statement) {
        if (statement == null) {
            return;
        }
        try {
            statement.close();
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(ResultSet resultSet) {
        if (resultSet == null) {
            return;
        }
        try {
            resultSet.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
        }
    }

    protected void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return Sample1SimpleSystemUtil.getLineSeparator();
    }
    
	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public void setStatementFactory(StatementFactory statementFactory) {
        this.statementFactory = statementFactory;
    }
}
