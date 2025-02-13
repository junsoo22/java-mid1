package exception.basic.unchecked;


public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service=new Service();
        service.callThrow();          //예외를 main 밖으로 던짐
        System.out.println("정상 종료");    //출력되지 않음
    }
}
