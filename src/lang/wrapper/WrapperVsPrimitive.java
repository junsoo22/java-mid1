package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations=1_000_000_000;   //반복 횟수 10억
        long startTime, endTime;

        //기본형 long 사용.-> 단순히 그 크기만큼의 공간 차지.
        long sumPrimitive=0;
        startTime=System.currentTimeMillis();
        for (int i=0;i<iterations;i++) {
            sumPrimitive+=i;
        }

        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: "+(endTime-startTime)+"ms");

        //래퍼 클래스 Long 사용.-> 인스턴스 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라
        //자바에서 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리 사용.
        Long sumWrapepr=0L;
        startTime=System.currentTimeMillis();
        for (int i=0;i<iterations;i++) {
            sumWrapepr+=i;    //오토박싱 발생
        }
        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapepr);
        System.out.println("기본 자료형 long 실행 시간: "+(endTime-startTime)+"ms");
    }
}
