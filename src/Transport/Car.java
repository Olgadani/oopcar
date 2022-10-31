package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double volume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seats;
    private boolean winterTires;
    private Key key;


    public Car(String mark, String model, double volume, String color, int year, String country,
               String transmission, String bodyType, String regNumber, int seats, boolean winterTires, int maxSpeed) {
        super(mark, model, color, year, country, maxSpeed);

        this.mark = checkDefault(mark, "default");
        this.model = checkDefault(model, "default");
        setVolume(volume);
        setColor(color);
        setYear(year);
        setCountry(country);
        setTransmission(transmission);
        this.bodyType = checkDefault(bodyType, "default");
        setRegNumber(regNumber);
        this.seats = Math.max(seats, 4);
        setWinterTires(winterTires);
        this.maxSpeed = getMaxSpeed();
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public boolean isWinterTires() {
        return winterTires;
    }


    public void setWinterTires(boolean winterTires) {
        int month = LocalDate.now().getMonthValue();
        this.winterTires = month <= 4 || month >= 11;
    }

    public int getSeats() {
        return seats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean checkNumber() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isLetter(regNumberChars[4])
                && isLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isLetter(char symbol) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return symbols.contains("" + symbols);
    }


    public double getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = checkDefault(transmission, "default");
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setVolume(double volume) {
        this.volume = Math.max(volume, 1.5);
    }

    public void setYear(int year) {
        this.year = Math.max(year, 2000);
    }

    public void setCountry(String country) {
        this.country = checkDefault(country, "default");
    }

    public void printCar() {
        System.out.println("Автомобиль: " + getMark() + getModel() + ", " + getYear() + " год выпуска, сборка - "
                + getCountry() + ", " + getColor() + " цвет кузова, объем двигателя - " + getVolume() +
                " л, коробка передач - " + getTransmission() + ", тип кузова - " + getBodyType() +
                ", регистрационный номер - " + getRegNumber() + ", количество мест - " + getSeats() +
                ", максимальная скорость - " + getMaxSpeed());
    }
}
