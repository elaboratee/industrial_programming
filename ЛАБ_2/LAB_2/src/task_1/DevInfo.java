package task_1;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that contains date-time and developer information
 * @author Ilya Sokol
 */
class DevInfo {
    private String name = "Илья Сокол, Дмитрий Москвитин";
    private String startDateTime = "12.02.2024 15:10";
    private String endDateTime = "19.02.2024 13:35";

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = "Гость";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setStartDateTime(String startDateTime) throws IOException {
        if (isValidDateTime(startDateTime)) {
            this.startDateTime = startDateTime;
        } else {
            throw new IOException("Неверный формат даты-времени!");
        }
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setEndDateTime(String endDateTime) throws IOException {
        if (isValidDateTime(endDateTime)) {
            this.endDateTime = endDateTime;
        } else {
            throw new IOException("Неверный формат даты-времени!");
        }
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    private static boolean isValidDateTime(String dateTime) {
        String format = "dd.MM.yyyy HH:mm";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        try {
            dtf.parse(dateTime);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
