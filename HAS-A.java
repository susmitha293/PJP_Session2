//Implementing Has-A Relationship in Java


class Shape {
    String type;
    public Shape(String type) {
        this.type = type;
    }
    void draw() {
        System.out.println("Drawing a " + type);
    }
}
class Drawing {
    Shape drawingShape;
    public Drawing(Shape drawingShape) {
        this.drawingShape = drawingShape;
    }
    void drawPicture() {
        System.out.println("Creating a picture by drawing:");
        drawingShape.draw();
    }
}
public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape("Circle");
        Drawing myDrawing = new Drawing(myShape);
        myDrawing.drawPicture();
    }
}
