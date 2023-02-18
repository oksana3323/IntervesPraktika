import java.time.LocalDate;
import java.time.Period;

public abstract class Athlete implements Players {
    private String name;
    private String LastName;
    private Period age;
    private int height;
    private int weight;

    public Athlete(String name, String lastName, Period age, int height, int weight) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Athlete() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(Period age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public Period getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}