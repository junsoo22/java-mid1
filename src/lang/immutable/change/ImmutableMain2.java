package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj=new ImmutableObj(10);
        obj.add(20);      //return값을 받지 않고 쓰기 때문에 바뀌지 않음
        System.out.println("obj = " + obj.getValue());   //안바뀜


    }
}
