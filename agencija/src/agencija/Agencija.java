package agencija;


import java.util.ArrayList;
import java.util.List;

public class Agencija {

	private double budzet;
	private List <zaposleni> listaZaposlenih = new ArrayList<zaposleni>();
	
	
	
	public double getBudzet() {
		return budzet;
	}
	public void setBudzet(double budzet) {
		this.budzet = budzet;
	}
	public List<zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}
	public void setListaZaposlenih(List<zaposleni> listaZaposlenih) {
		this.listaZaposlenih = listaZaposlenih;
	}
	
}
