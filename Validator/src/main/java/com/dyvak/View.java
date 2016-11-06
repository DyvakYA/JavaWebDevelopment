package com.dyvak;

/**
 * View.java
 * <p>
 * It is class for showing some information.
 * It print some validation information.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 5.11.2016.
 */
public class View {
    // Text's constants
    /**
     * surname is to store the values
     * ​​of user surname.
     */
    private String surname;
    /**
     * name is to store the values ​​of user name.
     */
    private String name;
    /**
     * secondName is to store the values
     * ​​of user secondName.
     */
    private String secondName;
    /**
     * FILE_NAME is a finalize variable to
     * storage folder path for writing user information.
     */
    public static final String FILE_NAME = "src/main/java/com/dyvak/UserInformation";
    /**
     * SURNAME is a finalize variable to
     * storage message for enter surname from console.
     */
    public final String SURNAME = "Enter your surname";
    /**
     * NAME is a finalize variable to storage message
     * for enter name from console.
     */
    public final String NAME = "Enter your name";
    /**
     * SECOND_NAME is a finalize variable to storage
     * message for enter second name from console.
     */
    public final String SECOND_NAME = "Enter your second name";
    /**
     * NICKNAME is a finalize variable to storage
     * message for enter nickname from console.
     */
    public final String NICKNAME = "Enter your nickname";
    /**
     * COMMENT is a finalize variable to storage
     * message for enter comment from console.
     */
    public final String COMMENT = "Please, enter your comment ";
    /**
     * GROUP is a finalize variable to storage
     * message for enter group from console.
     */
    public final String GROUP = "Please, enter your group ";
    /**
     * HOME_PHONE is a finalize variable to storage
     * message for enter phone number from console.
     */
    public final String HOME_PHONE = "Enter home phone number";
    /**
     * MOB_PHONE is a finalize variable to storage
     * message for enter mobile phone number from console.
     */
    public final String MOB_PHONE = "Enter mobile phone number";
    /**
     * MOB_PHONE_2 is a finalize variable to storage
     * message for enter second mobile phone number from console.
     */
    public final String MOB_PHONE_2 = "Enter second mobile phone number";
    /**
     * MAIL is a finalize variable to storage
     * message for enter Mail from console.
     */
    public final String MAIL = "Enter your Mail";
    /**
     * SKYPE is a finalize variable to storage
     * message for enter Skype from console.
     */
    public final String SKYPE = "Enter your Skype";
    /**
     * INDEX is a finalize variable to storage
     * message for enter index from console.
     */
    public final String INDEX = "Enter your index";
    /**
     * CITY is a finalize variable to storage
     * message for enter city from console.
     */
    public final String CITY = "Enter your city";
    /**
     * STREET is a finalize variable to storage
     * message for enter street from console.
     */
    public final String STREET = "Enter your street";
    /**
     * HOME_NUMBER is a finalize variable to
     * storage message for enter home number from console.
     */
    public final String HOME_NUMBER = "Enter your home number";
    /**
     * VALIDATION is a finalize variable to storage
     * message for print "Validation for ".
     */
    public final String VALIDATION = "Validation for ";
    /**
     * PASSED is a finalize variable to storage
     * message for print message when validation was passed.
     */
    public final String PASSED = " passed.";
    /**
     * NOT_PASSED is a finalize variable to storage
     * message for print message when validation was not passed.
     */
    public final String NOT_PASSED = " not passed.";
    /**
     * DATE is a finalize variable to storage
     * message for print message about date of create note.
     */
    public final String DATE = "Date of create note ";
    /**
     * SEPARATOR is a finalize variable to storage
     * message for better visualisation.
     */
    public final String SEPARATOR = "--------------------------------------------------";

    /**
     * Methods for showing information on different threads
     * (not only out). If we will need to refactor output,
     * we can do this simple in one line.
     *
     * @param message string sequence, which we will need to print
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    //Setters and getters
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

}
