package jp.co.np.p2netex.sample1.allcommon.cbean;

/**
 * Fetch-Narrowing-Bean context. (referring to s2pager)
 * 
 * @author DBFlute(AutoGenerator)
 */
public class Sample1FetchNarrowingBeanContext {

    /** The thread-local for this. */
    private static ThreadLocal<Sample1FetchNarrowingBean> _threadLocal = new ThreadLocal<Sample1FetchNarrowingBean>();

    /**
     * Get fetch-narrowing-bean on thread.
     * @return Condition-bean context. (Nullable)
     */
    public static Sample1FetchNarrowingBean getFetchNarrowingBeanOnThread() {
        return (Sample1FetchNarrowingBean)_threadLocal.get();
    }

    /**
     * Set fetch-narrowing-bean on thread.
     * @param cb Condition-bean. (NotNull)
     */
    public static void setFetchNarrowingBeanOnThread(Sample1FetchNarrowingBean cb) {
        if (cb == null) {
            String msg = "The argument[cb] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _threadLocal.set(cb);
    }

    /**
     * Is existing fetch-narrowing-bean on thread?
     * @return Determination.
     */
    public static boolean isExistFetchNarrowingBeanOnThread() {
        return (_threadLocal.get() != null);
    }

    /**
     * Clear fetch-narrowing-bean on thread.
     */
    public static void clearFetchNarrowingBeanOnThread() {
        _threadLocal.set(null);
    }

    /**
     * Is the argument fetch-narrowing-bean?
     * @param dtoInstance Dto instance.
     * @return Determination.
     */
    public static boolean isTheArgumentFetchNarrowingBean(final Object dtoInstance) {
        if (dtoInstance instanceof Sample1FetchNarrowingBean) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Is the type fetch-narrowing-bean?
     * @param dtoClass DtoClass.
     * @return Determination.
     */
    public static boolean isTheTypeFetchNarrowingBean(final Class<?> dtoClass) {
        if (Sample1FetchNarrowingBean.class.isAssignableFrom(dtoClass)) {
            return true;
        } else {
            return false;
        }
    }
}
