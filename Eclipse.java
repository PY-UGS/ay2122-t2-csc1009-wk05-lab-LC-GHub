package wk05_lab;

public class Eclipse extends Shape {

    public Eclipse(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        return super.PI*dim1*dim2;
    }
    
}
