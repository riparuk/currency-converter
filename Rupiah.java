
class Rupiah extends MataUang{
	private double amount = 0.0;
	public void setMataUang(double amount){
		this.amount = amount;
	}
	public void toMataUang(String matauang){
		switch(matauang){
			case "USD":
				System.out.println("to USD : "+ this.amount*0.000064);
				break;
			case "EUR":
				System.out.println("to EUR : "+this.amount*0.000065);
				break;
			default:
				System.out.println("Kode matauang salah");
				
		}
	}
}
