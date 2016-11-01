package com.dyvak;

/**
 * Model.java
 * <p>
 * It is class of business logic.
 * It makes game "Guess the number".
 * Main functions is to create correct limits,
 * to generate pseudo-random number and to verify
 * it with input value.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 29.10.2016.
 */
public class Model {
    /**
     *
     */
    private int compValue;
    /**
     *
     */
    private int minCompValueDiapason;

    public void setMaxCompValueDiapason(int maxCompValueDiapason) {
        this.maxCompValueDiapason = maxCompValueDiapason;
    }

    public void setMinCompValueDiapason(int minCompValueDiapason) {
        this.minCompValueDiapason = minCompValueDiapason;
    }

    /**
     *
     */
    private int maxCompValueDiapason;

    /**
     * class for equals 2 parameter
     * 1-value - value entered with the keyboard from console
     * 2-compValue - random value which put forth a computer
     *
     * @param value
     * @return public boolean checkValue()
     *
     * /**
     * checking equals value from console and compValue,
     * change diapasons and
     * return boolean value for determine win or lose
     */
    // The Program logic
    public boolean checkValue(int value) {

        if (value == compValue) {
            return true;
        } else if (value > compValue) {
            maxCompValueDiapason = value;
        } else {
            minCompValueDiapason = value;
        }
        return false;
    }

    /**
     * @param minCompValueDiapason
     * @param maxCompValueDiapason
     */
    //from version 1.0 where user can not enter diapason parameters
    public void setValueDiapason(int minCompValueDiapason, int maxCompValueDiapason) {
        this.minCompValueDiapason = minCompValueDiapason; // check
        this.maxCompValueDiapason = maxCompValueDiapason;
    }

    public void setCompValue() {
        compValue = (int) Math.ceil(Math.random() *
                (maxCompValueDiapason - minCompValueDiapason - 1) + minCompValueDiapason);
    }

    /**
     * Getters and Setters
     *
     * @return public int getCompValue()
     */
    public int getCompValue() {
        return compValue;
    }

    public int getMinCompValueDiapason() {
        return minCompValueDiapason;
    }

    public int getMaxCompValueDiapason() {
        return maxCompValueDiapason;
    }
}
