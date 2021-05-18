package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Oferta extends Document{
	
	private boolean raspunsOferta;
	

	public boolean isRaspunsOferta() {
		return raspunsOferta;
	}

	public void setRaspunsOferta(boolean raspunsOferta) {
		this.raspunsOferta = raspunsOferta;
	}

	
	
	
	

}
