package entities;

public class Professor extends Usuario {

	private String departamento;

	public Professor(String nome, String id, String departamento) {
		super(nome, id);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "[Nome: " + getNome() + ", ID: " + getId() +", Departamento: " + departamento + "]";
	}
	
	@Override
	public String exibirTipoUsuario() {
		return "Professor";
	}	
}
