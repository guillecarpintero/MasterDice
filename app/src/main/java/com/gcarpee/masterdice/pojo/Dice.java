package com.gcarpee.masterdice.pojo;

public class Dice {

    private Integer minNumber;
    private Integer maxNumber;
    private Integer sidesNumber;

    public Dice(Integer minNumber, Integer maxNumber, Integer sidesNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.sidesNumber = sidesNumber;
    }

    //.....................................................................................GETTERS
    public Integer getMinNumber() {
        return minNumber;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public Integer getSidesNumber() {
        return sidesNumber;
    }

    //.....................................................................................SETTERS

    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setSidesNumber(Integer sidesNumber) {
        this.sidesNumber = sidesNumber;
    }
}