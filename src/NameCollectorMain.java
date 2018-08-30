import de.realseb3d.NameCollector.*;

/* 
 * V0.0.1
 * @author Jannis Seemann
 * modified by Sebastian "Seb3D" Lein 
*/

public class NameCollectorMain {

	public static void main(String[] args) {
		
			NameDatabase db = new FileNameDatabase();
				
			try {
				db.addName("12345");
				
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
