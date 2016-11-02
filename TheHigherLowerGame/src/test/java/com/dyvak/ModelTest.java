package com.dyvak;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModelTest {

    public static final int min = 0;
    public static final int max = 100;

    private Model testModel;

    @Before
    public void setUp() throws Exception {
        testModel = new Model();
    }

        @Test
    public void testCheckDiapasonValueMax() throws Exception {
        boolean res = testModel.checkValue(testModel.getMaxCompValueDiapason());
        if (res != true) Assert.fail();
    }

    @Test
    public void testCheckDiapasonValueMin() throws Exception {
        boolean res = testModel.checkValue(testModel.getMinCompValueDiapason());
        if (res != true) Assert.fail();
    }

    @Test
    public void testCheckDiapasonValueMaxMore() throws Exception {
        boolean res = testModel.checkValue(testModel.getMaxCompValueDiapason()+1);
        if (res != false) Assert.fail();
    }

    @Test
    public void testCheckDiapasonValueMinMore() throws Exception {
        boolean res = testModel.checkValue(testModel.getMinCompValueDiapason()+1);
        if (res != false) Assert.fail();
    }

    @Test
    public void generateValueTest(){
        int value = testModel.getCompValue();
        assertTrue(value >= testModel.getMinCompValueDiapason()
                && value <= testModel.getMaxCompValueDiapason());
    }

    @Test
    public void isCorrectValueTestIncorrectValue(){
        assertFalse(testModel.checkValue(min - 1));
    }

    @Test
    public void isCorrectValueTestCorrectValue(){
        assertTrue(testModel.checkValue(testModel.getCompValue()));
    }
}