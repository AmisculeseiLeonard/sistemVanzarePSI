package PSI.sistemVanzari;

import java.util.List;

import PSI.sistemVanzari.entities.Client;
import PSI.sistemVanzari.repository.MasterRepository;

public class TestClienti {
	
	static MasterRepository repo = new MasterRepository();
	
	public static void main(String[] args) {
		repo.beginTransaction();
		List<Client> clienti = repo.findClientAll();
		if(clienti.isEmpty()) {
			adaugaClienti();
			clienti = repo.findClientAll();
			
		}
		repo.commitTransaction();
		
		assert clienti.size() > 0;
		
		for(Client client: clienti) {
			System.out.println(client.getDenumire());
		}
		
		}
	
	public static void adaugaClienti() {
		
		for (int i = 0; i < 10; i++) {
			Client client = new Client("100" + i, "Client" + i, "Calea Natioanla Nr 2" + i, "6215926" + i, "J24/2" + i + "73/1994",200000.0,"074892361" + i);
			repo.addClient(client);
		}
		//repo.commitTransaction();
	}
}