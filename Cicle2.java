package wk05_lab;

public class Cicle2 extends Shape {
    
    public Cicle2(double dim1,double dim2){
        super(dim1, dim2);
    }

    public double area(){
        return super.PI*dim1*dim2;
    }
}
