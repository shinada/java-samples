package jp.co.np.p2netex.sample1.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.ResultSetFactory;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class Sample1InternalBasicSelectHandler extends Sample1InternalBasicHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
	private ResultSetFactory resultSetFactory;
    private ResultSetHandler resultSetHandler;
    private int fetchSize = 100;
    private int maxRows = -1;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public Sample1InternalBasicSelectHandler(DataSource dataSource, String sql,
            ResultSetHandler resultSetHandler,
            StatementFactory statementFactory, ResultSetFactory resultSetFactory) {
        super(dataSource, statementFactory);
        setSql(sql);
        setResultSetHandler(resultSetHandler);
        setResultSetFactory(resultSetFactory);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        return execute(args, getArgTypes(args));
    }

    @SuppressWarnings("unchecked")
    public Object execute(Object[] args, Class[] argTypes) {
        Connection con = getConnection();
        try {
            return execute(con, args, argTypes);
        } finally {
            close(con);
        }
    }

    @SuppressWarnings("unchecked")
    public Object execute(Connection connection, Object[] args, Class[] argTypes) {
        logSql(args, argTypes);
        PreparedStatement ps = null;
        try {
            ps = prepareStatement(connection);
            bindArgs(ps, args, argTypes);
            return execute(ps);
        } catch (SQLException e) {
            handleSQLException(e, ps);
            return null;// Unreachable!
        } finally {
            close(ps);
        }
    }

    protected Object[] setup(Connection con, Object[] args) {
        return args;
    }

    protected PreparedStatement prepareStatement(Connection connection) {
        PreparedStatement ps = super.prepareStatement(connection);
        if (fetchSize > -1) {
            setFetchSize(ps, fetchSize);
        }
        if (maxRows > -1) {
            setMaxRows(ps, maxRows);
        }
        return ps;
    }

    protected Object execute(PreparedStatement ps) throws SQLException {
        if (resultSetHandler == null) {
            throw new IllegalStateException("The resultSetHandler should not be null!");
        }
        ResultSet resultSet = null;
        try {
            resultSet = createResultSet(ps);
            return resultSetHandler.handle(resultSet);
        } finally {
            close(resultSet);
        }
    }

    protected void setupDatabaseMetaData(DatabaseMetaData dbMetaData) {
    }

    protected ResultSet createResultSet(PreparedStatement ps) {
        return resultSetFactory.createResultSet(ps);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public ResultSetFactory getResultSetFactory() {
        return resultSetFactory;
    }

    public void setResultSetFactory(ResultSetFactory resultSetFactory) {
        this.resultSetFactory = resultSetFactory;
    }

    public ResultSetHandler getResultSetHandler() {
        return resultSetHandler;
    }

    public void setResultSetHandler(ResultSetHandler resultSetHandler) {
        this.resultSetHandler = resultSetHandler;
    }

    public int getFetchSize() {
        return fetchSize;
    }
	
    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }
}
