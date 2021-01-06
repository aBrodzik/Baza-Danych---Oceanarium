package bdbt;

public class Animal {
	
	private int nr_zwierzecia;
	private String nazwa_gatunkowa;
	private int wiek;
	private String czy_drapiezne;
	private String imie;
	private int waga;
	private int nr_zbiornika;
	private int nr_oceanarium;
	
	
	
	public Animal() {
		
	}



	public Animal(int nr_zwierzecia, String nazwa_gatunkowa, int wiek, String czy_drapiezne, String imie, int waga,
			int nr_zbiornika, int nr_oceanarium) {
		super();
		this.nr_zwierzecia = nr_zwierzecia;
		this.nazwa_gatunkowa = nazwa_gatunkowa;
		this.wiek = wiek;
		this.czy_drapiezne = czy_drapiezne;
		this.imie = imie;
		this.waga = waga;
		this.nr_zbiornika = nr_zbiornika;
		this.nr_oceanarium = nr_oceanarium;
	}



	public int getNr_zwierzecia() {
		return nr_zwierzecia;
	}



	public void setNr_zwierzecia(int nr_zwierzecia) {
		this.nr_zwierzecia = nr_zwierzecia;
	}



	public String getNazwa_gatunkowa() {
		return nazwa_gatunkowa;
	}



	public void setNazwa_gatunkowa(String nazwa_gatunkowa) {
		this.nazwa_gatunkowa = nazwa_gatunkowa;
	}



	public int getWiek() {
		return wiek;
	}



	public void setWiek(int wiek) {
		this.wiek = wiek;
	}



	public String getCzy_drapiezne() {
		return czy_drapiezne;
	}



	public void setCzy_drapiezne(String czy_drapiezne) {
		this.czy_drapiezne = czy_drapiezne;
	}



	public String getImie() {
		return imie;
	}



	public void setImie(String imie) {
		this.imie = imie;
	}



	public int getWaga() {
		return waga;
	}



	public void setWaga(int waga) {
		this.waga = waga;
	}



	public int getNr_zbiornika() {
		return nr_zbiornika;
	}



	public void setNr_zbiornika(int nr_zbiornika) {
		this.nr_zbiornika = nr_zbiornika;
	}



	public int getNr_oceanarium() {
		return nr_oceanarium;
	}



	public void setNr_oceanarium(int nr_oceanarium) {
		this.nr_oceanarium = nr_oceanarium;
	}



	@Override
	public String toString() {
		return "Animal [nr_zwierzecia=" + nr_zwierzecia + ", nazwa_gatunkowa=" + nazwa_gatunkowa + ", wiek=" + wiek
				+ ", czy_drapiezne=" + czy_drapiezne + ", imie=" + imie + ", waga=" + waga + ", nr_zbiornika="
				+ nr_zbiornika + ", nr_oceanarium=" + nr_oceanarium + "]";
	}

	
	
	
}
