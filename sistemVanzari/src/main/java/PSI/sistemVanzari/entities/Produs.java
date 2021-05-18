package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import PSI.sistemVanzari.metamodel.AbstractEntity;

@Entity
public class Produs extends AbstractEntity{

	@Id
	private String codProdus;
	private String denumireProdus;
	private String UM;
	private Double stoc;
	
	
	public Produs() {
		super();
	}


	public Produs(String codProdus, String denumireProdus, String uM, Double stoc) {
		super();
		this.codProdus = codProdus;
		this.denumireProdus = denumireProdus;
		UM = uM;
		this.stoc = stoc;
	}


	public String getCodProdus() {
		return codProdus;
	}


	public void setCodProdus(String codProdus) {
		this.codProdus = codProdus;
	}


	public String getDenumireProdus() {
		return denumireProdus;
	}


	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}


	public String getUM() {
		return UM;
	}


	public void setUM(String uM) {
		UM = uM;
	}


	public Double getStoc() {
		return stoc;
	}


	public void setStoc(Double stoc) {
		this.stoc = stoc;
	}
	
	
	
	
}
