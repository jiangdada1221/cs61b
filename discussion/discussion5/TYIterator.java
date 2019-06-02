import java.util.Iterator;

public class TYIterator implements Iterator<OHRequest> {
    private OHRequest curr;
    public TYIterator(OHRequest curr){
        this.curr = curr;
    }
    private int skip = 0; // i = 0 means not skiped by thank u
    @Override
    public boolean hasNext() {

        if(curr != null && isGood(curr.description)){
            if(skip == 1){
                skip = 0;
                curr = curr.next;
                return this.hasNext();
            }
            if  (curr.description.contains("thank u")){
                skip = 1;
            }
            return true;
        }
        if(curr == null){
            return false;
        }else{
            curr = curr.next;
            return this.hasNext();
        }
    }
    public boolean isGood(String description){
        return description != null && description.length() > 5;
    }
    @Override
    public OHRequest next() {
        OHRequest returnItem = curr;
        curr = curr.next;
        return returnItem;
    }
}
