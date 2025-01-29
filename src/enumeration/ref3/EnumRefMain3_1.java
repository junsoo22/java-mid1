package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price=10000;
        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(Grade.BASIC, price);
        int discount1 = discountService.discount(Grade.GOLD, price);
        int discount2 = discountService.discount(Grade.DIAMOND, price);
        
        System.out.println("discount = " + discount);
        System.out.println("discount1 = " + discount1);
        System.out.println("discount2 = " + discount2);

    }
}
