package bdbt;

public class Implementation {
	
	private int nr_realizacji;
	private int cena;
	private String data;
	private int nr_atrakcji;
	
	public Implementation() {
		
	}
	
	public Implementation(int nr_realizacji, int cena, String data, int nr_atrakcji) {
		super();
		this.nr_realizacji = nr_realizacji;
		this.cena = cena;
		this.data = data;
		this.nr_atrakcji = nr_atrakcji;
	}

	public int getNr_realizacji() {
		return nr_realizacji;
	}

	public void setNr_realizacji(int nr_realizacji) {
		this.nr_realizacji = nr_realizacji;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNr_atrakcji() {
		return nr_atrakcji;
	}

	public void setNr_atrakcji(int nr_atrakcji) {
		this.nr_atrakcji = nr_atrakcji;
	}
	
	
	@Override
	public String toString() {
		return "Implementation [nr_realizacji=" + nr_realizacji + ", cena=" + cena + ", data=" + data
				+ ", nr_atrakcji=" + nr_atrakcji + "]";
	}
	

}
