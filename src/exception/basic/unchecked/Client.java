package exception.basic.unchecked;

public class Client {
    public void call() {     //throws MyUncheckedExcpeiton 안해도 됨

        //문제상황
        throw new MyUncheckedException("ex");    //여기서 알아서 밖으로 던져줌

    }
}
