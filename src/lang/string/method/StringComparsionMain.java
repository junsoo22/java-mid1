package lang.string.method;

public class StringComparsionMain {
    public static void main(String[] args) {
        String str1 = "Hello Java!";    //대문자 일부 있음
        String str2 = "hello java!";   //모두 소문자
        String str3 = "Hello,World!";

        System.out.println("str1 equals str2: "+str1.equals(str2));
        //equalsIgnoreCase: 대소문자 무시하고 비교
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        System.out.println("\"b\".compareTo(\"a\") = " + "b".compareTo("a"));  //사전적으로 a와 b는 1칸 차이
        System.out.println("\"c\".compareTo(\"a\") = " + "c".compareTo("a"));  //a와 c는 2칸 차이
        System.out.println("\"a\".compareTo(\"b\") = " + "a".compareTo("b"));  //b와 a는 -1칸 차이
        System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
        System.out.println("str1.compareTo(str2) = " + str1.compareToIgnoreCase(str2));

        System.out.println("str1.startsWith(\"Hello\") = " + str1.startsWith("Hello"));
        System.out.println("str1.endsWith(\"Java!\") = " + str1.endsWith("Java!"));
    }
}
