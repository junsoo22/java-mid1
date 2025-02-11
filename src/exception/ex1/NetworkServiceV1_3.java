package exception.ex1;


//복잡한 NetworkClient 사용 로직을 처리한다.
public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address="http://example.com";
        NetworkClientV1 client=new NetworkClientV1(address);
        client.initError(data);   //추가

        String connectResult = client.connect();

        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+connectResult);

        }
        else{
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            }
        }

        client.disconnect();   //연결실패든, 데이터 전송 실패하든 연결 시도하면 무조건 disconnect()호출
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
