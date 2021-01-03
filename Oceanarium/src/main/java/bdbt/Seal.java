package bdbt;

public class Seal {
	
	private int nr_zwierzecia;
	private int ilosc_w_zbiorniku;
	private String czy_wystepy;
	public Seal(int nr_zwierzecia, String czy_wystepy, int ilosc_w_zbiorniku) {
		super();
		this.nr_zwierzecia = nr_zwierzecia;
		this.czy_wystepy = czy_wystepy;
		this.ilosc_w_zbiorniku = ilosc_w_zbiorniku;
	}
	public Seal() {
		
		// TODO Auto-generated constructor stub
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
	public String getCzy_wystepy() {
		return czy_wystepy;
	}
	public void setCzy_wystepy(String czy_wystepy) {
		this.czy_wystepy = czy_wystepy;
	}
	@Override
	public String toString() {
		return "Dolphin [nr_zwierzecia=" + nr_zwierzecia + ", ilosc_w_zbiorniku=" + ilosc_w_zbiorniku
				+ ", interakcja_z_klientam=" + ", czy_wystepy=" + czy_wystepy + "]";
	}
	
	
	

}
