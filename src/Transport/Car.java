package Transport;

import java.time.LocalDate;

public class Car {
    private String mark;
    private String model;
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

    public Car(String mark, String model, double volume, String color, int year, String country, String transmission, String bodyType, String regNumber, int seats, boolean winterTires) {
        setMark(mark);
        setModel(model);
        setVolume(volume);
        setColor(color);
        setYear(year);
        setCountry(country);
        setTransmission(transmission);
        this.bodyType = bodyType;
        setRegNumber(regNumber);
        this.seats = seats;
        setWinterTires(winterTires);
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

    public void setMark(String mark) {
        this.mark = checkDefault(mark, "default");
    }

    public void setModel(String model) {
        this.model = checkDefault(model, "default");
    }

    public void setVolume(double volume) {
        if (volume <= 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }
    }

    public void setColor(String color) {
        this.color = checkDefault(color, "белый");
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public void setCountry(String country) {
        this.country = checkDefault(country, "default");
    }
    public String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }
    public void printCar() {
        System.out.println("Автомобиль: " + getMark() + getModel() + ", " + getYear() + " год выпуска, сборка - " + getCountry() + ", " + getColor() + " цвет кузова, объем двигателя - " + getVolume() + " л, коробка передач - " + getTransmission() + ", тип кузова - " + getBodyType() + ", регистрационный номер - " + getRegNumber() + ", количество мест - " + getSeats());
    }
}
