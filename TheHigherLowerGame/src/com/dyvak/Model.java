package com.dyvak;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class Model {
    private int value;
    private int minCommonValueDiapason = 0;
    private int maxCommonValueDiapason = 100;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     *
     * @param valueInt
     * @return sum
     */

    public boolean checkResult(int valueInt, int commonValue) {
        boolean result = false;
        while (valueInt != commonValue) {

            if (valueInt == commonValue) {
                result = true;
            } else if (valueInt > commonValue) {
                setMaxCommonValueDiapason(valueInt);
                result = false;
            } else if (valueInt < commonValue) {
                setMinCommonValueDiapason(valueInt);
                result = false;
            }//else break;
        }
        return result;
    }

    public int commonValue(){

        int commonValue = (int) (Math.random()* minCommonValueDiapason+(maxCommonValueDiapason-minCommonValueDiapason));
        return commonValue;
    }

    public int getMinCommonValueDiapason() {
        return minCommonValueDiapason;
    }

    public void setMinCommonValueDiapason(int minCommonValueDiapason) {
        this.minCommonValueDiapason = minCommonValueDiapason;
    }

    public int getMaxCommonValueDiapason() {
        return maxCommonValueDiapason;
    }

    public void setMaxCommonValueDiapason(int maxCommonValueDiapason) {
        this.maxCommonValueDiapason = maxCommonValueDiapason;
    }

    public int getValue() {


        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
