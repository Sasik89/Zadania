package Zadania.czasWjavie;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime myLocalTime = LocalTime.of(15, 25, 59);
        System.out.println(myLocalTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate myLocalDate = LocalDate.of(2023, Month.JANUARY, 20);
        LocalDate myLocalDate2 = LocalDate.of(2023, 1, 20);

        System.out.println(myLocalDate);
        System.out.println(myLocalDate2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime myLocalDateTime = LocalDateTime.of(2024, 7, 14, 15, 33, 50);
        System.out.println(myLocalDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.of(2020, 10, 15),
                LocalTime.of(15, 30, 50));


        ZonedDateTime myZoneDateTime = ZonedDateTime.of(
                LocalDate.of(2022, 12,15),
                LocalTime.of(14,44,40),
                ZoneId.of("Europe/Paris")
        );
        System.out.println(myLocalTime);

        Instant instant = myZoneDateTime.toInstant();
        System.out.println(instant);  //instanty służą do wyliczania czasu
        Instant instant1 = Instant.now();
        System.out.println(instant1);

        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration);
        System.out.println(duration.abs());
        System.out.println(duration.getSeconds());
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());

        LocalDateTime localDateTime2 = LocalDateTime.now();
        LocalDateTime localDateTime3 = localDateTime2.plusHours(44);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime.minusHours(55);
        LocalDateTime localDateTime5 = localDateTime.minusMonths(1);
        System.out.println(localDateTime4);
        System.out.println(localDateTime5);

        String date2 = "07-07-2022 15:34:55";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime parseLocalDateTime = LocalDateTime.parse(date2, formatter);

        System.out.println(parseLocalDateTime);

        String date3 = "12/10-2022 15/23:20";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd-yyyy HH/mm:ss");
        LocalDateTime localDateTime6 = LocalDateTime.parse(date3, formatter2);
        System.out.println(localDateTime6);

        LocalDateTime localDateTime7 = LocalDateTime.now();
        System.out.println(localDateTime7.format(formatter2));

    }
}
