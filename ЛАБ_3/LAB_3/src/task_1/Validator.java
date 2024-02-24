package task_1;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that validates different data such as phone number or date
 * @author Ilya Sokol
 */
class Validator {
    static boolean isValidPhoneNumber(String phoneNumber) {
        final String PHONE_TEMPLATE = "^\\+\\d{1,3}\\d{9,12}$";
        return phoneNumber.matches(PHONE_TEMPLATE);
    }

    static boolean isValidDate(String date) {
        boolean isValid;
        String format = "dd.MM.yyyy";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        try {
            dtf.parse(date);
            isValid = true;
        } catch (DateTimeParseException e) {
            isValid = false;
        }
        return isValid;
    }
}
