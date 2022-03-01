package wk05_lab;

public class TestCircleRectangle {
    public static void main(String[] args){

        Circle CircleObject = new Circle(1.0);

        System.out.println("A circle " + CircleObject.toString()); //method in parent
        System.out.println("The colour is " + CircleObject.getColour()); //method in parent
        System.out.println("The radius is " + CircleObject.getRadius()); //method in child
        System.out.println("The area is " + CircleObject.getArea()); //method in child
        System.out.println("The diameter is " + CircleObject.getDiameter()); //method in child
        



        Rectangle RectangleObject = new Rectangle(2,4);
        System.out.println("\nA Rectangle " + RectangleObject.toString());
        System.out.println("The area is " + RectangleObject.getArea());
        System.out.println("The perimeter is " + RectangleObject.getPerimeter());

    }
    
}
