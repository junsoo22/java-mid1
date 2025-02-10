package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2=new OuterClass2();   //바깥 클래스의 인스턴스가 있어야함
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
