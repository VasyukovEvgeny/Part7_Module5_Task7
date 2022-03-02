public class Car extends Vehicle{
    public int long_size;
    private String description;
    protected String driver_name;
//    Car car = new Car ();
    String material_new = new String ();
    String colour_new = new String(description);
    public String getdesription() {
        return description;
    }
    public void setdescription (String description){
        this.description = description;
    }
    public void sound() {
        System.out.println("Рёв мотора");
    }
}
