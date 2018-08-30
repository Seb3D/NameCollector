import de.realseb3d.NameCollector.*;

/* V0.0.1
 * 
 *Dieses Programm ist in der aller ersten Version eine exakte Kopie aus Jannis Seemanns Udemy Kurs und wird in den weiteren Versionen von mir weiterentwickelt, weil die Grundfunktionen an sich gut sind, allerdings das Programm in meinen Augen noch nicht das sind, was ich mir darunter vorstelle.
 *@author Jannis Seemann 
*/

public class NameCollectorMain {

	public static void main(String[] args) {
		
			StudentDatabase sd = new FileStudentDatabase();
				
			try {
				sd.addStudent("12345");
				
				String[] students = sd.readAllStudents();
				for (String student : students) {
					System.out.println(student);
				}
					
			} catch (StudentDatabaseException e) {
				System.out.println("Es ist ein Fehler aufgetreten!");
				e.printStackTrace();
			}
				
		
	}

}
