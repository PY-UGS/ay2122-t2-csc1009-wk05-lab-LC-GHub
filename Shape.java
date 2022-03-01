package wk05_lab;

abstract class Shape {
    public double dim1;
    public double dim2;
    public double PI;

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = Math.PI;
    }

    //Abstract method
    public abstract double area();{
        //THIS IS AN ABSTRACT METHOD, NO BODY NEEDED!!!!

    }
    
}
