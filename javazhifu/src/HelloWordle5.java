import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HelloWordle5 {
	public static void main(String[] args) throws ParseException {
		{ 
			SimpleDateFormat sf=new SimpleDateFormat("yyyy��MM��dd��  HHʱmm��ss��");
			//����Date���󣬱�ʾ��ǰʱ��
		    SimpleDateFormat sf1=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		    SimpleDateFormat sf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    
		    //������ǰ���󣬱�ʾ��ǰʱ��
		    Date date=new Date();
		    //����format����
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
 

		