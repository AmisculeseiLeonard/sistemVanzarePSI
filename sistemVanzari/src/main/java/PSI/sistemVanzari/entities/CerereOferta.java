package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class CerereOferta extends Document{
	
	private String notaSuplimentara;
	

	public String getNotaSuplimentara() {
		return notaSuplimentara;
	}

	public void setNotaSuplimentara(String notaSuplimentara) {
		this.notaSuplimentara = notaSuplimentara;
	}

	
	

}
