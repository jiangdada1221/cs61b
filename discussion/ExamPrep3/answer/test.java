import org.junit.Test;
import static org.junit.Assert.*;
public class test {
    @Test
    public void testflatten() {
        int[][] a = new int[][]{{1,2,3},{},{3,4,5}};
        int[] a2 = flatten.flatten(a);
        int[] expected = new int[]{1,2,3,3,4,5};
        assertArrayEquals(expected,a2);
    }
    @Test
    public void testilsans() {
        /* assertequals compares the address of two objects*/
        IntList in = new IntList(3,null);
        in = new IntList(4,in);
        in = new IntList(5,in);
        IntList result = IntList.ilsans(in,4);
        IntList expected = new IntList(3,null);
        expected = new IntList(5,expected);
        assertEquals(expected.first,result.first);
        assertEquals(expected.rest.first,result.rest.first);

    }
}
