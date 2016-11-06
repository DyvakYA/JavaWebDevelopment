package com.dyvak;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Model.java
 * <p>
 * It is class of business logic.
 * It makes validation(@Validator)
 * and write in file after validation.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 5.11.2016.
 */
public class Model {

    /**
     * class for writing user information in file
     * The user enters information from the keyboard,
     * the information is validated
     * in the class of the controller,
     * and then passed to the class model
     * and written in the file storage
     *
     * @param message transmits the value to write
     *
     *
     * performed checks on exception
     */
    // The Program logic
    public void writeUserInformation(String message) {

        try (FileWriter printWriter = new FileWriter(View.FILE_NAME, true)) {
            doTask(printWriter, message);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * class for writing user information in file and closing the FileWriter writer.
     *
     * @param message transmits the value to write in the file.
     * @param writer down from @writeUserInformation. FileWriter(File file) This constructor creates a FileWriter object given a File object.
     * @throws IOException Exception for IO
     */
    protected void doTask(FileWriter writer, String message) throws IOException {
        writer.write(message + "\n");
        writer.close();
    }
}
