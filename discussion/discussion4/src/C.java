public class C extends B{
    public int y = x + 1;
    public void m2() {
        System.out.println("cm2 - " + super.x);
    }
    public void m5() {
        System.out.print("cm5 - " + y);
    }
}
