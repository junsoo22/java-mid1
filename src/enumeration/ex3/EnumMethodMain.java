package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 Enum 반환
        Grade[]values=Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            //.name->이름 가져옴, .ordinal-> 순서를 숫자로 받을 수 있음
            System.out.println("value = " + value.name()+", ordinal="+value.ordinal());
        }

        //String->Enum 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input="GOLD";
        Grade gold=Grade.valueOf(input);
        System.out.println("gold = " + gold);

    }
}
