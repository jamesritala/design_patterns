package za.co.ritzsoft.factory;

public class ShapeFactoryDemo {

    public static void main(String []args){
        Shape shape1= ShapeFactory.getShape("Circle");
        Shape shape2= ShapeFactory.getShape("Rectangle");
        Shape shape3= ShapeFactory.getShape("Square");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
