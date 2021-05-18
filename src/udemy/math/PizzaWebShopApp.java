package udemy.math;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoUnit;

public class PizzaWebShopApp {
    public static void main(String[] args) {
        LocalTime openingHour = LocalTime.of(11, 0);
        LocalTime closingTime = LocalTime.of(22, 0);
        System.out.println("the restaurant is open " + openingHour + " to " + closingTime + " on every day.");

        LocalDate orderDate = LocalDate.now().minusDays(3);

        System.out.println("the pizza was ordered on " + orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order : " + orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1, 10);
        System.out.println("Delivery time: " + deliveryTime);

        LocalDateTime estimateDeliveryDateTime = orderDateTime.plusHours(deliveryTime.getHour())
                .plusMinutes(deliveryTime.getMinute());

        System.out.println("The estimated delivery time : " + estimateDeliveryDateTime);

        LocalDateTime realDeliveryDateTime = orderDateTime.plusMinutes(90);

        System.out.println("The real delivery time was: " + realDeliveryDateTime);
        long diffBetweenEstAndReal = ChronoUnit.MINUTES.between(estimateDeliveryDateTime, realDeliveryDateTime);

        System.out.println("diff: " + diffBetweenEstAndReal + " in minutes");


        if (estimateDeliveryDateTime.isBefore(realDeliveryDateTime)) {
            System.out.println("The pizza didn't  arrived in time ");
        } else {
            System.out.println("The pizza arrived in time");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        System.out.println("based on hij calendar " + hijrahDate);

        ZonedDateTime zonedDateTime = orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        System.out.println("The time I ordered pizza was " + zonedDateTime + " in Budapest");

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("The time I ordered pizza was " + zonedDateTime1 + " in Tokyo");


        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }


    }
}
