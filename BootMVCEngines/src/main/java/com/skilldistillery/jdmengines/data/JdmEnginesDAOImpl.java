package com.skilldistillery.jdmengines.data;

import java.util.List;

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

		JdmEngines jdmengine = em.find(JdmEngines.class, id);
		em.remove(jdmengine);

		return em.find(JdmEngines.class, id) == null;
	}

	public JdmEngines addNewJdmEngine(int id, String name, int size, int cylinders, int power, String unit) {

		JdmEngines jdmengine = new JdmEngines();

		jdmengine.setId(id);
		jdmengine.setName(name);
		jdmengine.setSize(size);
		jdmengine.setCylinders(cylinders);
		jdmengine.setPower(power);
		jdmengine.setUnit(unit);

		em.persist(jdmengine);
		return jdmengine;
	}

	public JdmEngines update(int id, JdmEngines updatedJdmEngine) {

		JdmEngines managed = em.find(JdmEngines.class, id);
		if (managed != null) {

			managed.setName(updatedJdmEngine.getName());
			managed.setSize(updatedJdmEngine.getSize());
			managed.setCylinders(updatedJdmEngine.getCylinders());
			managed.setPower(updatedJdmEngine.getPower());
			managed.setUnit(updatedJdmEngine.getUnit());

		}

		return managed;

	}

	public List<JdmEngines> findAll() {
		String jpql = "SELECT e FROM JdmEngines e";
		List<JdmEngines> engines = em.createQuery(jpql, JdmEngines.class).getResultList();
		return engines;
	}
}
