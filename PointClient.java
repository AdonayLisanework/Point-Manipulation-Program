import java.util.*;

public class PointClient {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Point p1 = new Point();
    Point p2 = new Point(7,13);
    Point p3 = new Point(7,15);
    int x = 0;
    int y = 0; 
    
    
    System.out.println("---After declaration, constructors invoked--- Using toString(): ");
    System.out.println("The first point is: " + p1.toString());
    System.out.println("The second point is: " + p2.toString());
    System.out.println("The third point is: " + p3.toString());
    
    System.out.println("Second point: " + p2.toString() + (p2.isVertical(p3) ? " Lines up vertically " + "with third point: " + p3.toString() : " Does not lineup vertically " + "with third point: " + p3.toString()));
    System.out.println("Second point: " + p2.toString() + (p2.isHorizontal(p3) ? " Lines up horizontally " : " Does not lineup horizontally " + "with third point: " + p3.toString()));
    
    
    System.out.println("Enter the x-coordinate for the first point: ");
    x = getInt(input);
    System.out.println("Enter the y-coordinate for the first point: ");
    y = getInt(input);
    
    p1.setTime(x,y);
    System.out.println("The first point (after call to set) is: " + p1.toString());
    
    System.out.println("Distance from origin for the first point = " + p1.distanceFromOrigin());
    System.out.println("Distance from origin for the second point = " + p2.distanceFromOrigin());
    System.out.println("Distance between first point and second point = " + p1.distance(p2));
    
    p1.translate(5,10);
    System.out.println("First point (after call to translate (5,10)) is " + p1.toString() );
    
    p2.translate(15,5);
    System.out.println("Second point (after call to translate (15,5)) is " + p2.toString() );
    
    System.out.println("---Call to equals: " + ( p1.equals(p2) ? "The 2 points are equal" : "The 2 points are NOT equal"));
    System.out.println("---Calls to copy and print---");
    p1.copy(p1);
    p2.copy(p1);
    System.out.println("The first point (after call to copy) is: " + p1.toString());
    System.out.println("The second point (after call to copy) is: " + p2.toString());
    System.out.println("---Call to equals after call to copy: " + ( p1.equals(p2) ? "The 2 points are equal" : "The 2 points are NOT equal"));
  }
  
  
  public static int getInt(Scanner input) {
    int val;
    while (true) {
      try {
        val = input.nextInt();
        break;
      } catch (InputMismatchException e) {
        System.out.println("This is not a good value. Try again");
        input.nextLine();
      }
    }
    return val;
  }
}

