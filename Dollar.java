/**
 * Write a description of class Dollar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dollar extends MataUang{
   private double amount = 0.0;
	public void setMataUang(double amount){
		this.amount = amount;
	}
	public void toMataUang(String matauang){
		switch(matauang){
			case "USD":
				System.out.println("to USD : "+ this.amount*1.0);
				break;
			case "IDR":
				System.out.println("to IDR : "+ this.amount*15537.20);
				break;
			case "EUR":
				System.out.println("to EUR : "+this.amount*1.01);
				break;
			default:
				System.out.println("Kode matauang salah");
				
		}
	}
}
