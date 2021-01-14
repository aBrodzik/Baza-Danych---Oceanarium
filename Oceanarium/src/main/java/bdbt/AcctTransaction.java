package bdbt;

public class AcctTransaction {
	private String nazwa;
	private String imie;
	private String nazwisko;
	private double cena;
	private String data;
	private String data_zakupu;
	private char czy_faktura;
	public AcctTransaction(String nazwa, String imie, String nazwisko, double cena, String data, String data_zakupu,
			char czy_faktura) {
		super();
		this.nazwa = nazwa;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.cena = cena;
		this.data = data;
		this.data_zakupu = data_zakupu;
		this.czy_faktura = czy_faktura;
	}
	public AcctTransaction() {
		
		// TODO Auto-generated constructor stub
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData_zakupu() {
		return data_zakupu;
	}
	public void setData_zakupu(String data_zakupu) {
		this.data_zakupu = data_zakupu;
	}
	public char getCzy_faktura() {
		return czy_faktura;
	}
	public void setCzy_faktura(char czy_faktura) {
		this.czy_faktura = czy_faktura;
	}
	@Override
	public String toString() {
		return "AcctTransaction [nazwa=" + nazwa + ", imie=" + imie + ", nazwisko=" + nazwisko + ", cena=" + cena
				+ ", data=" + data + ", data_zakupu=" + data_zakupu + ", czy_faktura=" + czy_faktura + "]";
	}
	
	
	
	
	
}
