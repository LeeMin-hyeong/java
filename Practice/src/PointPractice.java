import java.util.HashSet;
import java.util.Objects;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object e){
        Point p=(Point)e;
        return (this.x==p.x)&&(this.y==p.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    @Override
    public String toString() {
        return "Point("+x+", "+y+")";
    }
}
class Circle{
    Point center;
    int radius;
    Circle(Point center, int radius){
        this.center=center;
        this.radius=radius;
    }
    @Override
    public boolean equals(Object o){
        Circle c=(Circle)o;
        return (c.center.equals(center))&&(c.radius==radius);
    }
    @Override
    public int hashCode(){
        return Objects.hash(center, radius);
    }
    @Override
    public String toString(){
        return "center="+center.toString()+", radius="+radius;
    }
}

public class PointPractice {
    public static void main(String[] args) {
        HashSet<Circle> set=new HashSet<Circle>();
        set.add(new Circle(new Point(1, 2), 1));
        set.add(new Circle(new Point(1, 2), 2));
        set.add(new Circle(new Point(1, 2), 3));
        set.add(new Circle(new Point(1, 2), 1));
        set.add(new Circle(new Point(1, 2), 1));
        for(Circle c:set){
            System.out.println(c.toString());
        }
    }
}
