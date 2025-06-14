package entities;

public abstract class Usuario {

	private String nome, id;

	public Usuario(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "[Nome: " + nome + ", ID: " + id + "]";
	}
	
	public void exibirInformacoes() {
		System.out.println(this);
	}
	
	public abstract String exibirTipoUsuario();
	
}
