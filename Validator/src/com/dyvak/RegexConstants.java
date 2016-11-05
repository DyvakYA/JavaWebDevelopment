package com.dyvak;

/**
 * Created by Dyvak on 05.11.2016.
 */
public class RegexConstants {

    // The Regex
    protected static final String STRING_REG = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$";

    protected static final String NUMBER_REG = "^[0-9-_\\.]{1,20}$";

    // «+38(044)555-55-55»
    protected static final String PHONE_REG = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    protected static final String PHONE_REG_PLUS_NULL = "^(((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10})?$";

    // «nick@mail.com»
    protected static final String MAIL_REG = "[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))";

    // «http://www.my-site.com»
    protected static  final String URL_REG = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";

}
