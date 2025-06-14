package entities;

public class Aluno extends Usuario {

	private String curso;

	public Aluno(String nome, String id, String curso) {
		super(nome, id);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "[Nome: " + getNome() + ", ID: " + getId() +", Curso: " + curso + "]";
	}
	
	@Override
	public String exibirTipoUsuario() {
		return "Aluno";
	}	
}
