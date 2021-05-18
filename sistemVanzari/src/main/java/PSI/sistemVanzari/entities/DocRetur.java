package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DocRetur extends Document{
	
	private String motivRetur;
	private String observatii;
	
	
	@OneToOne(mappedBy = "docRetur")
	private Receptie receptie;

	public String getMotivRetur() {
		return motivRetur;
	}

	public void setMotivRetur(String motivRetur) {
		this.motivRetur = motivRetur;
	}

	public String getObservatii() {
		return observatii;
	}

	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}

	

	public Receptie getReceptie() {
		return receptie;
	}

	public void setReceptie(Receptie receptie) {
		this.receptie = receptie;
	}
	
	
	
	
}
