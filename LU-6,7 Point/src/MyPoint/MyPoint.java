package MyPoint;

import java.util.Objects;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setLocation(double x, double y)
    {
        if (x < 0 || y < 0)
            throw new IllegalArgumentException();

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceFromOrigin(){
        return Math.sqrt(x*x + y*y);
    }

    public void translate(double dx, double dy)
    {
        if (x + dx < 0 || y + dy < 0)
            throw new IllegalArgumentException();
        x += dx;
        y += dy;
    }

    public double distanceTo(MyPoint p)
    {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }

    @Override
    public String toString()
    {
        return "("+ x +", "+ y +")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this == o)
            return true;

        if (o instanceof MyPoint){
            MyPoint myPoint = (MyPoint)o;
            return x == myPoint.x && y == myPoint.y;
        }
        else return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

