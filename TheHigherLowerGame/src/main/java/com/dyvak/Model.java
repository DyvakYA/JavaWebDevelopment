package com.dyvak;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class Model {
    private int randomValue;
    private int value;
    private int minCompValueDiapason = 0;
    private int maxCompValueDiapason = 100;

    // The Program logic


    /**
     * in this method add valueInt with this.value
     * @param //valueInt
     * @param value
     * @param randomValue @return sum
     */

    public boolean checkResult() {
        boolean result = false;

            if (getValue() == randomValue) {
                result = true;
            } else if (getValue() > randomValue) {
                setMaxCompValueDiapason(value);
                result = false;
            } else if (getValue() < randomValue) {
                setMinCompValueDiapason(value);
                result = false;
            }

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

     public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
