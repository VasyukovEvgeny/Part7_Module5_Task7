public class Car extends Vehicle{
    public int speed;
    private String colour;
    protected String material;
    String material_new = new String ();
    String colour_new = new String(colour);
    public String getColour() {
        return colour;
    }
    public void setColour (String colour){
        this.colour = colour;
    }
    public void sound() {
        System.out.println("Рёв мотора");
    }
}
