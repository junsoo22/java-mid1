
package enumeration.ex0;

//등급에 문자열 사용하는 지금의 방식은 다음과 같은 문제 있음
//1. 타입 안정성 부족: 오타 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
//2. 데이터 일관성: 다양한 형식으로 문자열을 입력할 수 있어서 일관성 떨어짐
public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price=10000;

        DiscountService discountService=new DiscountService();

        //존재하지 않은 등급 입력
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 금액= " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("diamondd 등급의 할인 ㄱ므액= " + diamondd);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + gold);

    }
}
