package jp.co.np.p2netex.sample1.allcommon.cbean.sqlclause;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * @author DBFlute(AutoGenerator)
 */
public class Sample1OrderByClause implements java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected List<Sample1OrderByElement> _orderByList = new ArrayList<Sample1OrderByElement>();

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public Sample1OrderByClause() {
    }

    // =====================================================================================
    //                                                                              Behavior
    //                                                                              ========
    /**
     * Add order-by element.
     * @param orderByElement Order-by element. (NotNull)
     */
    public void addOrderByElement(Sample1OrderByElement orderByElement) {
        _orderByList.add(orderByElement);
    }

    /**
     * Insert first order-by element .
     * @param orderByElement Order-by element. (NotNull)
     */
    public void insertFirstOrderByElement(Sample1OrderByElement orderByElement) {
        _orderByList.add(0, orderByElement);
    }

    public void reverseAll() {
        for (Iterator<Sample1OrderByElement> ite = _orderByList.iterator(); ite.hasNext(); ) {
            ite.next().reverse();
        }
    }

    public void exchangeFirstOrderByElementForLastOne() {
        if (_orderByList.size() > 1) {
            final Sample1OrderByElement first = _orderByList.get(0);
            final Sample1OrderByElement last = _orderByList.get(_orderByList.size() - 1);
            _orderByList.set(0, last);
            _orderByList.set(_orderByList.size() - 1, first);
        }
    }
	
	public void addNullsFirstToPreviousOrderByElement(OrderByNullsSetupper filter) {
	    if (_orderByList.isEmpty()) {
		    return;
		}
		final Sample1OrderByElement last = _orderByList.get(_orderByList.size() - 1);
		last.setOrderByNullsSetupper(filter, true);
	}
	
	public void addNullsLastToPreviousOrderByElement(OrderByNullsSetupper filter) {
	    if (_orderByList.isEmpty()) {
		    return;
		}
		final Sample1OrderByElement last = _orderByList.get(_orderByList.size() - 1);
		last.setOrderByNullsSetupper(filter, false);
	}
	
	public static interface OrderByNullsSetupper {
        public String setup(String columnName, String orderByElementClause, boolean nullsFirst);
	}

    public List<Sample1OrderByElement> getOrderByList() {
        return _orderByList;
    }

    public String getOrderByClause() {
	    return getOrderByClause(null);
    }

    public String getOrderByClause(Map<String, String> selectClauseRealColumnAliasMap) {
        if (_orderByList.isEmpty()) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        final String delimiter = ", ";
        for (final Iterator<Sample1OrderByElement> ite = _orderByList.iterator(); ite.hasNext(); ) {
            final Sample1OrderByElement element = ite.next();
            sb.append(delimiter);
			if (selectClauseRealColumnAliasMap != null) {
			    sb.append(element.getElementClause(selectClauseRealColumnAliasMap));
			} else {
			    sb.append(element.getElementClause());
			}
        }
        sb.delete(0, delimiter.length()).insert(0, "order by ");
        return sb.toString();
    }

    public boolean isSameOrderByColumn(String orderByProperty) {
        final List<String> orderByList = new ArrayList<String>();
        {
            final StringTokenizer st = new StringTokenizer(orderByProperty, "/");
            while (st.hasMoreElements()) {
                orderByList.add(st.nextToken());
            }
        }
        if (_orderByList.size() != orderByList.size()) {
            return false;
        }
        int count = 0;
        for (final Iterator<String> ite = orderByList.iterator(); ite.hasNext(); ) {
            final String columnFullName = ite.next();
            final Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(count);
            if (!element.getColumnFullName().equals(columnFullName)) {
                return false;
            }
            count++;
        }
        return true;
    }

    // =====================================================================================
    //                                                                         First Element
    //                                                                         =============
    public boolean isFirstElementAsc() {
        if (isEmpty()) {
            String msg = "This order-by clause is empty: " + toString();
            throw new IllegalStateException(msg);
        }
        final Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(0);
        return element.isAsc();
    }

    public boolean isFirstElementDesc() {
        return !isFirstElementAsc();
    }

    public boolean isSameAsFirstElementAliasName(String expectedAliasName) {
        if (isEmpty()) {
            String msg = "This order-by clause is empty: " + toString();
            throw new RuntimeException(msg);
        }
        Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(0);
        String actualAliasName = element.getAliasName();
        if (actualAliasName != null && expectedAliasName != null) {
            return actualAliasName.equalsIgnoreCase(expectedAliasName);
        } else {
            return false;
        }
    }

    /**
     * @param expectedColumnName Expected column-name. (Nullable)
     * @return Determination.
     */
    public boolean isSameAsFirstElementColumnName(String expectedColumnName) {
        if (isEmpty()) {
            String msg = "This order-by clause is empty: " + toString();
            throw new RuntimeException(msg);
        }
        Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(0);
        String actualColumnName = element.getColumnName();
        if (actualColumnName != null && expectedColumnName != null) {
            return actualColumnName.equalsIgnoreCase(expectedColumnName);
        } else {
            return false;
        }
    }

    /**
     * @param expectedAliasName Expected alias-name. (Nullable)
     * @return Determination.
     */
    public boolean isSameAsFirstElementRegisteredAliasName(String expectedAliasName) {
        if (isEmpty()) {
            String msg = "This order-by clause is empty: " + toString();
            throw new RuntimeException(msg);
        }
        Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(0);
        String actualAliasName = element.getRegisteredAliasName();
        if (actualAliasName != null && expectedAliasName != null) {
            return actualAliasName.equalsIgnoreCase(expectedAliasName);
        } else {
            return false;
        }
    }

    /**
     * @param expectedColumnName Expected column-name. (Nullable)
     * @return Determination.
     */
    public boolean isSameAsFirstElementRegisteredColumnName(String expectedColumnName) {
        if (isEmpty()) {
            String msg = "This order-by clause is empty: " + toString();
            throw new RuntimeException(msg);
        }
        Sample1OrderByElement element = (Sample1OrderByElement)_orderByList.get(0);
        String actualColumnName = element.getRegisteredColumnName();
        if (actualColumnName != null && expectedColumnName != null) {
            return actualColumnName.equalsIgnoreCase(expectedColumnName);
        } else {
            return false;
        }
    }

    // =====================================================================================
    //                                                                      Delegate of List
    //                                                                      ================
    /**
     * Is empty?
     * @return Determination.
     */
    public boolean isEmpty() {
        return _orderByList.isEmpty();
    }

    /**
     * Get iterator of order-by list.
     * @return Determination.
     */
    public java.util.Iterator<Sample1OrderByElement> iterator() {
        return _orderByList.iterator();
    }

    /**
     * Clear order-by list.
     */
    public void clear() {
        _orderByList.clear();
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    /**
     * This method overrides the method that is declared at super.
     * @return View-string of all-columns value.
     */
    public String toString() {
        return _orderByList.toString();
    }
}
