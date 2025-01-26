package lang.string.test;

import java.util.Arrays;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String []parts=fruits.split(",");
        String joinedString="";
        for (String part : parts) {
            System.out.println(part);
        }
        joinedString=String.join("->",parts);
        System.out.println("joinedString = " + joinedString);
        
    }
}
