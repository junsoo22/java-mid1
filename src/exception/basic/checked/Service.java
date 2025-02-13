package exception.basic.checked;

public class Service {
    Client client=new Client();

    //1. 예외를 잡아서 처리하는 코드
    public void callCatch(){
        try {
            client.call();  //예외가 날라오고
        } catch (MyCheckedException e) {   //여기서 예외를 잡음
            //예외 처리 로직
            System.out.println("예외 처리, message="+e.getMessage());

        }
        System.out.println("정상 흐름");
    }

    //2. 체크 예외를 밖으로 던지는 코드
    //체크 예ㄹ외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
    public void catchThrow() throws MyCheckedException{
        client.call();

    }

}
