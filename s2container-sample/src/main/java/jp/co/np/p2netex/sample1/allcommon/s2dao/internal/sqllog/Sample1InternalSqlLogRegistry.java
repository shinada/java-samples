package jp.co.np.p2netex.sample1.allcommon.s2dao.internal.sqllog;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

/**
 * @author DBFlute(AutoGenerator)
 */
public class Sample1InternalSqlLogRegistry {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(Sample1InternalSqlLogRegistry.class);

	// ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
	protected static final String NAME_SqlLogRegistryLocator = "org.seasar.extension.jdbc.SqlLogRegistryLocator";
	protected static final String NAME_getInstance = "getInstance";
	protected static final String NAME_setInstance = "setInstance";
	protected static final String NAME_SqlLogRegistry = "org.seasar.extension.jdbc.SqlLogRegistry";
	protected static final String NAME_SqlLog = "org.seasar.extension.jdbc.SqlLog";
	protected static final String NAME_SqlLogImpl = "org.seasar.extension.jdbc.impl.SqlLogImpl";
	protected static boolean STATUS_SqlLogExists = false;
	static {
	    forNameContainerSqlLogRegistryLocator();
	}
	
	// ===================================================================================
    //                                                                        Public Entry
    //                                                                        ============
	public static boolean existsSqlLogRegistry() {
	    return STATUS_SqlLogExists;
	}
	
	public static Object findContainerSqlLogRegistry() {
	    final Class<?> sqlLogRegistryLocatorType = forNameContainerSqlLogRegistryLocator();
		if (sqlLogRegistryLocatorType == null) {
		    return null;
		}
	    try {
	        final Method method = sqlLogRegistryLocatorType.getMethod(NAME_getInstance, (Class[])null);
		    return method.invoke(null, (Object[])null);
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.findContainerSqlLogRegistry() threw the exception:";
			msg = msg + " sqlLogRegistryLocatorType=" + sqlLogRegistryLocatorType;
			msg = msg + " NAME_getInstance=" + NAME_getInstance;
		    throw new IllegalStateException(msg, e);
		}
	}
	
	public static void closeRegistration() {
	    final Class<?> sqlLogRegistryLocatorType = forNameContainerSqlLogRegistryLocator();
		if (sqlLogRegistryLocatorType == null) {
		    return;
		}
		final Class<?> sqlLogRegistryType = forNameContainerSqlLogRegistry();
		if (sqlLogRegistryType == null) {
		    return;
		}
	    try {
	        final Method method = sqlLogRegistryLocatorType.getMethod(NAME_setInstance, new Class[]{sqlLogRegistryType});
			_log.info("...Closing the registration of sqlLog.");
		    method.invoke(null, new Object[]{null});
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.closeRegistration() threw the exception:";
			msg = msg + " sqlLogRegistryLocatorType=" + sqlLogRegistryLocatorType;
			msg = msg + " NAME_setInstance=" + NAME_setInstance;
		    throw new IllegalStateException(msg, e);
		}
	}
	
    public static void push(String rawSql, String completeSql, Object[] bindArgs, Class<?>[] bindArgTypes, Object sqlLogRegistry) {
		if (sqlLogRegistry == null) {
		    throw new IllegalArgumentException("sqlLogRegistry should not be null!");
		}
	    final Object sqlLogImpl = createContainerSqlLogImpl(rawSql, completeSql, bindArgs, bindArgTypes);
		reflectSqlLogToContainerSqlLogRegistry(sqlLogImpl, sqlLogRegistry);
    }
	
	public static String peekCompleteSql() {
	    final Object sqlLogRegistry = findContainerSqlLogRegistry();
		if (sqlLogRegistry == null) {
		    return null;
		}
		final Object sqlLog = findLastContainerSqlLog(sqlLogRegistry);
		if (sqlLog == null) {
		    return null;
		}
		return extractCompleteSqlFromContainerSqlLog(sqlLog);
	}

	// ===================================================================================
    //                                                                Container Reflection
    //                                                                ====================
	protected static Object createContainerSqlLogImpl(String rawSql, String completeSql, Object[] bindArgs, Class<?>[] bindArgTypes) {
	    try {
	        final Class<?> sqlLogImplType = Class.forName(NAME_SqlLogImpl);
	        final Class<?>[] argTypes = new Class[]{String.class, String.class, Object[].class, Class[].class};
	        final Constructor<?> constructor = sqlLogImplType.getConstructor(argTypes);
		    return constructor.newInstance(new Object[]{rawSql, completeSql, bindArgs, bindArgTypes});
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.createContainerSqlLogImpl() threw the exception:";
			msg = msg + " completeSql=" + completeSql;
			msg = msg + " NAME_SqlLogImpl=" + NAME_SqlLogImpl;
		    throw new IllegalStateException(msg, e);
		}
	}
	
	protected static void reflectSqlLogToContainerSqlLogRegistry(Object sqlLog, Object sqlLogRegistry) {
		if (sqlLog == null || sqlLogRegistry == null) {
		    return;
		}
	    try {
    		final Class<?> sqlLogRegistryType = sqlLogRegistry.getClass();
    	    final Class<?> sqlLogType = Class.forName(NAME_SqlLog);
    	    final Method method = sqlLogRegistryType.getMethod("add", new Class[]{sqlLogType});
    		method.invoke(sqlLogRegistry, new Object[]{sqlLog});
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.reflectToContainerSqlLogRegistry() threw the exception:";
			msg = msg + " sqlLog=" + sqlLog + " sqlLogRegistry=" + sqlLogRegistry;
			msg = msg + " NAME_SqlLog=" + NAME_SqlLog;
		    throw new IllegalStateException(msg, e);
		}
	}

	protected static Object findLastContainerSqlLog(Object sqlLogRegistry) {
		if (sqlLogRegistry == null) {
		    return null;
		}
	    try {
    		final Class<?> sqlLogRegistryType = sqlLogRegistry.getClass();
    	    final Method method = sqlLogRegistryType.getMethod("getLast", (Class[])null);
    		return method.invoke(sqlLogRegistry, (Object[])null);
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.findLastContainerSqlLog() threw the exception:";
			msg = msg + " sqlLogRegistry=" + sqlLogRegistry;
		    throw new IllegalStateException(msg, e);
		}
	}
	
	protected static String extractCompleteSqlFromContainerSqlLog(Object sqlLog) {
		if (sqlLog == null) {
		    return null;
		}
	    try {
    		final Class<?> sqlLogType = sqlLog.getClass();
    	    final Method method = sqlLogType.getMethod("getCompleteSql", (Class[])null);
    		return (String)method.invoke(sqlLog, (Object[])null);
		} catch (Exception e) {
		    String msg = "Sample1InternalSqlLogRegistry.extractCompleteSqlFromContainerSqlLog() threw the exception:";
			msg = msg + " sqlLog=" + sqlLog;
		    throw new IllegalStateException(msg, e);
		}
	}
	
	protected static Class<?> forNameContainerSqlLogRegistryLocator() {
	    Class<?> clazz = null;
	    try {
	        clazz = Class.forName(NAME_SqlLogRegistryLocator);
			STATUS_SqlLogExists = true;
		} catch (Exception ignored) {
		    STATUS_SqlLogExists = false;
		    return null;
		}
		return clazz;
	}
	
	protected static Class<?> forNameContainerSqlLogRegistry() {
	    Class<?> clazz = null;
	    try {
	        clazz = Class.forName(NAME_SqlLogRegistry);
		} catch (Exception ignored) {
		    return null;
		}
		return clazz;
	}
}
