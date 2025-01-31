package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        System.out.print("년도를 입력하세요: ");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        scanner.nextLine();
        System.out.print("월을 입력하세요: ");
        int month=scanner.nextInt();
        scanner.nextLine();

        printCalender(year,month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);   //다음 달

        //월요일은 1(1%7=1)-> 1칸 띄움, 일요일은 7(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i=0;i<offsetWeekDays;i++){
            System.out.print("   ");
        }

        LocalDate dayIterator=firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ",dayIterator.getDayOfMonth());

            if(dayIterator.getDayOfWeek()== DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator=dayIterator.plusDays(1);
        }
        
    }
}
