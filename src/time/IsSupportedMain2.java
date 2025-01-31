package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("second = " + minute);



        LocalDate now1 = LocalDate.now();
        boolean supported = now1.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);   //기능 지원 하지 않음
        if (supported){
            int minute1 = now1.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute1 = " + minute1);
        }


    }
}
