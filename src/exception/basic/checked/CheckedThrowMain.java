package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service=new Service();
        service.catchThrow();          //예외를 main 밖으로 던짐
        System.out.println("정상 종료");    //출력되지 않음
    }
}
