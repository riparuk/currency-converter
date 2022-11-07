import java.util.Scanner;

/**
 * Main Class for running the program
 *
 * @author : Rifa Faruqi, Furqan Al Ghifari Zulva
 * @version : 1.0
 */
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		MataUang MU = new Rupiah();
		
		System.out.print("From : ");
		String from = in.nextLine();
		
		System.out.print("To : ");
		String to = in.nextLine();
		
		System.out.print("Amount : ");
		double amount = in.nextDouble();
		
		switch(from){
			case "IDR":
				MU = new Rupiah();
				break;
			case "USD":
				MU = new Dollar();
				break;
			case "EUR":
				MU = new Euro();
				break;
			default:
				System.out.println("Input Salah");
		}
		MU.setMataUang(amount);
		MU.toMataUang(to);
		
	}
}
