package PSI.sistemVanzari.repository;

import java.util.List;

import PSI.sistemVanzari.entities.Client;
import PSI.sistemVanzari.entities.Gestiune;
import PSI.sistemVanzari.entities.Produs;
import PSI.sistemVanzari.metamodel.AbstractRepository;

public class MasterRepository extends AbstractRepository{
	
	//produs
	public Produs addProdus(Produs produs) {
		return (Produs) this.create(produs);
	}
	
	public void deleteProdus(Produs produs) {
		this.delete(produs);
	}
	
	public Produs updateProdus(Produs produs) {
		return (Produs) this.update(produs);
	}
	
	@SuppressWarnings("unchecked")
	public List<Produs> findProdusAll() {
		this.beginTransaction();
		List<Produs> produse = this.getSession().createQuery("Select p from Produs p").getResultList();
		this.commitTransaction();
		return produse;
	}
	
	public Produs findProdusById(String codProdus) {
		return (Produs)this.getSession()
				.createQuery("Select p from Produs p where codProdus=:codProdus")
				.setParameter("codProdus", codProdus)
				.getSingleResult();
	}
	
	
	
	//client
	public Client addClient(Client client) {
		return (Client) this.create(client);
	}
	
	public void deleteClient(Client client) {
		this.delete(client);
	}
	
	public Client updateClient(Client client) {
		return (Client) this.update(client);
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> findClientAll() {
		this.beginTransaction();
		List<Client> clienti = this.getSession().createQuery("Select c from Client c").getResultList();
		this.commitTransaction();
		return clienti;
	}
	
	public Client findClientById(String idClient) {
		this.beginTransaction();
		Client client =  (Client) this.getSession()
				.createQuery("Select c from Client c where idClient=:idClient")
				.setParameter("idClient", idClient)
				.getSingleResult();
		this.commitTransaction();
		return client;
	}
	
	//gestiune
	public Gestiune addGestiune(Gestiune gestiune) {
		return (Gestiune) this.create(gestiune);
	}
	
	public void deleteGestiune(Gestiune gestiune) {
		this.delete(gestiune);
	}
	
	public Gestiune updateGestiune(Gestiune gestiune) {
		return (Gestiune) this.update(gestiune);
	}
	
	@SuppressWarnings("unchecked")
	public List<Gestiune> findGestiuneAll() {
		return AbstractRepository.getSession().createQuery("Select g from Gestiune g").getResultList();
	}
	
	public Gestiune findGestiuneById(String codGestiune) {
		return (Gestiune) AbstractRepository.getSession()
				.createQuery("Select c from Gestiune c where codGestiune=:codGestiune")
				.setParameter("codGestiune", codGestiune)
				.getSingleResult();
	}
	
	
	

}
