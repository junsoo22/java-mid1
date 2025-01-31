package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//특정 지역의 날짜와 시간만 고려
public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate=LocalDate.now();    //LocalDate: 날짜만 표현
        LocalDate ofDate = LocalDate.of(2013, 11, 21);  //특정 날짜를 기준으로 생성
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        LocalDate plusDays=ofDate.plusDays(10);   //불변이므로 반환 값 받아야함
        System.out.println("지정 날짜+10d = " + plusDays);

    }
}
