package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;   //연결 실패
    public boolean sendError;       //전송 실패

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){
        if(connectError){
            System.out.println(address+" 서버 연결 실패");
            return "connectError";
        }
        System.out.println(address+" 서버 연결 성공");
        return "success";
    }

    //연결한 외부 서버에 데이터 전송
    public String send(String data){
        if(sendError){
            System.out.println(address+" 서버에 데이터 전송 실패: "+data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address+" 서버에 데이터 전송: "+data);
        return "success";
    }
    //외부 서버와 연결 해제
    public void disconnect(){
        System.out.println(address+" 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){    //errir1이라는 단어 가지고 있으면
            connectError=true;
        }
        if(data.contains("error2")){
            sendError=true;
        }
    }

}
