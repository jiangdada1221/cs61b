import java.util.Iterator;

public class OHIterator implements Iterator<OHRequest> {
    /*like a linked list, iterate such list */
    OHRequest curr;
    public OHIterator(OHRequest queue) {
        if(queue == null){
            throw new IllegalArgumentException("can not iterate null");
        }
        this.curr = queue;
    }
    /* you can set up your own filter method */
    public boolean isGood(String description){
        return description != null && description.length() > 5;
    }
    @Override
    public boolean hasNext() {

        if(curr != null && isGood(curr.description)){

            return true;
        }
        if(curr == null){
            return false;
        }else{
            curr = curr.next;
            return this.hasNext();
        }

    }

    @Override
    public OHRequest next() {
        OHRequest returnItem = curr;
        curr = curr.next;
        return returnItem;
    }
}
