package wk05_lab;
import java.util.Date;

public class GeometricObject {

    //variables
    private String colour;
    private boolean filled;
    private Date dateCreated;
    
    //it can also be "private java.util.Date dateCreated" if no import statement

    //Constructors
    public GeometricObject(){
        this.colour = "white";
        this.filled = false;
        this.dateCreated = new Date();
        //it can also be "this.dateCreated = new java.util.Date()" if no import statement

    }
    public GeometricObject(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    //setters
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setfilled(boolean filled){
        this.filled = filled;
    }
    //getters
    public String getColour(){
        return this.colour;
    }
    public boolean isfilled(){
        return this.filled;
    }
    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }
    //methods
    public String toString(){
        System.out.println();
        return "created on " + this.dateCreated + "\n" +
        "Colour: " + this.getColour() + 
        " and filled: " + this.isfilled();
        
    }

    
}
