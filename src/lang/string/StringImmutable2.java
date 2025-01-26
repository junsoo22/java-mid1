package lang.string;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str="hello";
        str.concat("java");
        String str2=str.concat("java");
        System.out.println("str = " + str);   //실행결과 합쳐지지 않음
        System.out.println("str2 = " + str2);   //String은 불변객체이므로 새로운 결과를 만들어서 반환
    }
}
