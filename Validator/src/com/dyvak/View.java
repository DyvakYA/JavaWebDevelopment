package com.dyvak;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants

    public  String surname;
    public  String name;
    public  String secondName;

    public static final String FILE_NAME = "src/com/dyvak/UserInformation";

    public final String SURNAME = "Enter your surname";
    public final String NAME = "Enter your name";
    public final String SECOND_NAME = "Enter your second name";

    public final String NICKNAME = "Enter your nickname";
    public final String COMMENT = "Please, enter your comment ";

    public final String GROUP = "Please, enter your group ";

    public final String HOME_PHONE = "Enter home phone number";
    public final String MOB_PHONE = "Enter mobile phone number";
    public final String MOB_PHONE_2 = "Enter second mobile phone number";
    public final String MAIL = "Enter your Mail";
    public final String SKYPE = "Enter your Skype";

    public final String INDEX = "Enter your index";
    public final String CITY = "Enter your city";
    public final String STREET = "Enter your street";
    public final String HOME_NUMBER = "Enter your home number";

    public final String VALIDATION = "Validation for ";
    public final String PASSED = " passed.";
    public final String NOT_PASSED = " not passed.";
    public final String DATE = "Date of create note ";
    public final String SEPARATOR = "--------------------------------------------------";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

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
