public class star{
  public static void main(String[] args) {
    int i = 1;
    int j = 1;

    while(i<=5){
      while(j<=i){
        System.out.print("*");
        j = j+1;
      }
      j = 1;
      i = i + 1;
      System.out.println("");
    }
  }
}
