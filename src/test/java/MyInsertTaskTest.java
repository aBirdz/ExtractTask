import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by jack4 on 2016/5/20.
 */
public class MyInsertTaskTest {

    public static void main(String[] args) {

            Date time = Calendar.getInstance().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String format = sdf.format(time);
            System.out.println(format);

    }
    private String getCurrentTime() {
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String format = sdf.format(time);
        System.out.println(format);
        return null;
    }
}