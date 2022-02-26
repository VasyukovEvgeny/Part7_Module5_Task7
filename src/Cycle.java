public class Cycle extends Vehicle{
    public int speed;
    private String colour;
    protected String material;
    String material_new = new String ();
    String colour_new = new String(colour);
    public Cycle (int speed,String colour, String material){
        speed = speed;
        colour = colour;
        material = material;
    }
    public String getColour() {
        return colour;
    }
    public void setColour (String colour){
        this.colour = colour;
    }
    public void sound() {
        System.out.println("Нет звука");
    }
}
