package com.critical.training.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class query {

    private String operation;
    private double leftVal;
    private double rightVal;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation=operation;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal=leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal=rightVal;
    }


    public query() {
        this.operation=operation;
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }
    public query(String operation, double leftVal, double rightVal) {
        this.operation=operation;
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }
}
