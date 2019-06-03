import java.util.Iterator;
import java.util.*;

public class FilteredList<jyp> implements Iterable<jyp> {
    private List L;
    private Predicate pre;
    public FilteredList(List<jyp> L, Predicate<jyp> filter) {
        this.L = L;
        this.pre = filter;
    }

    @Override
    public Iterator<jyp> iterator() {
        return new IteratorFor<jyp>();
    }
    public class IteratorFor<jyp> implements Iterator<jyp> {
        private int i = 0;
        @Override
        public boolean hasNext() {
            if(i <= L.size() - 1){
                if (pre.test(L.get(i))) {
                    return true;
                }
                i ++;
                return hasNext();
            }
            return false;
        }

        @Override
        public jyp next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            jyp result =(jyp) L.get(i);
            i ++;
            return result;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> fil = new filtereven();
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        FilteredList<Integer> filter = new FilteredList<>(list,fil);
        for(int i : filter){
            System.out.println(i);
        }
    }

}
