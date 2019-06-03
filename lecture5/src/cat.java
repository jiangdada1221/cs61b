public class cat {
    public String  name;
    public static String noise = "jyp is handsome";

    public cat(String name, String noise){
        this.name = name;
        this.noise = noise;
    }
    public void play(){
        System.out.println(noise);
    }
    public static void anger(){
        noise = noise.toUpperCase();
    }
    public static void calm(){
        noise = noise.toLowerCase();
    }

    public static void main(String[] args) {
        cat a = new cat("cream","Meow");
        cat b = new cat("tubbs","Nyan");
        a.play();
        b.play();
        cat.anger();
        a.calm();
        a.play();
        b.play();
    }
}
