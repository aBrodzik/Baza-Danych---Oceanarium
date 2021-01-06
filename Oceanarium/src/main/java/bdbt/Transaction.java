package bdbt;

public class Transaction {
	
	private int nr_klienta;
	private int nr_realizacji;
	private String data_zakupu;
	private String czy_faktura;
	
	
	
	
	
	public Transaction() {
		
	}





	public Transaction(int nr_klienta, int nr_realizacji, String data_zakupu, String czy_faktura) {
		super();
		this.nr_klienta = nr_klienta;
		this.nr_realizacji = nr_realizacji;
		this.data_zakupu = data_zakupu;
		this.czy_faktura = czy_faktura;
	}





	public int getNr_klienta() {
		return nr_klienta;
	}





	public void setNr_klienta(int nr_klienta) {
		this.nr_klienta = nr_klienta;
	}





	public int getNr_realizacji() {
		return nr_realizacji;
	}





	public void setNr_realizacji(int nr_realizacji) {
		this.nr_realizacji = nr_realizacji;
	}





	public String getData_zakupu() {
		return data_zakupu;
	}





	public void setData_zakupu(String data_zakupu) {
		this.data_zakupu = data_zakupu;
	}





	public String getCzy_faktura() {
		return czy_faktura;
	}





	public void setCzy_faktura(String czy_faktura) {
		this.czy_faktura = czy_faktura;
	}





	@Override
	public String toString() {
		return "Transaction [nr_klienta=" + nr_klienta + ", nr_realizacji=" + nr_realizacji + ", data_zakupu="
				+ data_zakupu + ", czy_faktura=" + czy_faktura + "]";
	}

	
	
	
}
