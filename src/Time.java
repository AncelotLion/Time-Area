import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    public void getTime(){
        String date = "";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        System.out.println("Вычисления производились: " + date);
    }
}
