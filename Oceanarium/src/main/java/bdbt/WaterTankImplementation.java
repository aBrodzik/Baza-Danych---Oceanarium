package bdbt;

public class WaterTankImplementation {
	
	private int nr_zbiornika;
	private int nr_realizacji;
	
	
	
	public WaterTankImplementation() {
		
	}



	public WaterTankImplementation(int nr_zbiornika, int nr_realizacji) {
		super();
		this.nr_zbiornika = nr_zbiornika;
		this.nr_realizacji = nr_realizacji;
	}



	public int getNr_zbiornika() {
		return nr_zbiornika;
	}



	public void setNr_zbiornika(int nr_zbiornika) {
		this.nr_zbiornika = nr_zbiornika;
	}



	public int getNr_realizacji() {
		return nr_realizacji;
	}



	public void setNr_realizacji(int nr_realizacji) {
		this.nr_realizacji = nr_realizacji;
	}



	@Override
	public String toString() {
		return "WaterTankImplementation [nr_zbiornika=" + nr_zbiornika + ", nr_realizacji=" + nr_realizacji + "]";
	}

	
	
}
