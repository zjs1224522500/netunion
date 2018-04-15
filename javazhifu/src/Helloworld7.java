import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Helloworld7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now =sdf.format(date);
        System.out.println("当前时间："+now);
	}

}
