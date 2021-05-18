package PSI.sistemVanzari;

import org.springframework.util.Assert;

import PSI.sistemVanzari.entities.Comanda;
import PSI.sistemVanzari.entities.LinieDocument;
import PSI.sistemVanzari.forms.DocForm;
import PSI.sistemVanzari.forms.DocFormData;
import PSI.sistemVanzari.forms.VanzareForm;

public class TestDocForm {

	public static void main(String[] args) {
		DocForm form = new DocForm();
		verificariInitiale(form);
		
		
		
		form.getFormData().setOperatieSelectata(DocFormData.COMANDA);
		form.documentNou();
		System.out.println(form.getFormData().getDocumentCurent().getClass());
		Assert.isTrue(form.getFormData().getDocumentCurent()
				.getTipDocument().equals(DocFormData.COMANDA),
				"Tipul de document nou creat nu este corect.");
		
		form.getFormData().setClientSelectat(form.getFormData().getListaClientilor().get(0));
		
		Assert.isTrue(form.getFormData().getDocumentCurent().getClient()
				.equals(form.getFormData().getClientSelectat())
				,"Furnizor atasat documentului incorect");
		
		LinieDocument linieDocument = new LinieDocument(40.0, 10.5, form.getFormData().getListaProduse().get(0));
		form.getFormData().adaugaLinieDoc(linieDocument);
		
		Assert.isTrue(form.getFormData().getArticole().size() >= 1,"Documentul nu contine linii de document");
		form.salveazaModificariDocument();

	}
	
	private static void verificariInitiale(DocForm form) {
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
