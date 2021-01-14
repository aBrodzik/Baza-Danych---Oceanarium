package bdbt;

public class AcctSalary {
	private int nr_pracownika;
	private String imie;
	private String nazwisko;
	private String data_wynagrodzenia;
	private double kwota_pod;
	private double kwota_dod;
	private String nazwa_stanowiska;
	public AcctSalary(int nr_pracownika, String imie, String nazwisko, String data_wynagrodzenia, double kwota_pod,
			double kwota_dod, String nazwa_stanowiska) {
		super();
		this.nr_pracownika = nr_pracownika;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_wynagrodzenia = data_wynagrodzenia;
		this.kwota_pod = kwota_pod;
		this.kwota_dod = kwota_dod;
		this.nazwa_stanowiska = nazwa_stanowiska;
	}
	public AcctSalary() {
		
		// TODO Auto-generated constructor stub
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
	public String getData_wynagrodzenia() {
		return data_wynagrodzenia;
	}
	public void setData_wynagrodzenia(String data_wynagrodzenia) {
		this.data_wynagrodzenia = data_wynagrodzenia;
	}
	public double getKwota_pod() {
		return kwota_pod;
	}
	public void setKwota_pod(double kwota_pod) {
		this.kwota_pod = kwota_pod;
	}
	public double getKwota_dod() {
		return kwota_dod;
	}
	public void setKwota_dod(double kwota_dod) {
		this.kwota_dod = kwota_dod;
	}
	public String getNazwa_stanowiska() {
		return nazwa_stanowiska;
	}
	public void setNazwa_stanowiska(String nazwa_stanowiska) {
		this.nazwa_stanowiska = nazwa_stanowiska;
	}
	@Override
	public String toString() {
		return "AcctSalary [nr_pracownika=" + nr_pracownika + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ ", data_wynagrodzenia=" + data_wynagrodzenia + ", kwota_pod=" + kwota_pod + ", kwota_dod=" + kwota_dod
				+ ", nazwa_stanowiska=" + nazwa_stanowiska + "]";
	}
	
	
	
}
