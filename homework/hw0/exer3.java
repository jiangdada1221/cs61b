public class forloop{
  /** returns the max value in a array m */
  public static int formax(int[] m){
    int index = 0;
    for(int i = 1; i <= m.length - 1; i++){
      if(m[index] < m[i]){
        index = i;
      }
    }
    return m[index];
  }
  public static void main(String[] args) {
    int[] numbers = new int[]{9,2,15,2,22,10,6};
    System.out.println(formax(numbers));
  }
}
