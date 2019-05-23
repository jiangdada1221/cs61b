public class NBody{
  public static double readRadius(String address){
    In in = new In(address);
    int firstitem = in.readInt();
    double radius = in.readDouble();
    return radius;
  }
  // public static void main(String[] args) {
  //   double a = readRadius("./data/planets.txt");
  //   System.out.println(a);
  // }
  public static Body[] readBodies(String file){
    In in = new In(file);
    int number = in.readInt();
    Body[] bodys = new Body[number];
    double a;
    double b;
    double c;
    double d;
    double e;
    String f;
    in.readDouble();
    for(int i = 0;i <= number - 1;i++){
      a = in.readDouble();
      b = in.readDouble();
      c = in.readDouble();
      d = in.readDouble();
      e = in.readDouble();
      f = in.readString();
      bodys[i] = new Body(a,b,c,d,e,f);
    }
    return bodys;
  }
  public static void main(String[] args) {
    double T = Double.parseDouble(args[0]);
    double dt = Double.parseDouble(args[1]);
    String filename = args[2];
    Body[] bodys = readBodies(filename);
    double radius = readRadius(filename);
    StdDraw.enableDoubleBuffering();


    StdDraw.setScale(-radius,radius);
    // StdDraw.clear();
    StdDraw.picture(0, 0, "images/starfield.jpg");  // picture should input a string as the picture name
    StdDraw.show();
    for(Body planet : bodys){
      planet.draw();
    }


    // StdDraw.picture(0,4,"images/ball.gif");
    StdDraw.show();
  }
}
