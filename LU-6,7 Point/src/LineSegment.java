import MyPoint.MyPoint;

import javax.sound.sampled.Line;
import java.util.Objects;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

public class LineSegment {
    private MyPoint point1;
    private MyPoint point2;

    public LineSegment(MyPoint p1, MyPoint p2){
        point1 = p1;
        point2 = p2;
    }

    public double computeSlope() throws Exception {
        if (point1.getX() == point2.getX())
            throw new Exception("Ivalid Operation");

        return (point2.getY()-point1.getY())/(point2.getX()-point2.getX());
    }
    public void draw() {
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setTitle("LineSegment visualization");
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            public void paint(Graphics graphics) {
                var graphics2D = (Graphics2D)graphics;

                Shape line = new Line2D.Double(point1.getX(), point1.getY(), point2.getX(), point2.getY());

                graphics2D.draw(line);
            }
        };

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public String toString() {
        return "LineSegment{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof LineSegment) {
            LineSegment that = (LineSegment) o;
            return point1 == that.point1 && point2 == that.point2;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }
}
