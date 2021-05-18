package PSI.sistemVanzari.metamodel;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("static-access")
public abstract class AbstractRepository {

	private static Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	public void beginTransaction() {
		this.getSession().getTransaction().begin();
	}

	public void commitTransaction() {
		this.getSession().getTransaction().commit();
	}

	public Object create(Object o) {
		this.getSession().persist(o);
		return o;
	}

	public Object update(Object o) {
		Object managedEntity = this.getSession().merge(o);
		return managedEntity;
	}

	public void delete(Object o) {
		this.getSession().remove(o);
	}

	public static Session getSession() {
		return session;
	}

	
	public void setSession(Session session) {
		this.session = session;
	}

	
}
