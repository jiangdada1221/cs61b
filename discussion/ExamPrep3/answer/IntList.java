public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    /* non-destructively creates a copy of x without y */
    public static IntList ilsans(IntList x, int y) {
        if (x == null) {
            return x;
        }
        if (x.first == y) {
            return ilsans(x.rest, y);
        }
        return new IntList(x.first, ilsans(x.rest,y));
    }

    /*destructively and no use of "new" */
    public static IntList dilsans(IntList x, int y){
        if(x == null){
            return x;
        }
        x.rest = dilsans(x.rest,y);
        if(x.first == y){
            return x.rest;
        }
        return x;
    }
}
