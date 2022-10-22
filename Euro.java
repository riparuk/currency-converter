/**
 * Write a description of class Euro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Euro extends MataUang{
    private double amount = 0.0;
	public void setMataUang(double amount){
		this.amount = amount;
	}
	public void toMataUang(String matauang){
		switch(matauang){
			case "USD":
				System.out.println("to USD : "+ this.amount*0.99);
				break;
			case "IDR":
				System.out.println("to IDR : "+ this.amount*15316.34);
				break;
			case "EUR":
				System.out.println("to EUR : "+this.amount*1.0);
				break;
			default:
				System.out.println("Kode matauang salah");
				
		}
	}
}
