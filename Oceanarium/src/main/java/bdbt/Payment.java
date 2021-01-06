package bdbt;

public class Payment {
	
	private int nr_wynagrodzenia;
	private String data_wynagrodzenia;
	private int kwota_pod;
	private int kwota_dod;
	private int nr_pracownika;
	
	
	
	
	public Payment() {
		
	}




	public Payment(int nr_wynagrodzenia, String data_wynagrodzenia, int kwota_pod, int kwota_dod, int nr_pracownika) {
		super();
		this.nr_wynagrodzenia = nr_wynagrodzenia;
		this.data_wynagrodzenia = data_wynagrodzenia;
		this.kwota_pod = kwota_pod;
		this.kwota_dod = kwota_dod;
		this.nr_pracownika = nr_pracownika;
	}




	public int getNr_wynagrodzenia() {
		return nr_wynagrodzenia;
	}




	public void setNr_wynagrodzenia(int nr_wynagrodzenia) {
		this.nr_wynagrodzenia = nr_wynagrodzenia;
	}




	public String getData_wynagrodzenia() {
		return data_wynagrodzenia;
	}




	public void setData_wynagrodzenia(String data_wynagrodzenia) {
		this.data_wynagrodzenia = data_wynagrodzenia;
	}




	public int getKwota_pod() {
		return kwota_pod;
	}




	public void setKwota_pod(int kwota_pod) {
		this.kwota_pod = kwota_pod;
	}




	public int getKwota_dod() {
		return kwota_dod;
	}




	public void setKwota_dod(int kwota_dod) {
		this.kwota_dod = kwota_dod;
	}




	public int getNr_pracownika() {
		return nr_pracownika;
	}




	public void setNr_pracownika(int nr_pracownika) {
		this.nr_pracownika = nr_pracownika;
	}




	@Override
	public String toString() {
		return "Payment [nr_wynagrodzenia=" + nr_wynagrodzenia + ", data_wynagrodzenia=" + data_wynagrodzenia
				+ ", kwota_pod=" + kwota_pod + ", kwota_dod=" + kwota_dod + ", nr_pracownika=" + nr_pracownika + "]";
	}

	
	
	
	
}
