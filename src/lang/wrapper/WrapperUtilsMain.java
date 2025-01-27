package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(10);    //숫자->래퍼 객체 변환
        Integer integer1 = Integer.valueOf("10");  //문자열-> 래퍼 객체 변환
        int i = Integer.parseInt("10");//문자열 전용. 기본형으로 변환

        //비교
        int compareResult=integer.compareTo(20);
        System.out.println("compareResult = " + compareResult);  //10이 20보다 작으므로 -1 반환

        //산술 연산
        System.out.println("sum: "+Integer.sum(10,20));
        System.out.println("min: "+Integer.min(10,20));
        System.out.println("max: "+Integer.max(10,20));
    }
}
