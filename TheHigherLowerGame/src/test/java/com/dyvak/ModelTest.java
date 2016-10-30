package com.dyvak;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    private Model c;

    @Before
    public void setUp() throws Exception {
        c = new Model();
    }

    @Test
    public void testCheckResult() throws Exception {
        assertEquals(true, c.checkResult());
        assertEquals(false, c.checkResult());
    }
}