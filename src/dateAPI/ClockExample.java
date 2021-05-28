package dateAPI;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockExample {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();   //instead of System.currentTimeMillis())
        System.out.println("millis = " + millis);

        //to get legacy Date object:
        Instant instant = clock.instant();
        Date date = Date.from(instant);
    }
}
