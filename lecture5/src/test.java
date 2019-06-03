public class test{
    public String name;
    public int level;
    public test(String name,int level){
        this.name = name;
        this.level = level;
    }
    public static void change(test t,int level){
        t.level = level;
        level = 50;
        t = new test("Gengar",1);
    }

    public static void main(String[] args) {
        test t = new test("pikachu",17);
        int level = 100;
        change(t,level);
        System.out.println(t.name+t.level);
    }
        }
