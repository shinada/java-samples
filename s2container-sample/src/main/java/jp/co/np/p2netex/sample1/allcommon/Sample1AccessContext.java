package jp.co.np.p2netex.sample1.allcommon;

import java.util.Map;
import java.util.HashMap;

/**
 * Access-Context.
 * <p>
 * This access-context on the thread should be initialized at the beginning of access.
 * The access is various. Web-Access, Batch-Access, JUnit-Access and so on...
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Sample1AccessContext {

    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    /** The thread-local for this. */
    private static final ThreadLocal<Sample1AccessContext> threadLocal = new ThreadLocal<Sample1AccessContext>();

    /**
     * Get access-context on thread.
     * @return Access-context. (Nullable)
     */
    public static Sample1AccessContext getAccessContextOnThread() {
        return (Sample1AccessContext) threadLocal.get();
    }

    /**
     * Set access-context on thread.
     * @param accessContext Access-context. (NotNull)
     */
    public static void setAccessContextOnThread(Sample1AccessContext accessContext) {
        if (accessContext == null) {
            String msg = "The argument[accessContext] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        threadLocal.set(accessContext);
    }

    /**
     * Is existing access-context on thread?
     * @return Determination.
     */
    public static boolean isExistAccessContextOnThread() {
        return (threadLocal.get() != null);
    }

    /**
     * Clear access-context on thread.
     */
    public static void clearAccessContextOnThread() {
        threadLocal.set(null);
    }

    // ===================================================================================
    //                                                                  Access Information
    //                                                                  ==================
    /**
     * Get access user on thread.
     * <p>
     * If it can't get access user from access-context, 
     * returns 'Anonymous' as default value!
     * </p>
     * @return Access user. (NotNull)
     */
    public static String getAccessUserOnThread() {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final String accessUser = userContextOnThread.getAccessUser();
            if (accessUser != null) {
                return accessUser;
            }
        }
        return "Anonymous";// as Default
    }

    /**
     * Get access process on thread.
     * <p>
     * If it can't get access process from access-context, 
     * returns 'Anonymous' as default value!
     * </p>
     * @return Access process. (NotNull)
     */
    public static String getAccessProcessOnThread() {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final String accessProcess = userContextOnThread.getAccessProcess();
            if (accessProcess != null) {
                return accessProcess;
            }
        }
        return "Anonymous";// as Default
    }

    /**
     * Get access module on thread.
     * <p>
     * If it can't get access module from access-context, 
     * returns 'Anonymous' as default value!
     * </p>
     * @return Access module. (NotNull)
     */
    public static String getAccessModuleOnThread() {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final String accessModule = userContextOnThread.getAccessModule();
            if (accessModule != null) {
                return accessModule;
            }
        }
        return "Anonymous";// as Default
    }

    /**
     * Get access date on thread.
     * <p>
     * If it can't get access date from access-context, 
     * returns application current time as default value!
     * </p>
     * @return Access date. (NotNull)
     */
    public static java.util.Date getAccessDateOnThread() {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final java.util.Date accessDate = userContextOnThread.getAccessDate();
            if (accessDate != null) {
                return accessDate;
            }
            if (userContextOnThread.getAccessDateProvider() != null) {
                return userContextOnThread.getAccessDateProvider().getAccessDate();
            }
        }
        return new java.util.Date();// as Default
    }

    /**
     * Get access timestamp on thread.
     * <p>
     * If it can't get access timestamp from access-context, 
     * returns application current time as default value!
     * </p>
     * @return Access timestamp. (NotNull)
     */
    public static java.sql.Timestamp getAccessTimestampOnThread() {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final java.sql.Timestamp accessTimestamp = userContextOnThread.getAccessTimestamp();
            if (accessTimestamp != null) {
                return accessTimestamp;
            }
            if (userContextOnThread.getAccessTimestampProvider() != null) {
                return userContextOnThread.getAccessTimestampProvider().getAccessTimestamp();
            }
        }
        return new java.sql.Timestamp(System.currentTimeMillis());// as Default
    }

    /**
     * Get access value on thread.
     * <p>
     * If it can't get access value from access-context, 
     * returns null as default value!
     * </p>
     * @param key Key. (NotNull)
     * @return Access value. (Nullable)
     */
    public static Object getAccessValueOnThread(String key) {
        if (isExistAccessContextOnThread()) {
            final Sample1AccessContext userContextOnThread = getAccessContextOnThread();
            final Map<String, Object> accessValueMap = userContextOnThread.getAccessValueMap();
            if (accessValueMap != null) {
                return accessValueMap.get(key);
            }
        }
        return null;// as Default
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String accessUser;
    protected String accessProcess;
    protected String accessModule;
    protected java.util.Date accessDate;
    protected AccessDateProvider accessDateProvider;
    protected java.sql.Timestamp accessTimestamp;
    protected AccessTimestampProvider accessTimestampProvider;
    protected Map<String, Object> accessValueMap;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public String getAccessProcess() {
        return accessProcess;
    }

    public void setAccessProcess(String accessProcess) {
        this.accessProcess = accessProcess;
    }

    public String getAccessModule() {
        return accessModule;
    }

    public void setAccessModule(String accessModule) {
        this.accessModule = accessModule;
    }

    public java.util.Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(java.util.Date accessDate) {
        this.accessDate = accessDate;
    }

    public AccessDateProvider getAccessDateProvider() {
        return accessDateProvider;
    }

    public void setAccessDateProvider(AccessDateProvider accessDateProvider) {
        this.accessDateProvider = accessDateProvider;
    }

    public java.sql.Timestamp getAccessTimestamp() {
        return accessTimestamp;
    }

    public void setAccessTimestamp(java.sql.Timestamp accessTimestamp) {
        this.accessTimestamp = accessTimestamp;
    }

    public AccessTimestampProvider getAccessTimestampProvider() {
        return accessTimestampProvider;
    }

    public void setAccessTimestampProvider(AccessTimestampProvider accessTimestampProvider) {
        this.accessTimestampProvider = accessTimestampProvider;
    }

    public Map<String, Object> getAccessValueMap() {
        return accessValueMap;
    }

    public void registerAccessValue(String key, Object value) {
        if (accessValueMap == null) {
            accessValueMap = new HashMap<String, Object>();
        }
        accessValueMap.put(key, value);
    }

    // ===================================================================================
    //                                                                  Provider Interface
    //                                                                  ==================
    /**
     * The provider interface of access date.
     */
    public static interface AccessDateProvider {

        /**
         * Get access date.
         * @return Access date. (NotNull)
         */
        public java.util.Date getAccessDate();
    }

    /**
     * The provider interface of access date.
     */
    public static interface AccessTimestampProvider {

        /**
         * Get access timestamp.
         * @return Access timestamp. (NotNull)
         */
        public java.sql.Timestamp getAccessTimestamp();
    }
}
