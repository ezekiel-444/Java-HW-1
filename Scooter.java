package homeworks.hw1.scooter;

public class Scooter {

    // Unique identifier for the scooter.
    private int id;

    // Model name of the scooter (e.g., Sparrow X10).
    private String model;

    // Current battery level (percentage).
    private int batteryLevel;

    // Scooter location;
    private double x, y;

    // Indicates if the scooter is available
    private boolean available;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Scooter() {
        this.batteryLevel = 100; // Set initial battery level to 100%
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

