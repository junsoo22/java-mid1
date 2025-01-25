package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a= new Address("서울");
        Address b=new Address("서울");
        System.out.println("a="+a);    //x001
        System.out.println("b="+b);     //x002
        
        b.setValue("부산");   //b의 값을 부산으로 변경
        System.out.println("a = " + a);    //a와 b는 서로 다른 참조이므로 안바뀜
        System.out.println("b = " + b);
    }
}
