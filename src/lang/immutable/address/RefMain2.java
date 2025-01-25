package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a=new ImmutableAddress("서울");
        ImmutableAddress b= a; //참조값을 복사해서 b에 전달
        System.out.println("a="+a);
        System.out.println("b="+b);
        
        //b.setValue("부산");   //b의 값을 부산으로 변경
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);    //a가 참조하는 것=b가 참조하는 것이므로 a도 바뀜
        System.out.println("b = " + b);
    }
}
