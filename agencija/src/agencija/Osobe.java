package agencija;

public abstract class Osobe {
	
	private int id;
	private String ime;
	private String prezime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public abstract void ispisiOsobe(int id, String ime, String prezime); 

	
	
}
