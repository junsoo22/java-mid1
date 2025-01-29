package enumeration.ex2;

//회원등급을 다루는 클래스, 각각의 회원 등급별로 상수를 선언
public class ClassGrade {
    public static final ClassGrade BASIC=new ClassGrade();
    public static final ClassGrade GOLD=new ClassGrade();
    public static final ClassGrade DIAMOND=new ClassGrade();

    //private 생성자 추가. 외부에서 ClassGrade를 임의로 생성하지 못하게 막음
    private ClassGrade(){

    }


}
