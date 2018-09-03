package Date;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class BankAccountList {
	public static void main(String[] args) {
		ArrayList<BankAccount> bankacc=new ArrayList<>();
		
		bankacc.add(new BankAccount(23, "Abcs", 50000));
		bankacc.add(new BankAccount(23, "Asdhg", 58000));
		bankacc.add(new BankAccount(23, "Yghdb", 2000));
		bankacc.add(new BankAccount(23, "Ujbd", 125000));
		bankacc.add(new BankAccount(23, "HDbxv", 985000));
		bankacc.add(new BankAccount(23, "RWTvg", 70000));
		bankacc.add(new BankAccount(23, "Axfw", 15000));
		
//		ArrayList<BankAccount> result=new ArrayList<>();
		
		System.out.println(bankacc.stream()
				.max(comparing(BankAccount::getAccBal))
				);
		
		System.out.println(bankacc.stream()
				.filter(p->p.getAccName().charAt(0)=='A')
				.collect(toList())
				);
		
		System.out.println(bankacc.stream()
				.min(comparing(BankAccount::getAccBal))
				);
				
		System.out.println(bankacc.stream()
				.filter(p->p.getAccName().charAt(0)=='A')
				.max(comparing(BankAccount::getAccBal))
				);
	
		System.out.println(bankacc.stream()
				.sorted(comparing(BankAccount::getAccBal))
				.collect(toList())
				);
	}
}
