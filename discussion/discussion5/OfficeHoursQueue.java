import java.util.Iterator;

public class OfficeHoursQueue implements Iterable<OHRequest> {
    private OHRequest re;
    public OfficeHoursQueue (OHRequest re) {
        this.re = re;
    }
    @Override
    public Iterator<OHRequest> iterator() {
        return new TYIterator(re);
    }

    public static void main(String[] args) {
        OHRequest s1 = new OHRequest("failing my test for get in arrayDeque, npe","pam",null);
        OHRequest s2 = new OHRequest("conceptual: what is dynamic method selection","Michael",s1);
        OHRequest s3 = new OHRequest("git: what does checkout do.", "Jim", s2);
        OHRequest s4 = new OHRequest("help", "Dwight", s3);
        OHRequest s5 = new OHRequest("debugging get(i)", "Creed", s4);
        OHRequest s6 = new OHRequest("thank u prof just help me","jyp",s5);
        OHRequest s7 = new OHRequest("thank u a lot for helping ","xzy",s6);
        OfficeHoursQueue of = new OfficeHoursQueue(s7); // this one is important;
        for(OHRequest oh: of) {
            System.out.println(oh.name);
        }
    }
}
/* summary
if you want to iterate something that is defined by yourself,
you should make a iterator.java class that implements iterator<> as a iterator for my own stuffs;
one file is used to define attribute of what i want to build;
and the other file is used for iteration (or you can use nested class)
 */
