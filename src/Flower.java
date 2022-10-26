public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = Check.checkDefault(flowerColor, "белый");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = Check.checkDefault(country, "Россия");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = Math.max(lifeSpan, 3);
    }

    public void printFlower() {
        System.out.println(getFlowerColor() + ", страна - " + getCountry() + ", стоимость штуки - " + getCost() + "рублей, срок стояния - " + getLifeSpan() + "дней.");
    }

}
