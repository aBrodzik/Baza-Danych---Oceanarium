package bdbt;

public class Dolphin {
	
	private int nr_zwierzecia;
	private int ilosc_w_zbiorniku;
	private String interakcja_z_klientam;
	private String czy_wystepy;
	public Dolphin(int nr_zwierzecia, int ilosc_w_zbiorniku, String interakcja_z_klientam, String czy_wystepy) {
		super();
		this.nr_zwierzecia = nr_zwierzecia;
		this.ilosc_w_zbiorniku = ilosc_w_zbiorniku;
		this.interakcja_z_klientam = interakcja_z_klientam;
		this.czy_wystepy = czy_wystepy;
	}
	public Dolphin() {
		
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
	public String getInterakcja_z_klientam() {
		return interakcja_z_klientam;
	}
	public void setInterakcja_z_klientam(String interakcja_z_klientam) {
		this.interakcja_z_klientam = interakcja_z_klientam;
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
				+ ", interakcja_z_klientam=" + interakcja_z_klientam + ", czy_wystepy=" + czy_wystepy + "]";
	}
	
	
	

}
