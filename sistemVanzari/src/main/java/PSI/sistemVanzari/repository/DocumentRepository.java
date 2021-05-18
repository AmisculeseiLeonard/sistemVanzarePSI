package PSI.sistemVanzari.repository;

import PSI.sistemVanzari.entities.Document;
import PSI.sistemVanzari.metamodel.AbstractRepository;

public class DocumentRepository extends AbstractRepository{

public Document saveDocument(Document document) {
	if (document.getId()==null)
		document=(Document)this.create(document);
	else 
		document=(Document)this.update(document);
	
	return document;


	}
}
