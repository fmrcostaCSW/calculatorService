package com.critical.training.model;

import javax.xml.bind.annotation.XmlRootElement;


public abstract class CalculateBase {


    private double leftVal;
    private double rightVal;

    private double result;
    private long endTime;
    private long totalTime;



    public double getLeftVal() { return leftVal;}
    public void setLeftVal (double leftVal) {this.leftVal = leftVal;}

    public double getRightVal() { return rightVal;}
    public void setRightVal (double rightVal) {this.rightVal = rightVal;}

    public double getResult() { return result;}
    public void setResult (double result) {this.result = result;}

    public double getEndtTime() { return endTime;}
    public void setEndTime (long endTime) {this.endTime = endTime;}

    public double getTotalTime() { return totalTime;}
    public void setTotalTime (long totalTime) {this.totalTime = totalTime;}

    //    Class Constructors

    public CalculateBase(){}

    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }
    public CalculateBase(long startTime, double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }
    public abstract void calculate();
}
