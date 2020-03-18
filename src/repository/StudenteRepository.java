package repository;

import model.Studente;
import java.util.List;

public interface StudenteRepository {
	public void saveStudente(Studente studente);
	public Studente findById(Long id);
	public List<Studente> getAllStudenti();
	public void update(Studente studente);
	public void delete(Studente studente);
	
	public List<Studente> findByNome(String nome);
	public List<Studente> findByCognome(String cognome);
	

}
