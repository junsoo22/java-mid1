package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar=3;

    public void process(int paramVar){
        int localVar=1;

        class LocalPrinter{
            int value=0;

            public void printData(){
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
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
