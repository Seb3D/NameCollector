package de.realseb3d.NameCollector;

public class CalculationNameDatabase {

	private FileNameDatabase db = new FileNameDatabase();
	
	public void readFile() {
		
		try {
			
			String[] names = db.readAllNames();
			for (String name : names) {
				System.out.println(name);
			}
				
		} catch (NameDatabaseException e) {
			System.out.println("Es ist ein Fehler aufgetreten!");
			e.printStackTrace();
		}
	}
	
	public void writeFile(String b) {
		
		try {
			
			db.addName(b);
			String[] names = db.readAllNames();
			for (String name : names) {
				System.out.println(name);
			}
				
		} catch (NameDatabaseException e) {
			System.out.println("Es ist ein Fehler aufgetreten!");
			e.printStackTrace();
		}
	}
	
}
