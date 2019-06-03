public class filtereven implements Predicate<Integer> {
    /* just iterate integers */
    @Override
    public boolean test(Integer x) {
        int x2 = (int) x;
        if(x % 2 == 0){
            return false;
        }
        return true;
    }
}
