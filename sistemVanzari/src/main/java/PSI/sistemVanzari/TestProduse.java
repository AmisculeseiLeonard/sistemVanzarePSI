package PSI.sistemVanzari;


import java.util.List;

import org.springframework.util.Assert;

import PSI.sistemVanzari.entities.Produs;
import PSI.sistemVanzari.repository.MasterRepository;




public class TestProduse {

	public static void main(String[] args) {
		
//		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
	
		
		Produs p1 = new Produs("1df32", "Strawberry icecream", "buc", 55.0);
		Produs p2 = new Produs("1df33", "Cherry icecream", "buc", 35.0);
		MasterRepository repo = new MasterRepository();
		
		repo.beginTransaction();
		repo.addProdus(p1);
		repo.addProdus(p2);
		
		
		
		List<Produs> produse = repo.findProdusAll();
		Produs prod = repo.findProdusById("1df32");
		repo.commitTransaction();
		Assert.notEmpty(produse, "Lista trebuie să aibă cel puțin un element");
	
		
		System.out.println(prod.getDenumireProdus());
	}

}
