package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string=object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력. 내부적으로 toString()을 해줌.
        System.out.println(object);


    }
}
