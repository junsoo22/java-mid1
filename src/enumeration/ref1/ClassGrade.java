package enumeration.ref1;

//회원등급을 다루는 클래스, 각각의 회원 등급별로 상수를 선언
public class ClassGrade {
    public static final ClassGrade BASIC=new ClassGrade(10);
    public static final ClassGrade GOLD=new ClassGrade(20);
    public static final ClassGrade DIAMOND=new ClassGrade(30);

    private final int discountPercent;    //불변으로 설계

    public ClassGrade(int discountPercent) {
        this.discountPercent=discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
