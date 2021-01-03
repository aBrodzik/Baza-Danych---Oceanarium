package bdbt;

public class Client {
	private int nr_klienta;
	private String imie;
	private String nazwisko;
	private String nr_telefonu;
	private String plec;
	private String data_urodzenia;
	private int nr_oceanarium;
	private int nr_adresu;

	public Client(int nr_klienta, String imie, String nazwisko, String nr_telefonu, String plec, String data_urodzenia,
			int nr_oceanarium, int nr_adresu) {
		super();
		this.nr_klienta = nr_klienta;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_telefonu = nr_telefonu;
		this.plec = plec;
		this.data_urodzenia = data_urodzenia;
		this.nr_oceanarium = nr_oceanarium;
		this.nr_adresu = nr_adresu;
	}

	public Client() {

		// TODO Auto-generated constructor stub
	}

	public int getNr_klienta() {
		return nr_klienta;
	}

	public void setNr_klienta(int nr_klienta) {
		this.nr_klienta = nr_klienta;
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

	public String getNr_telefonu() {
		return nr_telefonu;
	}

	public void setNr_telefonu(String nr_telefonu) {
		this.nr_telefonu = nr_telefonu;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public String getData_urodzenia() {
		return data_urodzenia;
	}

	public void setData_urodzenia(String data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
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

	@Override
	public String toString() {
		return "Klienci [nr_klienta=" + nr_klienta + ", imie=" + imie + ", nazwisko=" + nazwisko + ", nr_telefonu="
				+ nr_telefonu + ", plec=" + plec + ", data_urodzenia=" + data_urodzenia + ", nr_oceanarium="
				+ nr_oceanarium + ", nr_adresu=" + nr_adresu + "]";
	}

}
