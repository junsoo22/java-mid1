package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20),DIAMOND(30),VIP(40);

    private final int discountPrice;

    Grade(int discountPrice) {

        this.discountPrice = discountPrice;
    }

    public int getDiscountPrice() {

        return discountPrice;
    }

    public int discount(int price){
        return price*discountPrice/100;

    }
}
