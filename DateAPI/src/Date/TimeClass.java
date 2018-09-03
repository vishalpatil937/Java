package Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//import javax.swing.text.html.parser.ParserDelegator;

public class TimeClass {
	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println("Today:"+l);
		System.out.println("Yest:"+l.minusDays(1));
		System.out.println("Tom:"+l.plusDays(1));
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMM yyyy");
		String formattedString=l.format(formatter);
		System.out.println(formattedString);
//		LocalDate parsedDate=LocalDate.parse(formattedString, formatter);
//		System.out.println(parsedDate);

	}
}
