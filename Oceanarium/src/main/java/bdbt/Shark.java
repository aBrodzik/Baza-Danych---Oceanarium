package bdbt;

public class Shark {
	
	private int nr_zwierzecia;
	private int ilosc_w_zbiorniku;
	private String rodzaj;
	private int wielkosc;
	
	
	
	public Shark() {
		
	}



	public Shark(int nr_zwierzecia, int ilosc_w_zbiorniku, String rodzaj, int wielkosc) {
		super();
		this.nr_zwierzecia = nr_zwierzecia;
		this.ilosc_w_zbiorniku = ilosc_w_zbiorniku;
		this.rodzaj = rodzaj;
		this.wielkosc = wielkosc;
	}



	public int getNr_zwierzecia() {
		return nr_zwierzecia;
	}



	public void setNr_zwierzecia(int nr_zwierzecia) {
		this.nr_zwierzecia = nr_zwierzecia;
	}



	public int getIlosc_w_zbiorniku() {
		return ilosc_w_zbiorniku;
	}



	public void setIlosc_w_zbiorniku(int ilosc_w_zbiorniku) {
		this.ilosc_w_zbiorniku = ilosc_w_zbiorniku;
	}



	public String getRodzaj() {
		return rodzaj;
	}



	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}



	public int getWielkosc() {
		return wielkosc;
	}



	public void setWielkosc(int wielkosc) {
		this.wielkosc = wielkosc;
	}



	@Override
	public String toString() {
		return "Shark [nr_zwierzecia=" + nr_zwierzecia + ", ilosc_w_zbiorniku=" + ilosc_w_zbiorniku + ", rodzaj="
				+ rodzaj + ", wielkosc=" + wielkosc + "]";
	}

	
	
	
	
	
}
