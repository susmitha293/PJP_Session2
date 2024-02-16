//Implementing Is-A Relationship in JavaScript


function Shape() {}
Shape.prototype.draw = function() {
    console.log("Drawing a shape.");
};
function Circle() {
    Shape.call(this);
}
Circle.prototype = Object.create(Shape.prototype);
Circle.prototype.constructor = Circle;
Circle.prototype.drawCircle = function() {
    console.log("Drawing a circle.");
};
var myCircle = new Circle();
myCircle.draw();
myCircle.drawCircle();