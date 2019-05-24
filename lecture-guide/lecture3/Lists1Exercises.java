public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
      if(L.rest == null){
        return new IntList(L.first + x,null);
      }
      else{
        return new IntList(L.first+x,incrList(L.rest,x));
      }
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* this means change L? */
        if(L.rest == null){
          L.first = L.first + x;
          return L;
        }
        else{
          L.first = L.first + x;
          L.rest = dincrList(L.rest,x);
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());
        IntList refer = incrList(L,100);
        IntList refer2 = dincrList(L,100);
        /* refer2 is just L*/
        System.out.println(refer.first);
        System.out.println(refer.rest.first);
        System.out.println(refer.rest.rest.first);
        System.out.println(refer2.first);
        System.out.println(L.first);
        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));
    }
}
