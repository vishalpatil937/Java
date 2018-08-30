import java.util.Scanner;

public class Switch_Enum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip_enum="";
		
		while(ip_enum!="BASS") {
			ip_enum=sc.next().toUpperCase();
			Seasons s=Seasons.valueOf(ip_enum);
		
			switch(s) {
				case RAINY:
					System.out.println("Pavsala");
					break;
				case AUTUM:
					System.out.println("Autum");
					break;
				case SUMMER:
					System.out.println("Unhala");
					break;
				case SPRING:
					System.out.println("Spring");
					break;
				case WINTER:
					System.out.println("Hiwala");
					break;
			}
		}
	}
}
