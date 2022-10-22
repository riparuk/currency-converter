
class Rupiah extends MataUang{
	private double amount = 0.0;
	public void setMataUang(int amount){
		this.amount = amount;
	}
	public void toMataUang(String matauang){
		switch(matauang){
			case "USD":
				System.out.println("to USD : "+ this.amount/16000);
				break;
		}
	}
}
