package controller;

public class StudenteForm {
	String nome;
	String cognome;
	
	public StudenteForm(String nome, String cognome) {
		this.cognome = cognome;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}
