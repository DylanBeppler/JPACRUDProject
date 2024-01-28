package com.skilldistillery.jdmengines.data;

import com.skilldistillery.jdmengines.entities.JdmEngines;

public interface JdmEnginesDAO {
JdmEngines findById(int id);
public void addNewJdmEngine(String name, int size, int cylinders, int power, String unit);
}
