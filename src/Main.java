public class Main {
    public static void main(String[] args) {
        Vehicle MyClass = new Vehicle() {
            @Override
            public String getColour() {
                return super.getColour();
            }

            @Override
            public void setColour(String colour) {
                super.setColour(colour);
            }

            @Override
            public void sound() {
                super.sound();
            }
        };

    }
}
