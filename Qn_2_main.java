package wk05_lab;

public class Qn_2_main {
    public static void main(String[] args){
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle t = new Triangle(10, 8);
        Cicle2 c = new Cicle2(5,5);
        Eclipse e = new Eclipse(7, 7);
        Square s = new Square(6, 6);
        
        Shape figuref = r;
        System.out.println("Inside Area of Rectangle");
        System.out.println("Area is " + figuref.area());
        figuref = t;
        System.out.println("Inside Area of Triangle");
        System.out.println("Area is " + figuref.area());
        figuref = c;
        System.out.println("Inside Area of Circle");
        System.out.printf("Area is " + "%.2f", figuref.area());
        figuref = e;
        System.out.println("\nInside Area of Ellipse");
        System.out.printf("Area is " + "%.2f", figuref.area());
        figuref = s;
        System.out.println("\nInside Area of Square");
        System.out.println("Area is " + figuref.area());



    }
}
