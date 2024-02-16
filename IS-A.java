//Implementing Is-A Relationship in Java


class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();
        myCircle.drawCircle();
    }
}