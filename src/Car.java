public class Car {
    private String mark;
    private String model;
    private double volume;
    private String color;
    private int year;
    private String country;

    public Car(String mark, String model, double volume, String color, int year, String country) {
        setMark(mark);
        setModel(model);
        setVolume(volume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setMark(String mark) {
        this.mark = Check.checkDefault(mark, "default");
    }

    public void setModel(String model) {
        this.model = Check.checkDefault(model, "default");
    }

    public void setVolume(double volume) {
        if (volume <= 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }
    }

    public void setColor(String color) {
        this.color = Check.checkDefault(color, "белый");
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public void setCountry(String country) {
        this.country = Check.checkDefault(country, "default");
    }

    void printCar() {
        System.out.println("Автомобиль: " + getMark() + getModel() + ", " + getYear() + " год выпуска, сборка - " + getCountry() + ", " + getColor() + " цвет кузова, объем двигателя - " + getVolume() + " л.");
    }
}
