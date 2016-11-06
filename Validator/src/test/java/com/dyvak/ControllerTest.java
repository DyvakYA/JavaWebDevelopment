package com.dyvak;

import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {

    private static Controller controller;

    @BeforeClass
    public static void init() {
        controller = new Controller(null, null);
    }

    @Test(expected = Exception.class)
    public void runGameTest(){
        controller.processUser();
    }

    @Test(expected = NullPointerException.class)
    public void checkInputTest() {
        controller.checkInput(null, null);
    }
}