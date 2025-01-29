package enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price=10000;

        DiscountService discountService=new DiscountService();
        int basic=discountService.discount(StringGrade.BASIC,price);
        System.out.println("basic 등급 할인 금액 = " + basic);
        int gold=discountService.discount(StringGrade.GOLD,price);
        System.out.println("gold 등급 할인 금액 = " + gold);
        int diamond= discountService.discount(StringGrade.DIAMOND,price);
        System.out.println("diamond 등급 할인 금액 = " + diamond);
        int wrong=discountService.discount("SILVER",price);
        System.out.println("할인 금액 = " + wrong);
    }
}
