package days.day28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review_4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);//2023-04-28
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("hh mm ss yyyy_MM_dd");
        System.out.println(dateTimeFormatter1.format(localDateTime));

    }
}
