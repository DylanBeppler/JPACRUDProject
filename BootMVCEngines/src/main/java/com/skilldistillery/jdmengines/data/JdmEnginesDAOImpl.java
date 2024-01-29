package com.skilldistillery.jdmengines.data;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;

import com.skilldistillery.jdmengines.entities.JdmEngines;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class JdmEnginesDAOImpl implements JdmEnginesDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public JdmEngines findById(int id) {
		JdmEngines jdm = em.find(JdmEngines.class, id);

		return jdm;
	}

	public boolean deleteJdmEngine(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Engines");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		JdmEngines jdmengine = em.find(JdmEngines.class, id);
		em.remove(jdmengine);

		em.flush();

		em.getTransaction().commit();

		return em.find(JdmEngines.class, id) == null;
	}

	public void addNewJdmEngine(int id, String name, int size, int cylinders, int power, String unit) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Engines");
		EntityManager em = emf.createEntityManager();

		try {
			JdmEngines jdmengine = new JdmEngines();
			em.getTransaction().begin();
			
			jdmengine.setId(id);
			jdmengine.setName(name);
			jdmengine.setSize(size);
			jdmengine.setCylinders(cylinders);
			jdmengine.setPower(power);
			jdmengine.setUnit(unit);

			em.persist(jdmengine);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

	public JdmEngines update(int id, JdmEngines updatedJdmEngine) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Engines");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();

			JdmEngines managed = em.find(JdmEngines.class, id);
			if (managed != null) {

				managed.setName(updatedJdmEngine.getName());
				managed.setSize(updatedJdmEngine.getSize());
				managed.setCylinders(updatedJdmEngine.getCylinders());
				managed.setPower(updatedJdmEngine.getPower());
				managed.setUnit(updatedJdmEngine.getUnit());

				em.getTransaction().commit();
			}

			return managed;
		} finally {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			em.close();
		}
	}

}
