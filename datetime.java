import java.time.LocalDate;
import java.time.LocalTime;

public class datetime {

    public void dateex(){

        LocalDate date= LocalDate.now();
        System.out.println("Date : " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        System.out.println(time.getHour() +":" +time.getMinute()+ ":" + time.getSecond());
    }

    public static void main(String[] args) {
        datetime d = new datetime();
        d.dateex();
    }
    
}
