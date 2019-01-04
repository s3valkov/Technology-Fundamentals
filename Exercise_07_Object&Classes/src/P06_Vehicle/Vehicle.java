package P06_Vehicle;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.setType(type);
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    private void setType(String type) {
        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public String getColor() {

        return this.color;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                        "Model: %s\n" +
                        "Color: %s\n" +
                        "Horsepower: %d"
                , this.getType()
                , this.getModel()
                , this.getColor()
                , this.getHorsePower());
    }
}
