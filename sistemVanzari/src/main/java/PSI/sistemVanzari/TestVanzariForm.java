package PSI.sistemVanzari;

import org.springframework.util.Assert;

import PSI.sistemVanzari.entities.LinieDocument;
import PSI.sistemVanzari.forms.VanzareForm;

public class TestVanzariForm {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		VanzareForm form = new VanzareForm();
		//form.getFormData().getMasterRepo().beginTransaction();
		verificariInitiale(form);
		
		
		form.getFormData().setOperatieSelectata(form.getFormData().VANZARE_CU_AVIZ);
		form.documentNou();
		
		Assert.isTrue(form.getFormData().getDocumentCurent()
				.getTipDocument().equals(form.AVIZ),
				"Tipul de document nou creat nu este corect.");
		
		form.getFormData().setClientSelectat(form.getFormData().getListaClientilor().get(1));
		
		Assert.isTrue(form.getFormData().getDocumentCurent().getClient()
				.equals(form.getFormData().getClientSelectat())
				,"Furnizor atasat documentului incorect");
		
		LinieDocument linieDocument = new LinieDocument(22.0, 12.5, form.getFormData().getListaProduse().get(1));
		form.getFormData().adaugaLinieDoc(linieDocument);
		
		Assert.isTrue(form.getFormData().getArticole().size() >= 1,"Documentul nu contine linii de document");
		form.salveazaModificariDocument();
		
		
		
	}
	
	private static void verificariInitiale(VanzareForm form) {
		Assert
				.isTrue(
						form.getFormData().getListaClientilor().size() > 0,
						"BUG sau Nu exista Clienti pentru test. Rulati mai intai testul TestClienti");

		Assert
				.isTrue(
						form.getFormData().getListaProduse().size() > 0,
						"BUG sau Nu exista Gestiuni pentru test. Rulati mai intai testul TestProduse");
	}

}
