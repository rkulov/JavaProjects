import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class DaysBetween2Dates {
	

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String date1 = in.next();
		String date2 = in.next();
		String[] firstDate = date1.split("-");
		String[] secondDate = date2.split("-");
		DateTime one = new DateTime(
		Integer.parseInt(firstDate[2]),Integer.parseInt(firstDate[1]),
		Integer.parseInt(firstDate[0]),0,0);
		DateTime two = new DateTime(
				Integer.parseInt(secondDate[2]),Integer.parseInt(secondDate[1]),
				Integer.parseInt(secondDate[0]),0,0);
		int days = Days.daysBetween(one,two).getDays();
		System.out.println(days);
		
	}

}
