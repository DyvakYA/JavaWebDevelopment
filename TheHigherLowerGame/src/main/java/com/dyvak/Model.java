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
    private int compValue;
    private int userValue;
    private int minCompValueDiapason = 0;
    private int maxCompValueDiapason = 100;



    /**
     * class for equals 2 parameter
     * 1-userValue - value entered with the keyboard
     * 2-compValue - random value which put forth a computer
     * @return public boolean checkResult()
     */
    // The Program logic
    public boolean checkResult() {
        boolean result = false;

            if (getUserValue() == compValue) {
                result = true;
            } else if (getUserValue() > compValue) {
                setMaxCompValueDiapason(userValue);
                result = false;
            } else if (getUserValue() < compValue) {
                setMinCompValueDiapason(userValue);
                result = false;
            }

        return result;
    }


    public void compValue(){
        int randomValue = (int) (Math.random()* 100);
        setCompValue(randomValue);
    }

    /**
     * Getters and Setters
     * @return public int getCompValue()
     */

    public int getCompValue() {
        return compValue;
    }

    public void setCompValue(int compValue) {
        this.compValue = compValue;
    }

    public int getMinCompValueDiapason() {
        return minCompValueDiapason;
    }

    public void setMinCompValueDiapason(int minCompValueDiapason) {
        this.minCompValueDiapason = minCompValueDiapason;
    }

    public int getMaxCompValueDiapason() {
        return maxCompValueDiapason;
    }

    public void setMaxCompValueDiapason(int maxCompValueDiapason) {
        this.maxCompValueDiapason = maxCompValueDiapason;
    }

     public int getUserValue() {
        return userValue;
    }

    public void setUserValue(int userValue) {
        this.userValue = userValue;
    }

}
