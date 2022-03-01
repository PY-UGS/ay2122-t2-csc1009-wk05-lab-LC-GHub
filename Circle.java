package wk05_lab;

public class Circle extends GeometricObject {
    private double radius;

    //Constructor
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String colour, boolean filled){
        super(colour, filled);
        this.radius = radius;
        //super.setColour(colour); can do this to set colour also
        //super.setfilled(filled); can do this to set fill also
    }
    //getters
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    public double getDiameter(){
        return 2*this.radius;
    }
    public void PrintCircle(){
        System.out.println("Radius is " + getRadius());
        System.out.println("Area is " + getArea());
        System.out.println("Perimeter is " + getPerimeter());
        System.out.println("Diameter is " + getDiameter());
    }
    //Setters
    public void setRadius(double Radius){
        this.radius = radius;
    }



    
}
