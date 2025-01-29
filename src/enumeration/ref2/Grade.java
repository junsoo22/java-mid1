package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20),DIAMOND(30);

    private final int discountPrice;

    Grade(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }
}
