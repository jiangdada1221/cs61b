public class Body{
  static double G = 6.67e-11;
  double xxPos;
  double yyPos;
  double xxVel;
  double yyVel;
  double mass;
  String imgFileName;
  public Body(double xP, double yP, double xV, double yV,double m, String img){
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }
  public Body(Body b){
    b.xxPos = this.xxPos;
    b.yyPos = this.yyPos;
    b.xxVel = this.xxVel;
    b.yyVel = this.yyVel;
    b.mass = this.mass;
    b.imgFileName = this.imgFileName;
  }
  public double calcDistance(Body d){
    double result;
    result = Math.sqrt((this.xxPos-d.xxPos)*(this.xxPos-d.xxPos)+(this.yyPos-d.yyPos)*(this.yyPos-d.yyPos));
    return result;
  }
  public double calcForceExertedBy(Body d){
    double result;
    result = G * d.mass * this.mass / (this.calcDistance(d) * this.calcDistance(d));
    return result;
  }
  public double calcForceExertedByX(Body d){
    double result;
    result = (d.xxPos - this.xxPos) * this.calcForceExertedBy(d) / this.calcDistance(d);
    return result;
  }
  public double calcForceExertedByY(Body d){
    double result;
    result = (d.yyPos - this.yyPos) * this.calcForceExertedBy(d) / this.calcDistance(d);
    return result;
  }
  public double calcNetForceExertedByX(Body[] bodys){
    double sum = 0;
    for(Body item : bodys){
      if(this.equals(item)){
        continue;
      }
      sum = sum + this.calcForceExertedByX(item);
    }
    return sum;
  }
  public double calcNetForceExertedByY(Body[] bodys){
    double sum = 0;
    for(Body item : bodys){
      if(this.equals(item)){
        continue;
      }
      sum = sum + this.calcForceExertedByY(item);
    }
    return sum;
  }
  public void update(double dt,double fx,double fy){
    double acce_x = fx / this.mass;
    double acce_y = fy / this.mass;
    this.xxVel = this.xxVel + acce_x * dt;
    this.yyVel = this.yyVel + acce_y * dt;
    this.xxPos = this.xxPos + dt * this.xxVel;
    this.yyPos = this.yyPos + dt* this.yyVel;
  }
  public void draw(){
    StdDraw.picture(xxPos,yyPos,"images/"+imgFileName);
  }
  // public static void main(String[] args) {
  //   Body body = new Body(0,0,0,0,0,"ball.gif");
  //   body.draw();
  //
  // }
}
