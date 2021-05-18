package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Comanda extends Document{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4221770774098346029L;
	private String notaSuplimentara;
	

	public String getNotaSuplimentara() {
		return notaSuplimentara;
	}

	public void setNotaSuplimentara(String notaSuplimentara) {
		this.notaSuplimentara = notaSuplimentara;
	}

	
	
	
	
	
}
