//Implementing Uses-A Relationship in Java


class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}
class DrawingTool {
    Shape shape;
    public DrawingTool(Shape shape) {
        this.shape = shape;
    }
    void drawShape() {
        System.out.println("Using the drawing tool to draw:");
        shape.draw();
    }
}
public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        DrawingTool myDrawingTool = new DrawingTool(myShape);
        myDrawingTool.drawShape();
    }
}