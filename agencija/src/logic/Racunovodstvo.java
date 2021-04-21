package logic;

import java.util.List;
import agencija.zaposleni;

public class Racunovodstvo {
	
	public static double racunajTroskoveZarade(List<zaposleni> listaZaposlenih) {
	
	double zbirPlata = 0;
	
	for(zaposleni z: listaZaposlenih) {
		zbirPlata += z.getPlata();
	}
	return zbirPlata;

	}

	
	

	
	public static double racunajBonuse(List<zaposleni> listaZaposlenih) {
		
		double zbirBonusa = 0;
				for (zaposleni z: listaZaposlenih) {
					if(z.isBonus()) {
						zbirBonusa += (z.getPlata()* 30/100);
					}
				}
		
		return zbirBonusa;
	}
	
	
}


