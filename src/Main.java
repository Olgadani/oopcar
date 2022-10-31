import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Maksim", 35, "Minsk", "бренд - менеджер");
        Person any = new Person("Anya", 29, "Moscow", "методист образовательных программ");
        Person kate = new Person("Kate", 28, "Kaliningrad", "продакт - менеджер");
        Person artem = new Person("Artem", 27, "Moscow", "директор по развитию бизнеса");
        maksim.printGreeting();
        any.printGreeting();
        kate.printGreeting();
        artem.printGreeting();
        Person vladimir = new Person("Vladimir", 21, "Kazan", "");
        vladimir.printGreeting();

        Car lada = new Car("Lada", "Granta", 0, "", 2015, "Россия", "",
                "","", 4,true, 110);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",
                "", "", "", 4,false, 120);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "",
                "", "", 4, false, 150);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "", "", "", 4, true, 120);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "", "", "", 4, true, 120);
        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();

        Train lastochka = new Train("Ласточка", "В-901", "", 2011, "Россия", 301,
                3500, 0, "Белорусский вокзал", "станция Минск-Пассажирский", 11);
        lastochka.printTrain();
        Train leningrad = new Train("Ленинград", "D-125", "", 2019, "Россия", 270,
                1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        leningrad.printTrain();
        Bus ikarus = new Bus("", "", "", 2000, "", 100);
        Bus paz = new Bus("", "", "", 2000, "", 100);
        Bus uaz = new Bus("", "", "", 2000, "", 100);
        ikarus.printBus();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", 15.00, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower hypsofila = new Flower("Гипсофила", "Турция",19.5 ,10);
        rose.printFlower();
        chrysanthemum.printFlower();
        pion.printFlower();
        hypsofila.printFlower();
        Bouquet bouquet = new Bouquet(new Flower[]{rose, pion, rose, hypsofila });
        System.out.println("Цена букета " + bouquet.getCost());
        System.out.println("Срок стояния букета " + bouquet.getLifespan() + "дня.");
    }
}
