public class Arrays {
    /* insert item in the position of an arr */
    public static int[] insert(int[] arr, int item, int position) {
        if (position > arr.length) {
            position = arr.length;
        }
        int[] New = new int[arr.length + 1];
        System.arraycopy(arr, 0, New, 0, position);
        System.arraycopy(arr, position, New, position + 1, arr.length - position);
        New[position] = item;
        return New;
    }

    /* destructively reverse the items in arr */
    public static void reverse(int[] arr) {
       int i = 0;
       int j = arr.length - 1;
       int temp;
       while (i < j) {
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i ++;
           j --;
       }
    }
    /* replace the number at index i with arr[i] copies */
    public static int[] replicate(int[] arr) {
        int[] New = new int[arr.length];
        System.arraycopy(arr,0,New,0,arr.length);

        int position = 0;
        for(int i = 0; i <= arr.length-1;i++){
            for(int j = 1;j<=arr[i] - 1;j++){
                New = insert(New,arr[i],position);
                position += 1;
            }
            position += 1;
        }
        return New;
    }
    /* a better one */

    /**
     * int total = 0;
     * for (int item:arr) {
     *     total += item;
     * }
     * int[] result = new int[total];
     * int i = 0;
     * for (int item : arr) {
     *     for(int counter = 0;counter < item; counter ++) {
     *         result[i] = item;
     *         i ++;
     *     }
     *     return result;
     * }
     *
     */

    public static void main(String[] args) {
        int[] l1 = new int[]{3,2,1};
        int[] l2 = insert(l1, 88, 0);
        int[] l3 = insert(l1, 99, 1);
        int[] l4 = insert(l1, 100, 10086);
//        reverse(l4);
        int [] l5 = replicate(l1);
    }
}
