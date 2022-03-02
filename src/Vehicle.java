
public abstract class Vehicle {
    public int speed;
    private String colour;
    protected String material;
    public String getColour() {
        return colour;
    }
    public void setColour (String colour){
        this.colour = colour;
    }
    public void sound() {
        System.out.println("Издает звук");
    };


}


