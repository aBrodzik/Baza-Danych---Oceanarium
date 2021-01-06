package bdbt;

public class WaterTank {
	
	
	private int nr_zbiornika;
	private int pojemnosc;
	private int temperatura;
	private String typ_zbiornika;
	private int ilosc_miejsc;
	private int nr_atrakcji;
	private int nr_oceanarium;
	
	
	
	
	
	
	
	public WaterTank() {
		
		
	}







	public WaterTank(int nr_zbiornika, int pojemnosc, int temperatura, String typ_zbiornika, int ilosc_miejsc,
			int nr_atrakcji, int nr_oceanarium) {
		super();
		this.nr_zbiornika = nr_zbiornika;
		this.pojemnosc = pojemnosc;
		this.temperatura = temperatura;
		this.typ_zbiornika = typ_zbiornika;
		this.ilosc_miejsc = ilosc_miejsc;
		this.nr_atrakcji = nr_atrakcji;
		this.nr_oceanarium = nr_oceanarium;
	}







	public int getNr_zbiornika() {
		return nr_zbiornika;
	}







	public void setNr_zbiornika(int nr_zbiornika) {
		this.nr_zbiornika = nr_zbiornika;
	}







	public int getPojemnosc() {
		return pojemnosc;
	}







	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}







	public int getTemperatura() {
		return temperatura;
	}







	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}







	public String getTyp_zbiornika() {
		return typ_zbiornika;
	}







	public void setTyp_zbiornika(String typ_zbiornika) {
		this.typ_zbiornika = typ_zbiornika;
	}







	public int getIlosc_miejsc() {
		return ilosc_miejsc;
	}







	public void setIlosc_miejsc(int ilosc_miejsc) {
		this.ilosc_miejsc = ilosc_miejsc;
	}







	public int getNr_atrakcji() {
		return nr_atrakcji;
	}







	public void setNr_atrakcji(int nr_atrakcji) {
		this.nr_atrakcji = nr_atrakcji;
	}







	public int getNr_oceanarium() {
		return nr_oceanarium;
	}







	public void setNr_oceanarium(int nr_oceanarium) {
		this.nr_oceanarium = nr_oceanarium;
	}







	@Override
	public String toString() {
		return "WaterTank [nr_zbiornika=" + nr_zbiornika + ", pojemnosc=" + pojemnosc + ", temperatura=" + temperatura
				+ ", typ_zbiornika=" + typ_zbiornika + ", ilosc_miejsc=" + ilosc_miejsc + ", nr_atrakcji=" + nr_atrakcji
				+ ", nr_oceanarium=" + nr_oceanarium + "]";
	}
	

	
	
	
	
}
