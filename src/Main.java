import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Athlete couch= new Trainer("Rusam","lochorov");

        LocalDate date1 = LocalDate.of(2002, 1, 1);
        LocalDate date2 = LocalDate.of(2003, 01, 19);


        LocalDate date3 = LocalDate.of(1998, 4, 9);
        LocalDate date4 = LocalDate.of(1999, 01, 19);


        LocalDate date5 = LocalDate.of(2003, 10, 10);

        Period period1=Period.between(date1, LocalDate.ofEpochDay(LocalDate.now().getYear()));
        Period period2=Period.between(date2, LocalDate.ofEpochDay(LocalDate.now().getYear()));
        Period period3=Period.between(date3, LocalDate.ofEpochDay(LocalDate.now().getYear()));
        Period period4=Period.between(date4, LocalDate.ofEpochDay(LocalDate.now().getYear()));
        Period period5=Period.between(date5, LocalDate.ofEpochDay(LocalDate.now().getYear()));
        Players players = new Forwards("Temirlan",
                "Jusukulov", period5, 20, 170, 70);
        Players players1 = new Forwards("Ernazar", "Asanbekov", period1, 20, 185, 8);
        Players waratara = new waratara("Davran", "Joldoshbekov", period2, 20, 187, 70);
        Players attack = new Forwards("Abdumomun", "Adu", period3, 18, 175, 60);

        Players attack1=new Forwards("Ulan","Kubanychbekov",period4,23,175,75);

      

Players[]players2={attack1,attack,players,players1,waratara,couch};
        for (Players p:players2){
            System.out.println(p);
        p.playerAge();
        p.playerHeight();
        p.playerHeight();
       p.playersWaught();
        }

              {

        }


    }}