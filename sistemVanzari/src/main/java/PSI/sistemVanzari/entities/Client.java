package PSI.sistemVanzari.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import PSI.sistemVanzari.metamodel.AbstractEntity;

@Entity
public class Client extends AbstractEntity{

	@Id
	private String idClient;
	private String denumire;
	private String adresa;

	private String CIF;
	private String nrRegCom;
	private Double sold;
	private String telefon;
	
	public Client() {
		super();
	}

	public Client(String idClient, String denumire, String adresa, String CIF, String nrRegCom, Double sold,
			String telefon) {
		super();
		this.idClient = idClient;
		this.denumire = denumire;
		this.adresa = adresa;
		this.CIF = CIF;
		this.nrRegCom = nrRegCom;
		this.sold = sold;
		this.telefon = telefon;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNrRegCom() {
		return nrRegCom;
	}

	public void setNrRegCom(String nrRegCom) {
		this.nrRegCom = nrRegCom;
	}

	public Double getSold() {
		return sold;
	}

	public void setSold(Double sold) {
		this.sold = sold;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
	
	
	
	

}
