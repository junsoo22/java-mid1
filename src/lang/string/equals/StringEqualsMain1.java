package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1.equlas(str2) = " + str1.equals(str2));   //객체 안에 잇는 문자열 값은 같으므로 
        System.out.println("(str1==str2) = " + (str1==str2));    //참조값 다르므로 다름.

        String str3 = "hello";   //문자열 리터럴 사용->문자열 풀에 String 클래스 만들어둠
        String str4 = "hello";   //문자열 풀에서 이미 있는 hello의 참조형을 사용
        System.out.println("str3==str4 = " + (str3 == str4));   //이건 True(참).
        System.out.println("str3.equals(str4) = " + str3.equals(str4));
    }
}
