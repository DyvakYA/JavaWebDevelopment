package com.dyvak;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

import static com.dyvak.RegexConstants.*;


/**
 * Created by User on 17.03.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){

        validString(view.SURNAME, STRING_REG);
        validString(view.NAME, STRING_REG);
        validString(view.SECOND_NAME, STRING_REG);


        view.printMessage(view.getSurname() +" "+ view.getName().charAt(0) + "."+ view.getSecondName().charAt(0) + ".");
        model.WriteUserInformation(view.getSurname() +" "+ view.getName().charAt(0) + "."+ view.getSecondName().charAt(0) + ".");

        validString(view.NICKNAME, STRING_REG);
        validString(view.COMMENT, STRING_REG);

        validEnum();

        validString(view.HOME_PHONE, PHONE_REG);
        validString(view.MOB_PHONE, PHONE_REG);
        validString(view.MOB_PHONE_2, PHONE_REG_PLUS_NULL);
        validString(view.MAIL, MAIL_REG);
        validString(view.SKYPE, STRING_REG);
        validString(view.INDEX, NUMBER_REG);
        validString(view.CITY, STRING_REG);
        validString(view.STREET, STRING_REG);
        validString(view.HOME_NUMBER, NUMBER_REG);

        view.printMessage(view.DATE + String.valueOf(new Date()));
        model.WriteUserInformation(new Date()+"\n"+ view.SEPARATOR);
    }

    private void validEnum() {
        view.printMessage(view.GROUP+(Arrays.toString(Groups.values())));
        Scanner sc = new Scanner(System.in);
        String userLine = sc.nextLine();
        model.WriteUserInformation(userLine);
    }

    private void validString(String value1, String value2 ) {
        Scanner sc = new Scanner(System.in);
        view.printMessage(value1);
        String userLine = sc.nextLine();
        checkInput(userLine, value2);
        if(value1.equals(view.SURNAME)) {
            view.setSurname(userLine);
        }if(value1.equals(view.NAME)){
            view.setName(userLine);
        }else{
            view.setSecondName(userLine);
        }
    }

    // The Utility methods
    public void checkInput(String word, String name) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(word);
        if (matcher.matches()) {
            view.printMessage(view.VALIDATION + word + view.PASSED);
            model.WriteUserInformation(word);
        }else {
            view.printMessage(view.VALIDATION + word +
                    view.NOT_PASSED);
        }
    }
}

