/*
 * Copyright (c) 2005 ATL Systems incorporated.
 * All rights reserved.
 */
package hivemind.sample.impl;

import hivemind.sample.Adder;
import hivemind.sample.Calculator;
import hivemind.sample.Divider;
import hivemind.sample.Multiplier;
import hivemind.sample.Subtracter;

/**
 * 
 * @author funato
 * @createted 2005/04/19
 */
public class CalculatorImpl implements Calculator {
    private Adder addr;
    private Subtracter subtracter;
    private Divider divider;
    private Multiplier multiplier;
    
    /**
     * @return addr を戻します.
     */
    public final Adder getAddr() {
        return addr;
    }
    /**
     * @param addr addr を設定.
     */
    public final void setAddr(Adder addr) {
        this.addr = addr;
    }
    /**
     * @return divider を戻します.
     */
    public final Divider getDivider() {
        return divider;
    }
    /**
     * @param divider divider を設定.
     */
    public final void setDivider(Divider divider) {
        this.divider = divider;
    }
    /**
     * @return multiplier を戻します.
     */
    public final Multiplier getMultiplier() {
        return multiplier;
    }
    /**
     * @param multiplier multiplier を設定.
     */
    public final void setMultiplier(Multiplier multiplier) {
        this.multiplier = multiplier;
    }
    /**
     * @return subtracter を戻します.
     */
    public final Subtracter getSubtracter() {
        return subtracter;
    }
    /**
     * @param subtracter subtracter を設定.
     */
    public final void setSubtracter(Subtracter subtracter) {
        this.subtracter = subtracter;
    }
/**
     * @see hivemind.sample.Adder#add(int, int)
     */
    public int add(int arg0, int arg1) {
        return addr.add(arg0, arg1);
    }

    /**
     * @see hivemind.sample.Multiplier#multiply(int, int)
     */
    public int multiply(int arg0, int arg1) {
        return multiplier.multiply(arg0, arg1);
    }

    /**
     * @see hivemind.sample.Divider#divide(int, int)
     */
    public int divide(int arg0, int arg1) {
        return divider.divide(arg0, arg1);
    }

    /**
     * @see hivemind.sample.Subtracter#subtract(int, int)
     */
    public int subtract(int arg0, int arg1) {
        return subtracter.subtract(arg0, arg1);
    }
}
