package enumeration.ref3;



public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price=10000;

        //discountService 클래스 제거
        
        System.out.println("discount = " + Grade.BASIC.discount(price));
        System.out.println("discount1 = " + Grade.GOLD.discount(price));
        System.out.println("discount2 = " + Grade.DIAMOND.discount(price));

    }
}
