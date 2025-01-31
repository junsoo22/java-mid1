package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now=Instant.now();    //UTC 기준으로 생성
        System.out.println("now = " + now);

        ZonedDateTime zdt=ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant instant = Instant.ofEpochSecond(0);   //에포크 시간을 기준으로 Instant 생성.
        System.out.println("instant = " + instant);

        //계산
        Instant instant1 = instant.plusSeconds(3600);
        System.out.println("instant1 = " + instant1);

        //조회
        long epochSecond = instant1.getEpochSecond();   //에포크 시간인 UTC 1970년 1월 1일 0시 0분 0초를 기준으로 흐른 초를 반환
        System.out.println("epochSecond = " + epochSecond);

    }
}
