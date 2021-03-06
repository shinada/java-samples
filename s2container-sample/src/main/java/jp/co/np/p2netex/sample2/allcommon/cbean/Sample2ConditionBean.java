package jp.co.np.p2netex.sample2.allcommon.cbean;

import jp.co.np.p2netex.sample2.allcommon.cbean.sqlclause.Sample2SqlClause;
import jp.co.np.p2netex.sample2.allcommon.jdbc.Sample2StatementConfig;

/**
 * The interface of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
public interface Sample2ConditionBean extends Sample2PagingBean {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Map-string map-mark. */
    public static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string list-mark. */
    public static final String MAP_STRING_LIST_MARK = "list:";

    /** Map-string start-brace. */
    public static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    public static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    public static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    public static final String MAP_STRING_EQUAL = "@=";

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * Get table DB-name.
     * @return Table DB-name. (NotNull)
     */
    public String getTableDbName();

    /**
     * Get table SQL-name.
     * @return Table SQL-name. (NotNull)
     */
    public String getTableSqlName();

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    /**
     * Get SQL-clause instance.
     * @return SQL-clause. (NotNull)
     */
    public Sample2SqlClause getSqlClause();

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    /**
     * Accept primary-key map-string.
     * @param primaryKeyMap Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap);

    /**
     * Accept primary-key map-string. Delimiter is at-mark and semicolon.
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMapString(String primaryKeyMapString);

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    /**
     * Add order-by PrimaryKey asc. {order by primaryKey1 asc, primaryKey2 asc...}
     * @return this. (NotNull)
     */
    public Sample2ConditionBean addOrderBy_PK_Asc();

    /**
     * Add order-by PrimaryKey desc. {order by primaryKey1 desc, primaryKey2 desc...}
     * @return this. (NotNull)
     */
    public Sample2ConditionBean addOrderBy_PK_Desc();

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Get condition-query as interface.
     * @return Instance of query as interface. (NotNull)
     * @deprecated
     */
    public Sample2ConditionQuery getConditionQueryAsInterface();

    /**
     * Get the conditionQuery of the local table as interface.
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public Sample2ConditionQuery localCQ();

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    /**
     * Has union query or union all query?
     * @return Determination.
     */
    public boolean hasUnionQueryOrUnionAllQuery();

    // ===================================================================================
    //                                                                        Limit Select
    //                                                                        ============
    /**
     * Limit select PK only.
     * @return this. (NotNull)
     */
    public Sample2ConditionBean limitSelect_PKOnly();

    /**
     * Limit select off.
     * @return this. (NotNull)
     */
    public Sample2ConditionBean limitSelect_Off();

    /**
     * Is limit-select PK only?
     * @return Determination.
     */
    public boolean isLimitSelect_PKOnly();

    // =====================================================================================
    //                                                                          Lock Setting
    //                                                                          ============
    /**
     * Lock for update.
	 * <p>
     * If you invoke this, your SQL lock target records for update.
     * It depends whether this method supports this on the database type.
     * </p>
     * @return this. (NotNull)
     */
    public Sample2ConditionBean lockForUpdate();

    // =====================================================================================
    //                                                                          Select Count
    //                                                                          ============
    /**
     * Set up various things for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public Sample2ConditionBean xsetupSelectCountIgnoreFetchScope();

    /**
     * Do after-care for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public Sample2ConditionBean xafterCareSelectCountIgnoreFetchScope();

    /**
     * Is set up various things for select-count-ignore-fetch-scope? {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return Determination.
     */
    public boolean isSelectCountIgnoreFetchScope();
	
    // =====================================================================================
    //                                                                      Statement Config
    //                                                                      ================
    /**
     * @param statementConfig The config of statement. (Nullable)
     */
	public void configure(Sample2StatementConfig statementConfig);
	
    /**
     * @return The config of statement. (Nullable)
     */
	public Sample2StatementConfig getStatementConfig();
	
    // ===================================================================================
    //                                                                          Format SQL
    //                                                                          ==========
    /** @deprecated Sorry! ConditionBean must be formatted as default.*/
	public void formatSql();
	
    /**
	 * @return Is the SQL formatted?
	 * @deprecated Sorry! ConditionBean must be formatted as default.
	 */
	public boolean isFormatSql();
	
    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
	/**
	 * Convert this conditionBean to SQL for display.
	 * @return SQL for display. (NotNull and NotEmpty)
	 */
	public String toDisplaySql();
}
