package de.realseb3d.NameCollector;

public interface NameDatabase {
	
	public String[] readAllNames() throws NameDatabaseException;
	
	public void addName(String name1) throws NameDatabaseException;
	
}
