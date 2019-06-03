import java.util.Iterator;
import java.util.List;

public class IteratorOfIterators implements Iterable<Integer> {
    private List<Iterator<Integer>> a;

    public IteratorOfIterators(List<Iterator<Integer>> a) {
        this.a = a;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new iterator();
    }

    private class iterator implements Iterator<Integer> {
        /* only for the same size iterator */
        private int i = 0;
        @Override
        public boolean hasNext() {
            if(a.get(i).hasNext()){
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            int result = a.get(i).next();
            if(i == a.size() - 1)
                i = 0;
            else
                i ++;
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3);
        List<Integer> b = List.of(4,5,6);
        List<Integer> c = List.of(7,8,9);
        Iterator<Integer> ai = a.iterator();
        Iterator<Integer> bi = b.iterator();
        Iterator<Integer> ci = c.iterator();
        List<Iterator<Integer>> d = List.of(ai,bi,ci);
        IteratorOfIterators it = new IteratorOfIterators(d);
        for(int i: it){
            System.out.println(i);
        }
    }
}
