package service;

import java.util.List;
import java.util.ArrayList;
import model.Studente;

public class StudenteService {

	private List<Studente> studenti;
	
	public StudenteService() {
		this.studenti = new ArrayList<>();
		Studente s1 = new Studente(1l, "Jacopo", "Mucci");
		Studente s2 = new Studente(2l, "Sara", "Guidi");
		Studente s3 = new Studente(3l, "Mario", "Rossi");
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
	}
	
	public void salvaStudente(Studente studente) {
		
		studenti.add(studente);
	}
	
	public List<Studente> getListaStudenti() {
		return this.studenti;
	}
	
	public Studente getStudente(Long id) {
		Studente studente = null;
		for(Studente s: studenti) {
			if(s.getId() == id) {
				studente = s;
			}
		}
		return studente;
	}
}
