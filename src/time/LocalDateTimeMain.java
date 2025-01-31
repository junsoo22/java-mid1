package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {


        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간: "+nowDt);
        System.out.println("지정 날짜시간: "+ofDt);
        
        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime plus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간+1000d = " + plus);
        LocalDateTime localDateTime1 = ofDt.plusYears(1);
        System.out.println("지정 날짜시간+1년 = " + localDateTime1);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? "+nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? "+nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? "+nowDt.isEqual(ofDt));  //타임존이 달라도 시간적으로 같으면 true반환
        //ex) 서울의 9시와 UTC의 0시는 시간적으로 같다. 비교하면 true반환

    }
}
