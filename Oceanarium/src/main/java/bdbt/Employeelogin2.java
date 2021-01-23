package bdbt;

public class Employeelogin2 {
	private int nr_pracownika;
	private String imie;
	private String nazwisko; 
	private String data_urodzenia;
	private String pesel;
	private int nr_oceanarium;
	private int nr_adresu;
	private int nr_stanowiska;
	
	
	
	
	public Employeelogin2() {
		
		
	}




	public Employeelogin2(int nr_pracownika, String imie, String nazwisko, String data_urodzenia, String pesel,
			int nr_oceanarium, int nr_adresu, int nr_stanowiska) {
		super();
		this.nr_pracownika = nr_pracownika;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_urodzenia = data_urodzenia;
		this.pesel = pesel;
		this.nr_oceanarium = nr_oceanarium;
		this.nr_adresu = nr_adresu;
		this.nr_stanowiska = nr_stanowiska;
	}




	public int getNr_pracownika() {
		return nr_pracownika;
	}




	public void setNr_pracownika(int nr_pracownika) {
		this.nr_pracownika = nr_pracownika;
	}




	public String getImie() {
		return imie;
	}




	public void setImie(String imie) {
		this.imie = imie;
	}




	public String getNazwisko() {
		return nazwisko;
	}




	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}




	public String getData_urodzenia() {
		return data_urodzenia;
	}




	public void setData_urodzenia(String data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}




	public String getPesel() {
		return pesel;
	}




	public void setPesel(String pesel) {
		this.pesel = pesel;
	}




	public int getNr_oceanarium() {
		return nr_oceanarium;
	}




	public void setNr_oceanarium(int nr_oceanarium) {
		this.nr_oceanarium = nr_oceanarium;
	}




	public int getNr_adresu() {
		return nr_adresu;
	}




	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}




	public int getNr_stanowiska() {
		return nr_stanowiska;
	}




	public void setNr_stanowiska(int nr_stanowiska) {
		this.nr_stanowiska = nr_stanowiska;
	}




	@Override
	public String toString() {
		return "Employeelogin2 [nr_pracownika=" + nr_pracownika + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ ", data_urodzenia=" + data_urodzenia + ", pesel=" + pesel + ", nr_oceanarium=" + nr_oceanarium
				+ ", nr_adresu=" + nr_adresu + ", nr_stanowiska=" + nr_stanowiska + "]";
	}

	


}