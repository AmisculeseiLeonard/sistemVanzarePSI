package PSI.sistemVanzari.forms;

import PSI.sistemVanzari.entities.CerereOferta;
import PSI.sistemVanzari.entities.Comanda;
import PSI.sistemVanzari.entities.Document;
import PSI.sistemVanzari.entities.LinieDocument;
import PSI.sistemVanzari.entities.Oferta;

public class DocForm {

	private DocFormData formData = new DocFormData();

	public DocFormData getFormData() {
		return formData;
	}

	public void setFormData(DocFormData formData) {
		this.formData = formData;
	}
	
	public void documentNou() {
		Document doc;
		if(this.formData.getOperatieSelectata() == DocFormData.COMANDA) {
			doc = new Comanda();
			this.formData.setDocumentCurent(doc);
			doc.setTipDocument(DocFormData.COMANDA);
		}
		else if(this.formData.getOperatieSelectata() == DocFormData.OFERTA) {
			doc = new Oferta();
			this.formData.setDocumentCurent(doc);
			doc.setTipDocument(DocFormData.OFERTA);
		}
		else if(this.formData.getOperatieSelectata() == DocFormData.CERERE_OFERTA) {
			doc = new CerereOferta();
			this.formData.setDocumentCurent(doc);
			doc.setTipDocument(DocFormData.CERERE_OFERTA);
		}else {
			doc = new Document();
			this.formData.setDocumentCurent(doc);
		}
		
		doc.setDateDocument(new java.util.Date());
		
		doc.setClient(this.formData.getClientSelectat());
	}
	
public void adaugaLinieReceptie() {
		
		LinieDocument linie = new LinieDocument();
		linie.setProdus(this.formData.getListaProduse().get(0));
		
		this.formData.getDocumentCurent().addLinieDocument(linie);
		
	}
	
	public void salveazaModificariDocument() {
		this.getFormData().getDocRepo().beginTransaction();
		this.getFormData().getDocRepo().saveDocument(this.getFormData().getDocumentCurent());
		this.getFormData().getDocRepo().commitTransaction();
	}
}
