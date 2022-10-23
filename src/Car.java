public class Car {
    String mark;
    String model;
    double volume;
    String color;
    int year;
    String country;

    public Car(String mark, String model, double volume, String color, int year, String country) {
        if (mark.equals("")) {
            this.mark = "default";
        } else {
            this.mark = mark;
        }
        if (model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (volume <= 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }

        if (color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {this.year = year;}
        if (country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }

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

    void printCar() {
        System.out.println("Автомобиль: " + getMark() + getModel() + ", " + getYear() + " год выпуска, сборка - " + getCountry() + ", " + getColor() + " цвет кузова, объем двигателя - " + getVolume() + " л.");
    }
}
