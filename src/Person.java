public class Person {

    private int birth;
    private String name;
    private String town;
    private String job;

    Person(String name, int birth, String town, String job) {
        setBirth(birth);
        setName(name);
        setTown(town);
        setJob(job);

    }

    public int getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    public void setBirth(int birth) {
        if (birth < 0) {
            birth = 0;
        } else {
            this.birth = birth;
        }
    }

    public void setName(String name) {
        this.name = Check.checkDefault(name, "Информация не указана");
    }

    public void setTown(String town) {
        this.town = Check.checkDefault(town, "Информация не указана");
    }

    public void setJob(String job) {
        this.job = Check.checkDefault(job, "Информация не указана");
    }

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + (2022 - getBirth()) + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");

    }
}
