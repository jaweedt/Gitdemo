import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Calen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cc = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
		   System.out.println(    sd.format(cc.getTime()));
	System.out.println(	cc.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.WEEK_OF_MONTH);
	System.out.println(Calendar.YEAR);	
	System.out.println(cc.getTime());
	System.out.println(cc.getTimeZone());
	System.out.println(cc.getCalendarType());
		
	}

}
