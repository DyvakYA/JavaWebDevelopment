package com.dyvak;

/**
 * Created by Dyvak on 05.11.2016.
 */
public class Constants {

    public static final String SURNAME = "Cox";
    public static final String NAME = "Oleg";
    public static final String SECOND_NAME = "Petrovich";
    public static final String NICKNAME = "Grandmaster";
    public static final String COMMENT = "Good man";
    public static final String HOME_PHONE = "8-044-222-22-22";
    public static final String MOB_PHONE = "8-044-222-22-22";
    public static final String MOB_PHONE_2 = "";
    public static final String MAIL = "Name.Sur_name@gmail.com";
    public static final String SKYPE = "Skype";

    public static final String INDEX = "8500";
    public static final String SITY = "KYIV";
    public static final String STREET = "TOLSTOGO";
    public static final String HOME_NUMBER = "5";

    // The Regex
    protected static final String STRING_REG = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$";

    protected static final String NUMBER_REG = "^[0-9]$";

    // «+38(044)555-55-55»
    protected static final String PHONE_REG = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    protected static final String PHONE_REG_PLUS_NULL = "^(((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10})?$";

    // «nick@mail.com»
    protected static final String MAIL_REG = "[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))";

    // «http://www.my-site.com»
    protected static final String URL_REG = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";

    public static final String FILE_NAME = "src/com/dyvak/UserInformation";
}
