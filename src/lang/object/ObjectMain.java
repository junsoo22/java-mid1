package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);     //lang.object.Child@2f4d3709  ->객체 정보 출력
        //이걸 Override해서 사용하는 것!

    }
}
