package agencija;

import interfejsovi.Ibonus;

public class zaposleni extends Osobe implements Ibonus {

	private double plata;
	private int target;
	private boolean bonus;
	
	public zaposleni() {
		
	}
	
	
	public zaposleni(double plata, int target, boolean bonus) {
		super();
		this.plata = plata;
		this.target = target;
		this.bonus = bonus;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	public void ispisiOsobe(int id, String ime, String prezime) {
		
	System.out.println("id zaposlenog:"+ id);
	System.out.println("ime zaposlenog:"+ ime);
	System.out.println("prezime zaposlenog:"+ prezime);
	
	
	}

   @Override
	public void daLiZaposleniImaBonus() {
	
		if(this.target > 10) {
			this.bonus=true;
		}else {
			this.bonus=false;
		}
		
	}
	
}
	


