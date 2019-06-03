public class math {
    public static void mul3(int[] A){
//        for (int x: A){
//            x=x*3;
//        }
        for(int i =0;i< A.length;i++){
            A[i] *=3;
        }
    }
    public static void mul2(int[] A){
        int[] b = A;
        for (int i = 0;i < b.length;i++){
            b[i] *=2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,3,4};
        mul3(arr);

    }
}
