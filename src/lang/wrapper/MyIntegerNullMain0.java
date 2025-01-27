package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(arr, -1));
        System.out.println(findValue(arr, -0));
        System.out.println(findValue(arr, 1));
        System.out.println(findValue(arr, 100));


    }
    private static int findValue(int[]intArr,int target){
        for (int i : intArr) {
            if(i==target){
                return i;
            }
        }
        return -1;
    }
}
