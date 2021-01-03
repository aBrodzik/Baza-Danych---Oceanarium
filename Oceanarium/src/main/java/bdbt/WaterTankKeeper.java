package bdbt;

public class WaterTankKeeper {
	private int nr_pracownika;
	private int nr_zbiornika;
	public WaterTankKeeper(int nr_pracownika, int nr_zbiornika) {
		super();
		this.nr_pracownika = nr_pracownika;
		this.nr_zbiornika = nr_zbiornika;
	}
	public WaterTankKeeper() {
		
		// TODO Auto-generated constructor stub
	}
	public int getNr_pracownika() {
		return nr_pracownika;
	}
	public void setNr_pracownika(int nr_pracownika) {
		this.nr_pracownika = nr_pracownika;
	}
	public int getNr_zbiornika() {
		return nr_zbiornika;
	}
	public void setNr_zbiornika(int nr_zbiornika) {
		this.nr_zbiornika = nr_zbiornika;
	}
	@Override
	public String toString() {
		return "WaterTankKeepers [nr_pracownika=" + nr_pracownika + ", nr_zbiornika=" + nr_zbiornika + "]";
	}
	
	
}
