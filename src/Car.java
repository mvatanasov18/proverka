
public class Car {
    private String brand;
    private String model;
    private double fuel;
    private float fuelCompsuption;

    public Car(){
        this.brand="VW";
        this.model="Golf";
        this.fuel=30.0f;
        this.fuelCompsuption=4.3f;
    }
    public Car(String brand,String model){
        this();
        this.brand=brand;
        this.model=model;
    }
    public Car(String brand,String m,double f,float fC){
        this(brand,m);
        this.fuel=f;
        this.fuelCompsuption=fC;
    }

    public float getFuelCompsuption() {
        return fuelCompsuption;
    }

    public void setFuelCompsuption(float fuelCompsuption) {
        this.fuelCompsuption = fuelCompsuption;
    }

    public double getFuel() {
        return fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

