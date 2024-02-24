package task_1;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that validates different data such as phone number or date
 * @author Ilya Sokol
 */
class Validator {
    /**
     * Checks the phone number for compliance with the international template
     * @param phoneNumber given phone number
     * @return whether phoneNumber is valid
     */
    static boolean isValidPhoneNumber(String phoneNumber) {
        final String PHONE_TEMPLATE = "^\\+\\d{1,3}\\d{9,12}$";
        return phoneNumber.matches(PHONE_TEMPLATE);
    }

    /**
     * Checks the date for compliance with the template
     * @param date given date
     * @return whether date is valid
     */
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
