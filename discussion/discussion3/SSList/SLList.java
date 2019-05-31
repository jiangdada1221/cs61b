import org.junit.Test;
public class SLList {
    /* constructor is optional not mandatory */
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }
    public IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x,first);
    }

    /* insert the given item to the given position */
    public void insert(int item, int position) {
//        if(first == null || position == 0) {
//            first = new IntNode(item, null);
//        }
//        else{
//
//        }
        IntNode p = first;
        while(p.next != null && position > 1){
            p = p.next;
            position -= 1;
        }
            if(position == 0){
                p.next = new IntNode(p.item, p.next);
                p.item = item;
            }else
            p.next = new IntNode(item, p.next);

//            p.next = new IntNode(p.item, p.next);
//            p.item = item;

    }

    /* reverse the list */
    public void reverse() {
        IntNode New = helper(first);
        first = New;
    }
    public static IntNode helper(IntNode node) {
        if(node == null || node.next == null) {
            return node;
        }else{
            IntNode New = helper(node.next);

            IntNode p = New;
//            for(p = New; p.next == null; p = p.next) {
//            }
            while (p.next != null) {
                p = p.next;
            }
            node.next = null;
            p.next = node;
            return New;
        }
    }

    public static void main(String[] args) {
        SLList sl = new SLList();
        sl.addFirst(4);
        sl.addFirst(3);
        sl.addFirst(2);
        sl.addFirst(1);
//        IntNode Int = helper(sl.first);
        sl.reverse();

    }
}
