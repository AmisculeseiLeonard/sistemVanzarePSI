package PSI.sistemVanzari;

import java.util.List;

import PSI.sistemVanzari.entities.Gestiune;
import PSI.sistemVanzari.repository.MasterRepository;

public class TestGestiune {
	
	static MasterRepository repo = new MasterRepository();
	
	public static void main(String[] args) {
		repo.beginTransaction();
		List<Gestiune> gestiuni = repo.findGestiuneAll();
		if (gestiuni.isEmpty())
		{
			adaugaGestiuni();
			gestiuni = repo.findGestiuneAll();
		}
		repo.commitTransaction();
		
		assert gestiuni.size() > 0;
		
	}
	
	public static void adaugaGestiuni() {
		Gestiune g = null;
		for (int i=0; i<3; i++) {
			
			g=new Gestiune();
			g.setCodGestiune(1000+i);
			g.setDenumireGestiune("Gestiune "+g.getCodGestiune());
			repo.addGestiune(g);
		}
	}
	
	
}
