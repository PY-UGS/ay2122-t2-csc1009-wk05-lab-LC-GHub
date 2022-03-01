package wk05_lab;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    //constructor
    public Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.height = height;
        //super.setColour(colour);
        //super.setfilled(filled);
    }

    //getters
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height*2)+(this.width*2);
    }

    //setters
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
}
