package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str="Hello Java";
        StringBuilder str2=new StringBuilder(str);
        System.out.println(str2.reverse().toString());
    }
}
