package bdbt;

public class Attraction {
	private int nr_atrakcji;
	private String nazwa;
	private String opis;
	private int nr_oceanarium;

	public Attraction(int nr_atrakcji, String nazwa, String opis, int nr_oceanarium) {
		super();
		this.nr_atrakcji = nr_atrakcji;
		this.nazwa = nazwa;
		this.opis = opis;
		this.nr_oceanarium = nr_oceanarium;
	}

	public Attraction() {

	}

	public int getNr_atrakcji() {
		return nr_atrakcji;
	}

	public void setNr_atrakcji(int nr_atrakcji) {
		this.nr_atrakcji = nr_atrakcji;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getNr_oceanarium() {
		return nr_oceanarium;
	}

	public void setNr_oceanarium(int nr_oceanarium) {
		this.nr_oceanarium = nr_oceanarium;
	}

	@Override
	public String toString() {
		return "Attraction [nr_atrakcji=" + nr_atrakcji + ", nazwa=" + nazwa + ", opis=" + opis + ", nr_oceanarium="
				+ nr_oceanarium + "]";
	}

}
