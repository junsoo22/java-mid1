package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period=Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        System.out.println("localDate = " + localDate);
        LocalDate plus = localDate.plus(period);
        System.out.println("plus = " + plus);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        System.out.println("startDate = " + startDate);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        System.out.println("endDate = " + endDate);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
        System.out.println("기간: "+between.getMonths()+"개월 "+between.getDays()+"일");
    }
}
