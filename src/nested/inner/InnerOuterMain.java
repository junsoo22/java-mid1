package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer=new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();   //바깥 인스턴스의 참조를 알아야되기 때문에
        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
