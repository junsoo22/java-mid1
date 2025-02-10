package nested.anonymous;

import nested.local.Printer;

public class AnanoymousOuter {
    private int outInstanceVar=3;

    public void process(int paramVar){
        int localVar=1;

        //장점. 코드가 더 간결해짐.
        Printer printer = new Printer() {  //익명 클래스. 인터페이스를 바로 구현한 것
            @Override
            public void print() {
                int value=0;
                //자신의 인그턴스 변수에 접근 가능
                System.out.println("value = " + value);

                //자신이 속한 코드블럭의 지역변수에 접근 가능
                System.out.println("localVar = " + localVar);

                //자신이 속한 코드 블럭의 매개변수에 접근 가능
                System.out.println("paramVar = " + paramVar);

                //바깥 클래스의 인스턴스 맴버에 접근 가능. 지역 클래스도 내부 클래스의 한 종류
                System.out.println("value = " + outInstanceVar);

            }

        };
        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());

    }

    public static void main(String[] args) {
        AnanoymousOuter localOuterV1 = new AnanoymousOuter();
        localOuterV1.process(2);
    }
}
