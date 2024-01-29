package com.skilldistillery.jdmengines.data;

import com.skilldistillery.jdmengines.entities.JdmEngines;

public interface JdmEnginesDAO {
JdmEngines findById(int id);
public void addNewJdmEngine(String name, int size, int cylinders, int power, String unit);
JdmEngines update(int id, JdmEngines updatedEngine);
public boolean deleteJdmEngine(int id);
}
