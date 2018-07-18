import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static void main (String args[]){
		
		Date date =  new Date(1527733730000l);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formatter.format(date));
	}
}
