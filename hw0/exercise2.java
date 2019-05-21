public class maxnum{
  /** returns the maximum value from list m */
  public static int max(int[] m){
    int index = 0;
    int i = 1;
    while(i <= m.length -1){
      if(m[index] < m[i]){
        index = i ;

      }
      i = i + 1;
    }
    return m[index];
      }
      public static void main(String[] args) {
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
      }
    }
