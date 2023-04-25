package days.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateSample {


    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        System.out.println("date.getTime() = " + date.getTime());

        System.out.println("date = " + date);

        //  01/12/2022   DD/MM/yyyy
        //  12.30.23   MM.DD.yy

        String dateStr = "2021-08-14";

        // separate day mount and year!!!

        Date date1= new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        System.out.println(dateStr+"\t"+date1);

        ///////////////// 2. WAY
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = formatter.parse(dateStr);
        LocalDate localDate = myDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());

        ///////////////////// 3. Way
        LocalDate localDate2 = LocalDate.parse(dateStr);

        System.out.println("ll.getMonthValue() = " + localDate2.getMonthValue());
        System.out.println("localDate2.getYear() = " + localDate2.getYear());
        System.out.println("localDate2.getDayOfMonth() = " + localDate2.getDayOfMonth());


    }
}
