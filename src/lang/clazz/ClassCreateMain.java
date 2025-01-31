package lang.clazz;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Timer;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass= Hello.class;
        //Class aClass = Class.forName("lang.clazz.Hello");

        Hello hello= (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result=hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
        System.out.println(LocalDateTime.now());
    }
}
