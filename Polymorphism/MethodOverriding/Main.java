package Polymorphism.MethodOverriding;

public class Main{
    public static void main(String[] args) {
     Shapes shape = new Shapes();
     Circle circle = new Circle();
     Square square = new Square();
     Triangle triangle = new Triangle();
     triangle.area();
     shape.area();
     circle.area();
     square.area();
    }
}
