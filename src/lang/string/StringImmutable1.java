package lang.string;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str="hello";
        str.concat("java");
        System.out.println("str = " + str);   //실행결과 합쳐지지 않음
    }
}
