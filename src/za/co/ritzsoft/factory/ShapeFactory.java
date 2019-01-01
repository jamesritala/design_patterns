package za.co.ritzsoft.factory;

public class ShapeFactory {

    public static Shape getShape(String type){
        switch(type){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
             default:
                 return null;
        }
    }
}
