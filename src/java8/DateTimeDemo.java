package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());

        System.out.println(localDate.getEra());
        System.out.println(localDate.getChronology());

        ZoneId zoneId=ZoneId.of("Asia/Karachi");

        LocalDate localDate1=LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime=LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDate2=LocalDateTime.of(2021,12,3,12,2);
        LocalDateTime localDate3=LocalDateTime.of(2022,12,3,12,2);

        Duration duration=Duration.between(localDate2,localDate3);
        System.out.println(duration.toDays());

        LocalDate localDate4=LocalDate.of(2020,1,1);
        LocalDate localDate5=LocalDate.now();

        Period period=Period.between(localDate4,localDate5);
        System.out.println(period);




    }
}
