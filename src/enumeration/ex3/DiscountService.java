package enumeration.ex3;

import static enumeration.ex3.Grade.BASIC;

public class DiscountService {
    public int discount(Grade grade, int price){
        int discountPercent=0;

        if(grade== BASIC){   //equals 대신 참조값 비교
            discountPercent=10;
        }
        else if(grade==Grade.GOLD){
            discountPercent=20;
        }
        else if(grade==Grade.DIAMOND){
            discountPercent=30;
        }
        else{
            System.out.println("할인X");
        }


        return price * discountPercent / 100;
    }

}
