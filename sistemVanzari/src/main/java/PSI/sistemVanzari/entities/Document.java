package PSI.sistemVanzari.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import PSI.sistemVanzari.metamodel.AbstractEntity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Document extends AbstractEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDocument;

	private String tipDocument;

	@Temporal(TemporalType.DATE)
	private Date dateDocument;
	
	@OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<LinieDocument> liniiDocument = new HashSet<LinieDocument>();
	
	@ManyToOne
	private Client client;
	
	
	
	public void addLinieDocument(LinieDocument linie) {
		this.liniiDocument.add(linie);
		linie.setDocument(this);
	}

	public void addLinieDocument(Produs produs, Double cantitate,Double pret) {
		LinieDocument linie = new LinieDocument(cantitate, pret, produs);
		this.liniiDocument.add(linie);
		linie.setDocument(this);
	}

	public void removeLinieDocument(LinieDocument linie) {
		this.liniiDocument.remove(linie);
		linie.setDocument(null);
	}

	public Integer getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Integer idDocument) {
		this.idDocument = idDocument;
	}

	public String getTipDocument() {
		return tipDocument;
	}

	public void setTipDocument(String tipDocument) {
		this.tipDocument = tipDocument;
	}

	public Date getDateDocument() {
		return dateDocument;
	}

	public void setDateDocument(Date dateDocument) {
		this.dateDocument = dateDocument;
	}

	public Set<LinieDocument> getLiniiDocument() {
		return liniiDocument;
	}

	public void setLiniiDocument(Set<LinieDocument> liniiDocument) {
		this.liniiDocument = liniiDocument;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	

	
	

}
