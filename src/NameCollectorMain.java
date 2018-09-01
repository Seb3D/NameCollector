import java.util.Scanner;

import de.realseb3d.NameCollector.*;

/* 
 * V0.0.2
 * @author Jannis Seemann
 * modified by Sebastian "Seb3D" Lein 
*/

public class NameCollectorMain {

	public static void main(String[] args) {
		
			NameDatabase db = new FileNameDatabase();
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Gebe den einzutragenden Namen ein");
			String b = input.next();
			
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
				
		input.close();
	}

}
