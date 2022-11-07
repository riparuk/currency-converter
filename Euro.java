/**
 * Subclass inherit from MataUang
 *
 * @author : Rifa Faruqi, Furqan Al Ghifari Zulva
 * @version : 1.0
 */
public class Euro extends MataUang{
    	private double amount;
	
	/**
	 * Constructor for initialize attributes
	 */
	public Euro(){
		amount = 0.0;
	}
	
	/**
	 * Constructor for initialize attributes
	 * 
	 * @param amount
	 */
	public Euro(double amount){
		this.amount = amount;
	}
	
	/**
	 * Mutator method for setting a value to attribute amount
	 * 
	 * @param amount
	 */
	public void setMataUang(double amount){
		this.amount = amount;
	}
	
	/**
	 * Method for returning converted value
	 * "IDR to USD, IDR to EUR, and vice versa"
	 * 
	 * @param matauang
	 */
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
