package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(1);   //seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble=random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randombool=random.nextBoolean();
        System.out.println("randombool = " + randombool);

        //범위 조회
        int radomRange = random.nextInt(10);//0 ~ 9까지 출력
        System.out.println("radomRange 0~9: " + radomRange);
        int randomRange2 = random.nextInt(10) + 1;//1~10까지 출력
        System.out.println("randomRange2 1~10: " + randomRange2);
    }
}
