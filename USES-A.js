//Implementing Uses-A Relationship in JavaScript


class Shape {
    draw() {
      console.log("Drawing a shape.");
    }
  }
  class DrawingTool {
    constructor(shape) {
      this.shape = shape;
    }
    drawShape() {
      console.log("Using the drawing tool to draw:");
      this.shape.draw();
    }
  }
  function main() {
    const myShape = new Shape();
    const myDrawingTool = new DrawingTool(myShape);
    myDrawingTool.drawShape();
  }
  main();