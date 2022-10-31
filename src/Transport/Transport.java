package Transport;

public class Transport {
    protected String mark;
    protected String model;
    private String color;
    private int year;
    private String country;
    protected int maxSpeed;

    public Transport(String mark, String model, String color, int year, String country, int maxSpeed) {
        this.mark = checkDefault(mark, "default");
        this.model = checkDefault(model, "default");
        setColor(color);
        this.year = year;
        this.country = checkDefault(country, "Россия");
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = checkDefault(color, "белый");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 150);
    }
    public String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }
}
