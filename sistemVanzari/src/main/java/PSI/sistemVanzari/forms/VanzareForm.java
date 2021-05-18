package PSI.sistemVanzari.forms;

import PSI.sistemVanzari.entities.DocInsotitor;
import PSI.sistemVanzari.entities.LinieDocument;

public class VanzareForm {
	
	public static final String STORNARE = "Stornare";
	public static final String AVIZ = "Aviz";
	public static final String FACTURA = "Factura";
	
	private VanzareFormData formData = new VanzareFormData();

	public VanzareFormData getFormData() {
		return formData;
	}

	public void setFormData(VanzareFormData formData) {
		this.formData = formData;
	}
	
	public void documentNou() {

		DocInsotitor doc = new DocInsotitor();
		this.formData.setDocumentCurent(doc);
		
		if (this.formData.getOperatieSelectata().equals(
				VanzareFormData.VANZARE_CU_FACTURA))
			doc.setTipDocument(FACTURA);
		else if (this.formData.getOperatieSelectata().equals(
				VanzareFormData.VANZARE_CU_AVIZ))
			doc.setTipDocument(AVIZ);
		else if (this.formData.getOperatieSelectata().equals(
				VanzareFormData.STORNARE))
			doc.setTipDocument(STORNARE);
		

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
