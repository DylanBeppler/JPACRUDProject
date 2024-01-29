package com.skilldistillery.jdmengines.data;

import java.util.List;

import com.skilldistillery.jdmengines.entities.JdmEngines;

public interface JdmEnginesDAO {
JdmEngines findById(int id);
public JdmEngines addNewJdmEngine(int id, String name, int size, int cylinders, int power, String unit);
JdmEngines update(int id, JdmEngines updatedEngine);
public boolean deleteJdmEngine(int id);
public List<JdmEngines> findAll();
}
