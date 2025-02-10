package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar=3;

    public void process(int paramVar){
        int localVar=1;

        class LocalPrinter implements Printer{
            int value=0;

            @Override
            public void print() {
                //자신의 인그턴스 변수에 접근 가능
                System.out.println("value = " + value);

                //자신이 속한 코드블럭의 지역변수에 접근 가능
                System.out.println("localVar = " + localVar);

                //자신이 속한 코드 블럭의 매개변수에 접근 가능
                System.out.println("paramVar = " + paramVar);

                //바깥 클래스의 인스턴스 맴버에 접근 가능. 지역 클래스도 내부 클래스의 한 종류
                System.out.println("value = " + outInstanceVar);

            }
        }

        LocalPrinter localPrinter=new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
