package lang.immutable.change;

import java.util.stream.IntStream;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue){
        return new ImmutableObj(value+addValue);     //생성한 객체를 반환
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
