package bdbt;

public class Oceanarium {
	private int nr_oceanarium;
	private String nazwa;
	private int nr_adresu;
	public Oceanarium(int nr_oceanarium, String nazwa, int nr_adresu) {
		super();
		this.nr_oceanarium = nr_oceanarium;
		this.nazwa = nazwa;
		this.nr_adresu = nr_adresu;
	}
	public Oceanarium() {
		
		// TODO Auto-generated constructor stub
	}
	public int getNr_oceanarium() {
		return nr_oceanarium;
	}
	public void setNr_oceanarium(int nr_oceanarium) {
		this.nr_oceanarium = nr_oceanarium;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getNr_adresu() {
		return nr_adresu;
	}
	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}
	@Override
	public String toString() {
		return "Oceanarium [nr_oceanarium=" + nr_oceanarium + ", nazwa=" + nazwa + ", nr_adresu=" + nr_adresu + "]";
	}
	
	
}
