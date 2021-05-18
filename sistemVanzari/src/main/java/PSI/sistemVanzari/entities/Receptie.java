package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Receptie extends Document{
	
	@OneToOne()
	private DocRetur docRetur;
	
	@ManyToOne
	private Gestiune gestiune;

	public DocRetur getDocRetur() {
		return docRetur;
	}

	public void setDocRetur(DocRetur docRetur) {
		this.docRetur = docRetur;
	}

	public Gestiune getGestiune() {
		return gestiune;
	}

	public void setGestiune(Gestiune gestiune) {
		this.gestiune = gestiune;
	}
	
	

}
