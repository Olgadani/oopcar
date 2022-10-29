import static java.lang.Integer.MAX_VALUE;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public float getCost() {
        float sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum;
    }

    public int getLifespan() {
        int sumLife = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < sumLife) {
                sumLife = flower.getLifeSpan();
            }
        }
        return sumLife;
    }

}
