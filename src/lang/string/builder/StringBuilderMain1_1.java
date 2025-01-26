package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();    //가변으로 생성ㅇ
        sb.append("A");    //append로 뒤에 문자열 추가
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4,"Java");  //4번쨰에 java 붙임. 특정 위치에 문자열 삽입
        System.out.println("insert = " + sb);
        
        sb.delete(4,8);   //특정 범위의 문자열 삭제
        System.out.println("delete = " + sb);

        System.out.println("sb.reverse() = " + sb.reverse());    //문자열 뒤집기

        //StringBuilder->String: 다시 불변으로 바꿔줌-> 문자열 변경 끝나고 마지막에 바꿔주는게 안전
        String string=sb.toString();
        System.out.println("string = " + string);
    }
}
