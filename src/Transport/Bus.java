package Transport;

public class Bus extends Transport{


    public Bus(String mark, String model, String color, int year, String country, int maxSpeed) {
        super(mark, model, color, year, country, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Бензин или дизель");
    }

    public void printBus() {
        System.out.println("Марка - " + getMark() + ", модель - " + getModel() + ", цвет - " + getColor() + ", страна сборки - " +
                getCountry() + ", максимальная скорость - " + getMaxSpeed() + ", год изготовления " + getYear());
    }
}
