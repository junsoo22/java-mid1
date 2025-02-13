package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{   //발생시킨 예외를 밖으로 던질때 사용

        //문제상황
        throw new MyCheckedException("ex");   //객체 만들고 예외 발생시킴.

    }
}
