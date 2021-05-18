package PSI.sistemVanzari.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contract extends Document{
	
	@Temporal(TemporalType.DATE)
	private Date dataIntrareVigoare;
	
	@Temporal(TemporalType.DATE)
	private Date dataIncetare;
	
	

	public Date getDataIntrareVigoare() {
		return dataIntrareVigoare;
	}

	public void setDataIntrareVigoare(Date dataIntrareVigoare) {
		this.dataIntrareVigoare = dataIntrareVigoare;
	}

	public Date getDataIncetare() {
		return dataIncetare;
	}

	public void setDataIncetare(Date dataIncetare) {
		this.dataIncetare = dataIncetare;
	}

	
	
}
