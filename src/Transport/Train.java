package Transport;

public class Train extends Transport {
    private double costTrip;
    private double timeTrip;
    private String startStation;
    private String finishStation;
    private int countWagons;

    public Train(String mark, String model, String color, int year, String country, int maxSpeed, double costTrip,
                 double timeTrip, String startStation, String finishStation, int countWagons) {
        super(mark, model, color, year, country, maxSpeed);
        this.costTrip = costTrip;
        this.timeTrip = timeTrip;
        this.startStation = startStation;
        this.finishStation = finishStation;
        this.countWagons = countWagons;
    }

    public double getCostTrip() {
        return costTrip;
    }

    public void setCostTrip(double costTrip) {
        this.costTrip = Math.max(costTrip, 20);
    }

    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        this.timeTrip = Math.max(timeTrip, 20);
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = checkDefault(startStation, "default");
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = checkDefault(finishStation, "default");;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = Math.max(countWagons, 3);
    }

    public void printTrain() {
        System.out.println("Поезд " + getMark() + ", модель " + getModel() + getYear() + " год выпуска в " + getCountry() +
                ", скорость передвижения - " + getMaxSpeed() + "км/ч, отходит от " + getStartStation() + " и следует до " +
                getFinishStation() + ". Цена поездки - " + getCostTrip() + "рублей, в поезде " + getCountWagons() + "вагонов");
    }
}
