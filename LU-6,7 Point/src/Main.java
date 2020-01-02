import MyPoint.MyPoint;
import java.awt.*;
public class Main {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(7,2);
        System.out.println("p1's distance from the origin = "+p1.getDistanceFromOrigin());
        MyPoint p2 = new MyPoint(4,3);
        System.out.println("p2's distance from the origin = "+p2.getDistanceFromOrigin());
        //p1.setLocation(18,8);
        //p2.setLocation(5,10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("distance from p1 to p2 = " + p1.distanceTo(p2));

        p2.setLocation(7,3);
        System.out.println(p1.equals(p2));
        Circle c = new Circle(p1,5);
        System.out.println(c);
        System.out.println(c.contains(p2));

        Circle circle = new Circle(new MyPoint(100, 100),50);
        circle.draw();

        LineSegment lS = new LineSegment(new MyPoint(0,0), new MyPoint(500,500));
        lS.draw();

    }
}
