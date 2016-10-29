package com.dyvak;


/**
 * Created by Dyvak on 29.10.2016.
 */
public class Model {
    private int randomValue;
    private int value;
    private int minCommonValueDiapason = 0;
    private int maxCommonValueDiapason = 100;

    // The Program logic

    /**
     * in this method add valueInt with this.value
     *
     * @param //valueInt
     * @return sum
     */

    public int checkResult() {
        int result=0;

            if (getValue() == randomValue) {
                result = 1;
            } else if (getValue() > randomValue) {
                setMaxCommonValueDiapason(value);
                result = 0;
            } else if (getValue() < randomValue) {
                setMinCommonValueDiapason(value);
                result = 0;
            }//else break;
        System.out.println(result);
        System.out.println(getRandomValue());
        System.out.println(getValue());
        return result;
    }



    public void randomValue(){

        int randomValue = (int) (Math.random()* 100);
        setRandomValue(randomValue);
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(int randomValue) {
        this.randomValue = randomValue;
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
