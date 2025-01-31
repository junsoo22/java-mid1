package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);
        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime = " + localTime);   //1시

        //계산에 사용
        LocalTime plus = localTime.plus(duration);
        System.out.println("더한 시간 = " + plus);

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        System.out.println("시작시간 = " + start);
        LocalTime end = LocalTime.of(13, 32);
        System.out.println("끝난시간 = " + end);
        Duration between = Duration.between(start, end);
        System.out.println("between.getSeconds()+\"초\" = " + between.getSeconds() + "초");
        System.out.println("걸린 시간 = " + between.toHours()+"시간 "+between.toMinutesPart()+"분");
    }

}
