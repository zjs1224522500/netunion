import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HelloWordle5 {
	public static void main(String[] args) throws ParseException {
		{ 
			SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
			//创建Date对象，表示当前时间
		    SimpleDateFormat sf1=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		    SimpleDateFormat sf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    
		    //创建当前对象，表示当前时间
		    Date date=new Date();
		    //调用format方法
			System.out.println(sf.format(date));
			System.out.println(sf1.format(date));
			System.out.println(sf3.format(date));
			String b="2014-6-1 21:01:28";
			SimpleDateFormat sf5=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date d=sf5.parse(b);
			 System.out.println(d);
	}
	}
	

}
 

		