
package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a= new Address("서울");
        Address b=a;
        System.out.println("a="+a);    //x001
        System.out.println("b="+b);     //x002

        change(b, "부산");
        System.out.println("a = " + a);    //a와 b는 서로 다른 참조이므로 안바뀜
        System.out.println("b = " + b);
    }

    private static void change(Address add1, String changeAddress){
        System.out.println("죽소 값을 변경합니다.->"+changeAddress);
        add1.setValue(changeAddress);
    }
}
