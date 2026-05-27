
class Shape{
    void draw(){
        System.out.println("Drawing Shape");

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class hierarchial_inherit {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        r.draw();
        }
    
}
