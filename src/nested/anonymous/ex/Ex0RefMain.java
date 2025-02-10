package nested.anonymous.ex;

public class Ex0RefMain {
    private String name;

    public Ex0RefMain(String name) {
        this.name = name;
    }

    public static void hello(String name){   //외부에서 변하는 문자열을 전달 받아서 처리. 재사용성 높임
        System.out.println("프로그램 시작");    //변하지 않는 부분
        //변하는 부분 시작
        System.out.println("Hello "+name);     //변하는 부분
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello("java");
        hello("spring");
    }
}
