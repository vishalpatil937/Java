import java.util.Scanner;

public class SeasonClass{
	public static void main(String[] args) {
		Seasons season=Seasons.RAINY;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a season");
		String ip_season=sc.next();
//		if(Seasons.RAINY.toString().equals(ip_season))
		if(String.valueOf(Seasons.RAINY).equalsIgnoreCase(ip_season)){
			System.out.println("Season - Rainy");
		}
		else {
			System.out.println("Or so you think");
		}
	}
}
