package PSI.sistemVanzari.forms;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import PSI.sistemVanzari.entities.Client;
import PSI.sistemVanzari.entities.DocInsotitor;
import PSI.sistemVanzari.entities.Document;
import PSI.sistemVanzari.entities.LinieDocument;
import PSI.sistemVanzari.entities.Produs;
import PSI.sistemVanzari.repository.DocumentRepository;
import PSI.sistemVanzari.repository.MasterRepository;

public class DocFormData {
	
	public static final String COMANDA = "Comanda";
	public static final String OFERTA = "Oferta";
	public static final String CERERE_OFERTA = "Cerere oferta";
	
	private Document documentCurent;
	
	

	private MasterRepository masterRepo = new MasterRepository();
	private DocumentRepository docRepo = new DocumentRepository();
	
	private List<DocInsotitor> listaDocumente;
	private List<Client> listaClientilor;
	
	public List<Client> getListaClientilor() {
		if (this.listaClientilor == null) 
		{
			
			this.listaClientilor = this.masterRepo.findClientAll();
		}
		return listaClientilor;
	}
	
	public Client getClientSelectat() {
		return this.documentCurent.getClient();
	}
	
	public void setClientSelectat(Client clientSelectat) {
		Client clientComplet = this.masterRepo
				.findClientById(clientSelectat.getIdClient());
		this.documentCurent.setClient(clientComplet);
	}
	
	private List<String> operatiuni;

	public List<String> getOperatiuni() {
		if (operatiuni == null)
		{
			operatiuni = new LinkedList<String>();

			operatiuni.add(COMANDA);
			operatiuni.add(OFERTA);
			operatiuni.add(CERERE_OFERTA);
		}
		return operatiuni;
	}
	
	private String operatieSelectata;

	public String getOperatieSelectata() {
		return this.operatieSelectata;
	}

	public void setOperatieSelectata(String operatieSelectata) {
		this.operatieSelectata = operatieSelectata;
	}
	
	public Set<LinieDocument> getArticole() {
		return this.documentCurent.getLiniiDocument();
	}
	
	private List<Produs> listaProduse;

	public List<Produs> getListaProduse() {
		if (listaProduse == null)
			listaProduse = masterRepo.findProdusAll();

		return listaProduse;
	}
	
	public void adaugaLinieDoc(LinieDocument linieDocument) {
		this.documentCurent.addLinieDocument(linieDocument);
	}
	
	public void setDocRepo(DocumentRepository docRepo) {
		this.docRepo = docRepo;
	}

	public List<DocInsotitor> getListaDocumente() {
		return listaDocumente;
	}

	public void setListaDocumente(List<DocInsotitor> listaDocumente) {
		this.listaDocumente = listaDocumente;
	}

	public Document getDocumentCurent() {
		return documentCurent;
	}

	public void setDocumentCurent(Document documentCurent) {
		this.documentCurent = documentCurent;
	}
	public MasterRepository getMasterRepo() {
		return masterRepo;
	}

	public void setMasterRepo(MasterRepository masterRepo) {
		this.masterRepo = masterRepo;
	}

	public DocumentRepository getDocRepo() {
		return docRepo;
	}
	
}
