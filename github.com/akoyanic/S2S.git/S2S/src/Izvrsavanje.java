import java.util.LinkedList;

public class Izvrsavanje {
	
	public void prikaziSveStudente( LinkedList<Student> studenti) {
		if(studenti == null) {
			System.out.println("Greska!");
			return;
			
		}
		for (int i = 0; i < studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
	}
	
}
