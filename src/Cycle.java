public class Cycle extends Vehicle{
    public int size;
    private String brand;
    protected int weight;
    String material_new = new String ();
    String brand_new = new String(brand);
    public Cycle (int speed,String colour, String material){
        speed = speed;
        colour = colour;
        material = material;
    }
    public String getbrand() {
        return brand;
    }
    public void setbrand (String brand){
        this.brand = brand;
    }
    public void sound() {
        System.out.println("Нет звука");
    }
}
