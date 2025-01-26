package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str="Apple,Banana,Orange";
        //split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }
        
        String joinStr="";
//        for (String s : split) {
//            joinStr+=s+"-";
//        }
//        System.out.println("joinStr = " + joinStr);  //joinStr = Apple-Banana-Orange-
//
//        //마지막 -를 빼는 것이 귀찮음. 반복문으로 해야함.

//        String joinStr2="";
//        for(int i=0;i<split.length;i++){
//            String string=split[i];
//            joinStr2+=string;
//            if(i!=split.length-1){
//                joinStr2+="-";
//            }
//        }
//        System.out.println("joinStr = " + joinStr2);

        //join()
        System.out.println("joinStr = " + joinStr);
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        //문자열 배열 연결
        String join = String.join("-", split);
        System.out.println("join = " + join);


    }
    
}
