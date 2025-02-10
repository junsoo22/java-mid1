package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {
    public static void hello(Process process){   //인터페이스 구현체를 넘김. 인스턴스에 있는 메서드를 호출

        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();

        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");
        hello(() -> {  //람다 클래스. 코드 블럭을 직접 전달
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            //코드 조각 시작
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });

    }


}
