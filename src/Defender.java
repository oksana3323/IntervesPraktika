import java.time.LocalDate;
import java.time.Period;

public class Defender extends Athlete{


    public Defender(String name, String lastName, Period age, int height, int weight) {
        super(name, lastName, age, height, weight);
    }



    @Override
    public void playName() {
        System.out.println(getName());
    }

    @Override
    public void playLastName() {
        System.out.println(getLastName());
    }

    @Override
    public void playerAge() {
        System.out.println(getAge());
    }

    @Override
    public void playerHeight() {
        System.out.println(getHeight());
    }

    @Override
    public void playersWaught() {
        System.out.println(getWeight());
    }
}


