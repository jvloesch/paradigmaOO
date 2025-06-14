package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
	
	private Usuario usuario;
	private Livro livro;
	private LocalDate dataEmprestimo, dataDevolucao;
	
	public Emprestimo(Usuario usuario, Livro livro, LocalDate dataEmprestimo) {
		this.usuario = usuario;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {
		return "[Usuário: " + usuario + ", Livro: " + livro + ", Data de Empréstimo: " + dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ", Data de Devolução: " + dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "]";
	}
	
	private String exibirDataDevolucao() {
		if(dataDevolucao != null) {
			return dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}
		else
			return "Não devolvido";
	}
	
	public void exibirResumoEmprestimo() {
		System.out.println("Resumo do empréstimo:"
				+ "\nLivro: " + livro.getTitulo()
				+ "\nUsuário: " + usuario.getNome() + " (" + usuario.exibirTipoUsuario() + ")"
				+ "\nData do Empréstimo: " + dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ "\nData da Devolução: " + exibirDataDevolucao()
				+ "\n");
	}
	
}
