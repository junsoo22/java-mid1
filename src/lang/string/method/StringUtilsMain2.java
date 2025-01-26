package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num=100;
        boolean bool=true;
        Object obj=new Object();
        String str="Hello, Java!";
        
        //format 메서더ㅡ
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format1 = " + format1);

        String format2 = String.format("숫자: %.2f", 10.1234);  //소수점 2자리까지만 출력
        System.out.println("format2 = " + format2);

        //printf
        System.out.printf("숫자: %.2f\n", 10.1234);   //출력할 때 한 번에

        //matches 메서드
        String regex="Hello, (Java!|World)";   //Java! or World
        System.out.println("'str이 패턴과 일치하는가? "+str.matches(regex));
        
    }
}
