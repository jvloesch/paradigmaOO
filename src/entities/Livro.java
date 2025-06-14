package entities;

import java.time.LocalDate;

public class Livro {

	private String titulo, autor, isbn;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, String isbn, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "[Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Disponível: " + disponivel + "]";
	}
	
	public Emprestimo emprestar(Usuario usuario, LocalDate date) {
		if(disponivel) {
			System.out.println("Livro emprestado com sucesso!");
			disponivel = false;
			return new Emprestimo(usuario, this, date);
		}
		else {
			System.out.println("Erro: Livro não disponível.");
			return null;
		}
	}
	
	public boolean devolver(Emprestimo emprestimo, LocalDate date) {
		if(!disponivel) {
			System.out.println("Livro devolvido com sucesso!");
			emprestimo.setDataDevolucao(date);
			disponivel = true;
			return true;
		}
		else {
			System.out.println("Erro: Livro já foi devolvido.");
			return false;
		}
	}
	
	public void exibirInformacoes() {
		System.out.println(this);
	}
}

