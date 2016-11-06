package com.dyvak;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class ModelTest {

    private Model testModel;

    @Before
    public void setUp() throws Exception {
        testModel = new Model();
    }

    @Test(expected = Exception.class)
    public void testDoTask() throws IOException {
       testModel.doTask(null, null);

    }

    @Test(expected = Exception.class)
    public void testWriteUserInformation() {
        testModel.writeUserInformation(null);
        assertNull(null);
    }

    @Test(expected = FileNotFoundException.class)
    public void writeUserInformation() throws IOException {
        FileWriter printWriter = new FileWriter("qweqweqwe", true);
        printWriter.write("123123");
    }

    @Test(expected = AssertionError.class)
    public void testNull() throws IOException {
        FileWriter printWriter = new FileWriter("qweqweqwe", true);
        assertNotNull(printWriter);
    }
}

