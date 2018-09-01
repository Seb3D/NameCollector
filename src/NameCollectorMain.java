import java.util.Scanner;

import de.realseb3d.NameCollector.*;

/* 
 * V0.1.0
 * @author by Sebastian "Seb3D" Lein 
*/

public class NameCollectorMain {

	public static void main(String[] args) {
		
			CalculationNameDatabase db = new CalculationNameDatabase();
			
			Scanner input = new Scanner(System.in);
			
			int y = 0;
			
			while(y == 0) {
			
				System.out.println("Geben Sie eine der nachfolgenden Zahlen ein:");
				System.out.println("1: Datei nur auslesen");
				System.out.println("2: Datei mit einem Namen überschreiben");
				
				int c = input.nextInt();
				
				if(c == 1) {
					db.readFile();
					y++;					
				}
				else if(c == 2) {
					
					System.out.println("Gebe den einzutragenden Namen ein");
					String b = input.next();
					db.writeFile(b);
					y++;
					
				}
				else {
					continue;
				}
				
				
			}	
			
		input.close();
		
	}

}
