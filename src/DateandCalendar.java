import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d  =new Date();
		System.out.println(d.toString());
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sf.format(d));
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sd.format(d));
		
		
	}

}
