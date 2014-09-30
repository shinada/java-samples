package jp.co.np.p2netex.sample2.allcommon.cbean.coption;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import jp.co.np.p2netex.sample2.allcommon.cbean.coption.parts.local.Sample2JapaneseOptionPartsAgent;

/**
 * The class of like-search-option.
 * @author DBFlute(AutoGenerator)
 */
public class Sample2LikeSearchOption extends Sample2SimpleStringOption {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final String LIKE_PREFIX = "prefix";
    protected static final String LIKE_SUFFIX = "suffix";
    protected static final String LIKE_CONTAIN = "contain";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _like;
    protected String _escape;
    protected boolean _asOrSplit;
    protected List<LikeAsOrCallback> _likeAsOrCallbackList;

    // ===================================================================================
    //                                                                         Rear Option
    //                                                                         ===========
    public String getRearOption() {
        if (_escape == null || _escape.trim().length() == 0) {
            return "";
        }
        return " escape '" + _escape + "'";
    }

    // ===================================================================================
    //                                                                                AsOr
    //                                                                                ====
    /** @deprecated */
    public static interface LikeAsOrCallback {
        public String getAdditionalTargetPropertyName();
        public String filterValue(String currentValue);
        public Sample2LikeSearchOption filterOption(Sample2LikeSearchOption optionDeepCopyWithoutCallback);
    }

	/** @deprecated */
    public static abstract class DefaultLikeAsOrCallback implements LikeAsOrCallback {
        public String filterValue(String currentValue) {
            return currentValue;
        }
        public Sample2LikeSearchOption filterOption(Sample2LikeSearchOption optionDeepCopyWithoutCallback) {
            return optionDeepCopyWithoutCallback;
        }
    }

    public boolean hasLikeAsOrCallback() {
        return _likeAsOrCallbackList != null && !_likeAsOrCallbackList.isEmpty();
    }
	
    public List<LikeAsOrCallback> getLikeAsOrCallbackList() {
		if (_likeAsOrCallbackList == null) {
		    _likeAsOrCallbackList = new ArrayList<LikeAsOrCallback>();
		}
        return _likeAsOrCallbackList;
    }

	/** 
     * @param likeAsOrCallback Callback.
     * @deprecated
     */
    public void addLikeAsOrCallback(LikeAsOrCallback likeAsOrCallback) {
        getLikeAsOrCallbackList().add(likeAsOrCallback);
    }

    public void clearLikeAsOrCallback() {
        getLikeAsOrCallbackList().clear();
    }

    // ===================================================================================
    //                                                                                Like
    //                                                                                ====
    public Sample2LikeSearchOption likePrefix() {
        _like = LIKE_PREFIX;
        return this;
    }
    public Sample2LikeSearchOption likeSuffix() {
        _like = LIKE_SUFFIX;
        return this;
    }
    public Sample2LikeSearchOption likeContain() {
        _like = LIKE_CONTAIN;
        return this;
    }

    // ===================================================================================
    //                                                                              Escape
    //                                                                              ======
    public Sample2LikeSearchOption escapeByPipeLine() {
        _escape = "|";
        return this;
    }

    public Sample2LikeSearchOption escapeByAtMark() {
        _escape = "@";
        return this;
    }

    public Sample2LikeSearchOption escapeBySlash() {
        _escape = "/";
        return this;
    }

    public Sample2LikeSearchOption escapeByBackSlash() {
        _escape = "\\";
        return this;
    }

    // ===================================================================================
    //                                                                               Split
    //                                                                               =====
    public Sample2LikeSearchOption splitBySpace() {
        return (Sample2LikeSearchOption)doSplitBySpace();
    }

    public Sample2LikeSearchOption splitBySpace(int splitLimitCount) {
        return (Sample2LikeSearchOption)doSplitBySpace(splitLimitCount);
    }

    public Sample2LikeSearchOption splitBySpaceContainsDoubleByte() {
        return (Sample2LikeSearchOption)doSplitBySpaceContainsDoubleByte();
    }

    public Sample2LikeSearchOption splitBySpaceContainsDoubleByte(int splitLimitCount) {
        return (Sample2LikeSearchOption)doSplitBySpaceContainsDoubleByte(splitLimitCount);
    }

    public Sample2LikeSearchOption splitByPipeLine() {
        return (Sample2LikeSearchOption)doSplitByPipeLine();
    }

    public Sample2LikeSearchOption splitByPipeLine(int splitLimitCount) {
        return (Sample2LikeSearchOption)doSplitByPipeLine(splitLimitCount);
    }
	
	public Sample2LikeSearchOption asOrSplit() {
	    _asOrSplit = true;
		return this;
	}
	
	public boolean isAsOrSplit() {
	    return _asOrSplit;
	}

    // ===================================================================================
    //                                                                 To Upper/Lower Case
    //                                                                 ===================
    public Sample2LikeSearchOption toUpperCase() {
        return (Sample2LikeSearchOption)doToUpperCase();
    }

    public Sample2LikeSearchOption toLowerCase() {
        return (Sample2LikeSearchOption)doToLowerCase();
    }

    // ===================================================================================
    //                                                                      To Single Byte
    //                                                                      ==============
    public Sample2LikeSearchOption toSingleByteSpace() {
        return (Sample2LikeSearchOption)doToSingleByteSpace();
    }

    public Sample2LikeSearchOption toSingleByteAlphabetNumber() {
        return (Sample2LikeSearchOption)doToSingleByteAlphabetNumber();
    }

    public Sample2LikeSearchOption toSingleByteAlphabetNumberMark() {
        return (Sample2LikeSearchOption)doToSingleByteAlphabetNumberMark();
    }

    // ===================================================================================
    //                                                                      To Double Byte
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Japanese
    //                                                                            ========
    public Sample2JapaneseOptionPartsAgent localJapanese() {
        return doLocalJapanese();
    }

    // ===================================================================================
    //                                                                          Real Value
    //                                                                          ==========
    public String generateRealValue(String value) {
        value = super.generateRealValue(value);

        // Escape
        if (_escape != null && _escape.trim().length() != 0) {
            String tmp = replace(value, _escape, _escape + _escape);
            tmp = replace(tmp, "%", _escape + "%");
            tmp = replace(tmp, "_", _escape + "_");
            value = tmp;
        }
        final String wildCard = "%";
        if (_like == null || _like.trim().length() == 0) {
            return value;
        } else if (_like.equals(LIKE_PREFIX)) {
            return value + wildCard;
        } else if (_like.equals(LIKE_SUFFIX)) {
            return wildCard + value;
        } else if (_like.equals(LIKE_CONTAIN)) {
            return wildCard + value + wildCard;
        } else {
            String msg = "The like was wrong string: " + _like;
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                                            DeepCopy
    //                                                                            ========
    public Object createDeepCopy() {
        final Sample2LikeSearchOption deepCopy = (Sample2LikeSearchOption)super.createDeepCopy();
        deepCopy._like = _like;
        deepCopy._escape = _escape;
		if (hasLikeAsOrCallback()) {
            for (Iterator<LikeAsOrCallback> ite = _likeAsOrCallbackList.iterator(); ite.hasNext(); ) {
                deepCopy.addLikeAsOrCallback((LikeAsOrCallback)ite.next());
            }
		}
        return deepCopy;
    }

    protected Sample2SimpleStringOption newDeepCopyInstance() {
        return new Sample2LikeSearchOption();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "like=" + _like + ", escape=" + _escape + ", split=" + isSplit() + ", asOrSplit = " + _asOrSplit;  
    }
}
