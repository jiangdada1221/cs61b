import static org.junit.Assert.*;
import org.junit.Test;

public class test {
    @Test
    public void testinsert() {
        SLList sl = new SLList();
        sl.addFirst(3);
        sl.insert(88,0);
        sl.insert(99,101);

        assertEquals(sl.first.item,88);
        assertEquals(sl.first.next.item,3);
        assertEquals(sl.first.next.next.item,99);
    }

}
