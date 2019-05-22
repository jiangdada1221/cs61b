public class count{
	  public static void windowPosSum(int[] a, int n){
	    int[] newlist = new int[a.length];
	    int sum = 0;
	    for(int i = 0;i<= a.length -1;i++){
	      if(a[i] < 0){
	        newlist[i] = a[i];
	        continue;
	      }

	        for(int j = 0;j<=n;j++){
	          sum = sum + a[i+j];
	          if((i + j) == a.length -1){
	            a[i] = sum;
	            break;
	          }
	        }
	        a[i] = sum;
	        sum = 0;
	    }
	    for(int i = 0;i<= newlist.length-1;i++){
	      System.out.print(a[i]+" ");
	    }
	  }
	  public static void main(String[] args) {
	    int[] a = {1,2,-3,4,5,4};
	    int n = 3;
	    windowPosSum(a,n);
	  }
	}
