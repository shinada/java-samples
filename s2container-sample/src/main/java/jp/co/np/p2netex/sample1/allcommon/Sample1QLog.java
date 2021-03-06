package jp.co.np.p2netex.sample1.allcommon;

import jp.co.np.p2netex.sample1.allcommon.Sample1DBFluteConfig;

/**
 * @author DBFlute(AutoGenerator)
 */
public class Sample1QLog {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(Sample1QLog.class);

    // ===================================================================================
    //                                                                             Logging
    //                                                                             =======
	public static void log(String sql) {// Very Internal
		if (isQueryLogLevelInfo()) {
	        _log.info(sql);
		} else {
	        _log.debug(sql);
		}
	}
	
	public static boolean isLogEnabled() {
		if (isQueryLogLevelInfo()) {
	        return _log.isInfoEnabled();
		} else {
	        return _log.isDebugEnabled();
		}
	}
	
	protected static boolean isQueryLogLevelInfo() {
	    return Sample1DBFluteConfig.getInstance().isQueryLogLevelInfo();
	}
}
