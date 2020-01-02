
import MyPoint.MyPoint;

import java.util.Objects;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Circle {
    private MyPoint center;
    private double radius;

    public Circle()
    {
        center = new MyPoint(0,0);
        radius = 1;
    }

    public Circle(MyPoint center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(MyPoint point)
    {
        if ((point.getX() - center.getX()) * (point.getX()-center.getX())
                + (point.getY()-center.getY())*(point.getX()-center.getX())
                <= radius*radius){
                return true;
        }
        return false;
    }

    public void draw() {
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setTitle("Circle visualization");
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            public void paint(Graphics graphics) {
                var graphics2D = (Graphics2D)graphics;

                double x = center.getX() - radius;
                double y = center.getY() - radius;
                double width = radius * 2;
                double height = radius * 2;

                Shape circle = new Ellipse2D.Double(x, y, width, height);

                graphics2D.draw(circle);
            }
        };

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Circle){
            Circle circle = (Circle) o;
            return circle.radius == radius
                    && circle.center == center;
        }
        else return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public String toString() {
        return "Circle" +"(center: "+center+", "+"radius: "+radius+")";
    }
}
