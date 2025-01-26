package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("  niceto mteto ");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        String result=str1.concat(str2);
        System.out.println("result = " + result);

    }

}
