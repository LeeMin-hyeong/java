package practice;

class Shape{
    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}
public class pr1 {
    public static void main(String[] args) {
        Shape a=new Triangle();
        a.draw();
    }
}
