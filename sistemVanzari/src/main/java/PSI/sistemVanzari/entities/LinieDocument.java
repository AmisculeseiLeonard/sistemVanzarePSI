package PSI.sistemVanzari.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import PSI.sistemVanzari.metamodel.AbstractEntity;

@Entity
public class LinieDocument extends AbstractEntity{
	
	private Double cantitate;
	private Double pret;
	
	@ManyToOne
	private Document document;
	@ManyToOne
	@Column(nullable = false)
	private Produs produs;
	
	
	public LinieDocument() {
		super();
	}


	public LinieDocument(Double cantitate, Double pret, Produs produs) {
		super();
		this.cantitate = cantitate;
		this.pret = pret;
		this.produs = produs;
	}


	public Double getCantitate() {
		return cantitate;
	}


	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}


	public Double getPret() {
		return pret;
	}


	public void setPret(Double pret) {
		this.pret = pret;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}


	public Produs getProdus() {
		return produs;
	}


	public void setProdus(Produs produs) {
		this.produs = produs;
	}
	
	
	
	
	
}
