package com.dyvak;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        doMatch(Constants.SURNAME, Constants.STRING_REG);
        doMatch(Constants.NAME, Constants.STRING_REG);
        doMatch(Constants.SECOND_NAME, Constants.STRING_REG);
        view.printMessage(Constants.SURNAME +" "+ Constants.NAME.charAt(0) + "."+Constants.SECOND_NAME.charAt(0) + ".");
        model.WriteUserInformation(Constants.SURNAME +" "+ Constants.NAME.charAt(0) + "."+Constants.SECOND_NAME.charAt(0) + ".");
        doMatch(Constants.NICKNAME, Constants.STRING_REG);
        doMatch(Constants.COMMENT, Constants.STRING_REG);

        model.WriteUserInformation(String.valueOf(Groups.TM41));

        doMatch(Constants.HOME_PHONE, Constants.PHONE_REG);
        doMatch(Constants.MOB_PHONE, Constants.PHONE_REG);
        doMatch(Constants.MOB_PHONE_2, Constants.PHONE_REG_PLUS_NULL);
        doMatch(Constants.MAIL, Constants.MAIL_REG);
        doMatch(Constants.SKYPE, Constants.STRING_REG);

        doMatch(Constants.INDEX, Constants.NUMBER_REG);
        doMatch(Constants.SITY, Constants.STRING_REG);
        doMatch(Constants.STREET, Constants.STRING_REG);
        doMatch(Constants.HOME_NUMBER, Constants.NUMBER_REG);

        view.printMessage(String.valueOf(new Date()));

        model.WriteUserInformation(new Date()+"\n"+View.SEPARATOR);

    }

    // The Utility methods
    public void doMatch(String word, String name) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(word);
        if (matcher.matches()) {
            view.printMessage(View.VALIDATION + word + View.PASSED);
            model.WriteUserInformation(word);
        }else {
            view.printMessage(View.VALIDATION + word +
                    View.NOT_PASSED);
        }
    }
}

