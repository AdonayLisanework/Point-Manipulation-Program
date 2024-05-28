public class Point {
  private int x;
  private int y;
  
  public Point(){ //default
    x = 0;
    y = 0;
  }
  
  public Point(int x1, int y1){ //alternate
    x = x1;
    y = y1;
  }
  public void setTime(int x1, int y1) {
    x = (x1 > 0) ? x1 : 0;
    y = (y1 > 0) ? y1 : 0;
  }
  
  
  public void print(){
    System.out.println("(" + x + "," + y +")");
  }
  
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
public boolean equals(Object obj) {
    if (obj instanceof Point) {
        Point t = (Point) obj;
        return x == t.x && y == t.y; 
    } else
        return false;
}


  public void copy (Point t){
    x = t.x;
    y = t.y;
  }
  
  public Point getCopy (){
    Point t = new Point ();
    t.x = x;
    t.y = y;
    return t;
    
  }
  
  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }
  
  public double distance(Point t) {
    int x1 = x - t.x;
    int y1 = y - t.y;
    return Math.sqrt(x1 * x1 + y1 * y1);
  }
public void translate(int xAdd, int yAdd){
    x += xAdd;
    y += yAdd;
}

  
  public boolean isHorizontal(Point t){
    return this.y == t.y;
  }
  
  public boolean isVertical(Point t){
    return this.x == t.x;
  }
  
  public double findSlope (Point t){
    return (double)(this.y - t.y)/(this.x - t.x);
  }
  /* public double slope(Point other) {
   if (this.x == other.x) {
   throw new ArithmeticException("Slope is undefined for vertical line");
   }
   return (double) (this.y - other.y) / (this.x - other.x);
   }
   */
  
}
