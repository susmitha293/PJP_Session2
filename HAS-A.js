//Implementing Has-A Relationship in JavaScript


class Shape {
    constructor(type) {
        this.type = type;
    }
    draw() {
        console.log("Drawing a " + this.type);
    }
}
class Drawing {
    constructor(drawingShape) {
        this.drawingShape = drawingShape;
    }
    drawPicture() {
        console.log("Creating a picture by drawing:");
        this.drawingShape.draw();
    }
}
const myShape = new Shape("Circle");
const myDrawing = new Drawing(myShape);
myDrawing.drawPicture();
