package PSI.sistemVanzari.entities;


import javax.persistence.Entity;


@Entity
public class DocInsotitor extends Document{

	private String mijlTransport;
	

	public String getMijlTransport() {
		return mijlTransport;
	}

	public void setMijlTransport(String mijlTransport) {
		this.mijlTransport = mijlTransport;
	}

	
	
	

}
