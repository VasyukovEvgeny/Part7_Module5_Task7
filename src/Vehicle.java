
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
    Car car = new Car ();
    Cycle cycle = new Cycle (15,"Green","Metal");
    public void sound() {
        System.out.println("Издает звук");
    };
    public void Main() {
        getColour();
        setColour("Black");
        sound();
        car.getColour();
        car.setColour("Black");
        car.sound();
        cycle.getColour();
        cycle.setColour("Green");
        cycle.sound();
    }

}


