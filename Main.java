import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		MataUang IDR;
		
		System.out.print("From : ");
		String from = in.nextLine();
		
		System.out.print("To : ");
		String to = in.nextLine();
		
		System.out.print("Amount : ");
		double amount = in.nextDouble();
		
		IDR = new Rupiah();
		IDR.setMataUang(amount);
		IDR.toMataUang(to);
		
	}
	}
