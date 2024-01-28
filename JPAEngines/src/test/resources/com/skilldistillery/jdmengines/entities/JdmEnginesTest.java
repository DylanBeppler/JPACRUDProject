package com.skilldistillery.jdmengines.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class JdmEnginesTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private JdmEngines JdmEngines;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Engines");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		JdmEngines = em.find(JdmEngines.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		JdmEngines = null;
	}

	@Test
	void test_JdmEngines_entity_mapping() {
		assertNotNull(JdmEngines);
		assertEquals("ca18det", JdmEngines.getName());

	}

//    @Test
//    void test_addNewJdmEngine() {
//        String name = "New Engine";
//        int size = 2000;
//        int cylinders = 4;
//        int power = 250;
//        String unit = "HP";
//
//        // Add a new engine
//        em.getTransaction().begin();
//        jdmenginesdao.addNewJdmEngine(name, size, cylinders, power, unit);
//        em.getTransaction().commit();
//
//        // Fetch the newly added engine
//        JdmEngines newEngine = em.createQuery("SELECT e FROM JdmEngines e WHERE e.name = :name", JdmEngines.class)
//                                 .setParameter("name", name)
//                                 .getSingleResult();
//
//        assertNotNull(newEngine, "New engine should be persisted");
//        assertEquals(name, newEngine.getName(), "Engine name should match");
//        assertEquals(size, newEngine.getSize(), "Engine size should match");
//        assertEquals(cylinders, newEngine.getCylinders(), "Engine cylinders should match");
//        assertEquals(power, newEngine.getPower(), "Engine power should match");
//        assertEquals(unit, newEngine.getUnit(), "Engine unit should match");
//    }

}
