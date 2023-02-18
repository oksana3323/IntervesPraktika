import java.time.LocalDate;

public class Trainer  extends Athlete{
private  String name;
private  String lastName;

    public Trainer(String name, String lastName) {
        super();
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void playName() {

    }

    @Override
    public void playLastName() {

    }

    @Override
    public void playerAge() {

    }

    @Override
    public void playerHeight() {

    }

    @Override
    public void playersWaught() {

    }
}




