package jp.co.np.p2netex.sample2.allcommon.cbean;

/**
 * The bean of paging.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface Sample2PagingBean extends Sample2FetchNarrowingBean, Sample2OrderByBean {

    // ===================================================================================
    //                                                                Paging Determination
    //                                                                ====================
    // * * * * * * * *
    // For SQL Comment
    // * * * * * * * *
    /**
     * Is the execution for paging(NOT count)?
     * @return Determination.
     */
    public boolean isPaging();

    // ===================================================================================
    //                                                                      Paging Setting
    //                                                                      ==============
    /**
     * Set up paging resources.
	 * @param pageSize The page size per one page. (NotMinus & NotZero)
	 * @param pageNumber The number of page. It's ONE origin. (NotMinus & NotZero: If it's minus or zero, it treats as one.)
     */
    public void paging(int pageSize, int pageNumber);

    /**
     * Set whether the execution for paging(NOT count). {INTERNAL METHOD}
     * @param paging Determination.
     */
    public void xsetPaging(boolean paging);

    // ===================================================================================
    //                                                                       Fetch Setting
    //                                                                       =============
    /**
     * Fetch first. <br />
     * If you invoke this, your SQL returns [fetch-size] records from first. <br />
     * 
     * @param fetchSize The size of fetch. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public Sample2PagingBean fetchFirst(int fetchSize);

    /**
     * Fetch scope. <br />
     * If you invoke this, your SQL returns [fetch-size] records from [fetch-start-index]. <br />
     * 
     * @param fetchStartIndex The start index of fetch. 0 origin. (NotMinus)
     * @param fetchSize The size of fetch. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public Sample2PagingBean fetchScope(int fetchStartIndex, int fetchSize);

    /**
     * Fetch page. <br />
     * When you invoke this, it is normally necessary to invoke 'fetchFirst()' or 'fetchScope()' ahead of that. <br />
     * But you also can use default-fetch-size without invoking 'fetchFirst()' or 'fetchScope()'. <br />
     * If you invoke this, your SQL returns [fetch-size] records from [fetch-start-index] calculated by [fetch-page-number]. <br />
     * 
     * @param fetchPageNumber The page number of fetch. 1 origin. (NotMinus & NotZero: If minus or zero, set one.)
     * @return this. (NotNull)
     */
    public Sample2PagingBean fetchPage(int fetchPageNumber);

    // ===================================================================================
    //                                                                      Fetch Property
    //                                                                      ==============
    /**
     * Get fetch-start-index.
     * 
     * @return Fetch-start-index.
     */
    public int getFetchStartIndex();

    /**
     * Get fetch-size.
     * 
     * @return Fetch-size.
     */
    public int getFetchSize();

    /**
     * Get fetch-page-number.
     * 
     * @return Fetch-page-number.
     */
    public int getFetchPageNumber();

    /**
     * Get page start index.
     * 
     * @return Page start index. 0 origin. (NotMinus)
     */
    public int getPageStartIndex();

    /**
     * Get page end index.
     * 
     * @return Page end index. 0 origin. (NotMinus)
     */
    public int getPageEndIndex();

    /**
     * Is fetch scope effective?
     * 
     * @return Determination.
     */
    public boolean isFetchScopeEffective();

    // ===================================================================================
    //                                                                       Hint Property
    //                                                                       =============
    // * * * * * * * *
    // For SQL Comment
    // * * * * * * * *
    /**
     * Get select-hint. {select [select-hint] * from table...}
     * 
     * @return Select-hint. (NotNull)
     */
    public String getSelectHint();

    /**
     * Get from-hint. {select * from table [from-hint] where ...}
     * 
     * @return From-hint. (NotNull)
     */
    public String getFromHint();

    /**
     * Get sql-suffix. {select * from table where ... order by ... [sql-suffix]}
     * 
     * @return Sql-suffix. (NotNull)
     */
    public String getSqlSuffix();
}
