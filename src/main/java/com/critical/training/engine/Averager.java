package com.critical.training.engine;

import com.critical.training.model.CalculateBase;

public class Averager extends CalculateBase implements MathProcessing {
    @Override
    public void calculate() {
        double value = getLeftVal() % getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "avg";
    }

    @Override
    public char getSymbol() {
        return '%';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }


}
