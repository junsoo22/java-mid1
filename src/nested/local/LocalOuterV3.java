package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar=3;


    public Printer process(int paramVar){
        int localVar=1;   //지역변수는 스택 영역이 종료되는 순간 함께 제거된다.  사실상 final

        class LocalPrinter implements Printer{
            int value=0;

            @Override
            public void print() {
                //자신의 인그턴스 변수에 접근 가능
                System.out.println("value = " + value);

                //인스턴스는 지역변수보다 더 오래살아남는다.
                System.out.println("localVar = " + localVar);

                //자신이 속한 코드 블럭의 매개변수에 접근 가능
                System.out.println("paramVar = " + paramVar);

                //바깥 클래스의 인스턴스 맴버에 접근 가능. 지역 클래스도 내부 클래스의 한 종류
                System.out.println("value = " + outInstanceVar);

            }
        }

        LocalPrinter localPrinter=new LocalPrinter();
        //localPrinter.print();    //여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer= localOuterV1.process(2);
        //Printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
