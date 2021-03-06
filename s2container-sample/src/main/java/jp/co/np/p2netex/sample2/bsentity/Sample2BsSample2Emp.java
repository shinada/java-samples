package jp.co.np.p2netex.sample2.bsentity;

import java.util.*;
    
import jp.co.np.p2netex.sample2.allcommon.Sample2Entity;
import jp.co.np.p2netex.sample2.allcommon.dbmeta.Sample2DBMeta;
import jp.co.np.p2netex.sample2.allcommon.dbmeta.Sample2DBMetaInstanceHandler;
import jp.co.np.p2netex.sample2.exentity.*;

/**
 * The entity of SAMPLE2_EMP(TABLE).
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, HIRE_DATE, DEPT_ID, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign-table]
 *     SAMPLE2_DEPT
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     sample2Dept
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class Sample2BsSample2Emp implements Sample2Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is SAMPLE2_EMP. */
    public static final String TABLE = "SAMPLE2_EMP";

    
    /** VERSION_NO-Annotation */
    public static final String VERSION_NO_PROPERTY = "versionNo";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'ID'. {PK : INTEGER : NotNull} */
    protected java.lang.Integer _id;

    /** The attribute of the column 'NAME'. {VARCHAR(20)} */
    protected String _name;

    /** The attribute of the column 'HIRE_DATE'. {DATE} */
    protected java.util.Date _hireDate;

    /** The attribute of the column 'DEPT_ID'. {INTEGER : FK to SAMPLE2_DEPT} */
    protected java.lang.Integer _deptId;

    /** The attribute of the column 'VERSION_NO'. {DECIMAL(8)} */
    protected java.math.BigDecimal _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public Sample2BsSample2Emp() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SAMPLE2_EMP";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "sample2Emp";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public Sample2DBMeta getDBMeta() {
        return Sample2DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
          
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
          

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
          

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [sample2Dept]
    // * * * * * * * * */
    public static final int sample2Dept_RELNO = 0;
    public static final String sample2Dept_RELKEYS = "DEPT_ID:ID";

    /** The entity of foreign property 'sample2Dept'. */
    protected Sample2Sample2Dept _parentSample2Dept;

    /**
     * Get the entity of foreign property 'sample2Dept'. {without lazy-load}
     * @return The entity of foreign property 'sample2Dept'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Sample2Sample2Dept getSample2Dept() {
        return _parentSample2Dept;
    }

    /**
     * Set the entity of foreign property 'sample2Dept'.
     * @param sample2Dept The entity of foreign property 'sample2Dept'. (Nullable)
     */
    public void setSample2Dept(Sample2Sample2Dept sample2Dept) {
        _parentSample2Dept = sample2Dept;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Sample2BsSample2Emp)) { return false; }
        final Sample2BsSample2Emp otherEntity = (Sample2BsSample2Emp)other;
        if (!helpComparingValue(getId(), otherEntity.getId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 17;
        if (this.getId() != null) { result = result + getId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getHireDate());
        sb.append(delimiter).append(getDeptId());
        sb.append(delimiter).append(getVersionNo());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {PK : INTEGER : NotNull} */
    public static final String id_COLUMN = "ID";

    /**
     * Get the value of the column 'ID'. <br />
     * {PK : INTEGER : NotNull}
     * @return The value of the column 'ID'. (Nullable)
     */
    public java.lang.Integer getId() {
        return _id;
    }

    /**
     * Set the value of the column 'ID'. <br />
     * {PK : INTEGER : NotNull}
     * @param id The value of the column 'ID'. (Nullable)
     */
    public void setId(java.lang.Integer id) {
        _modifiedProperties.addPropertyName("id");
        this._id = id;
    }

    /** The column annotation for S2Dao. {VARCHAR(20)} */
    public static final String name_COLUMN = "NAME";

    /**
     * Get the value of the column 'NAME'. <br />
     * {VARCHAR(20)}
     * @return The value of the column 'NAME'. (Nullable)
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the value of the column 'NAME'. <br />
     * {VARCHAR(20)}
     * @param name The value of the column 'NAME'. (Nullable)
     */
    public void setName(String name) {
        _modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /** The column annotation for S2Dao. {DATE} */
    public static final String hireDate_COLUMN = "HIRE_DATE";

    /**
     * Get the value of the column 'HIRE_DATE'. <br />
     * {DATE}
     * @return The value of the column 'HIRE_DATE'. (Nullable)
     */
    public java.util.Date getHireDate() {
        return _hireDate;
    }

    /**
     * Set the value of the column 'HIRE_DATE'. <br />
     * {DATE}
     * @param hireDate The value of the column 'HIRE_DATE'. (Nullable)
     */
    public void setHireDate(java.util.Date hireDate) {
        _modifiedProperties.addPropertyName("hireDate");
        this._hireDate = hireDate;
    }

    /** The column annotation for S2Dao. {INTEGER : FK to SAMPLE2_DEPT} */
    public static final String deptId_COLUMN = "DEPT_ID";

    /**
     * Get the value of the column 'DEPT_ID'. <br />
     * {INTEGER : FK to SAMPLE2_DEPT}
     * @return The value of the column 'DEPT_ID'. (Nullable)
     */
    public java.lang.Integer getDeptId() {
        return _deptId;
    }

    /**
     * Set the value of the column 'DEPT_ID'. <br />
     * {INTEGER : FK to SAMPLE2_DEPT}
     * @param deptId The value of the column 'DEPT_ID'. (Nullable)
     */
    public void setDeptId(java.lang.Integer deptId) {
        _modifiedProperties.addPropertyName("deptId");
        this._deptId = deptId;
    }

    /** The column annotation for S2Dao. {DECIMAL(8)} */
    public static final String versionNo_COLUMN = "VERSION_NO";

    /**
     * Get the value of the column 'VERSION_NO'. <br />
     * {DECIMAL(8)}
     * @return The value of the column 'VERSION_NO'. (Nullable)
     */
    public java.math.BigDecimal getVersionNo() {
        return _versionNo;
    }

    /**
     * Set the value of the column 'VERSION_NO'. <br />
     * {DECIMAL(8)}
     * @param versionNo The value of the column 'VERSION_NO'. (Nullable)
     */
    public void setVersionNo(java.math.BigDecimal versionNo) {
        _modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }

}
