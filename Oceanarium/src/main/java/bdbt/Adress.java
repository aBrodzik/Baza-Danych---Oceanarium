package bdbt;

public class Adress {

	/* database field */
	private int nr_adresu;
	private String miasto;
	private String ulica;
	private String nr_lokalu;
	private int nr_poczty;

	/* constructor */
	public Adress(int nr_adresu, String miasto, String ulica, String nr_lokalu, int nr_poczty) {
		super();
		this.nr_adresu = nr_adresu;
		this.miasto = miasto;
		this.ulica = ulica;
		this.nr_lokalu = nr_lokalu;
		this.nr_poczty = nr_poczty;
	}

	/* constructor from superclass */
	public Adress() {

		// TODO Auto-generated constructor stub
	}

	/* toString */
	@Override
	public String toString() {
		return "Adresses [nr_adresu=" + nr_adresu + ", miasto=" + miasto + ", ulica=" + ulica + ", nr_lokalu="
				+ nr_lokalu + ", nr_poczty=" + nr_poczty + "]";
	}

	/* getters n setters */
	public int getNr_adresu() {
		return nr_adresu;
	}

	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNr_lokalu() {
		return nr_lokalu;
	}

	public void setNr_lokalu(String nr_lokalu) {
		this.nr_lokalu = nr_lokalu;
	}

	public int getNr_poczty() {
		return nr_poczty;
	}

	public void setNr_poczty(int nr_poczty) {
		this.nr_poczty = nr_poczty;
	}

}
