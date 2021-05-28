package dateAPI;

import java.time.ZoneId;

//Часовые пояса представлены типом ZoneId
public class ZoneExample {
    public static void main(String[] args) {
        // prints all available timezone ids
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());   //returns ZoneRules[currentStandardOffset=+01:00]
        System.out.println(zone2.getRules());   //returns ZoneRules[currentStandardOffset=-03:00]
    }
}
