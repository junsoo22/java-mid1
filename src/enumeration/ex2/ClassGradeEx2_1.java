package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price=10000;
        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(ClassGrade.BASIC, price);
        int discount1 = discountService.discount(ClassGrade.GOLD, price);
        int discount2 = discountService.discount(ClassGrade.DIAMOND, price);
        
        System.out.println("discount = " + discount);
        System.out.println("discount1 = " + discount1);
        System.out.println("discount2 = " + discount2);


    }
}
