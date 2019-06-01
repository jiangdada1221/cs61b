public class flatten {
    /* return a 1D array flattening a given 2D array*/
    public static int[] flatten(int[][] x) {
        int totalLength = 0;
        for (int i =0;i<= x.length-1; i++){
            totalLength += x[i].length;
        }

        int[] a = new int[totalLength];
        int aIndex = 0;

        for (int i = 0;i <= x.length-1; i++){
            for(int j = 0;j <= x[i].length - 1;j++){
                a[aIndex] = x[i][j];
                aIndex += 1;
            }
        }
        return a;
    }
}
