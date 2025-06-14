package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Aluno;
import entities.Emprestimo;
import entities.Livro;
import entities.Professor;
import entities.Usuario;

//NOME DO ALUNO: João Vítor Loesch

public class Program {
	public static void main(String[] args) {
		
		Livro livro1 = new Livro("Depois", "Stephen King", "978-8556511133", true);
		Livro livro2 = new Livro("Recursão", "Blake Crouch", "978-8551005378", true);
		Livro livro3 = new Livro("Matéria Escura", "Blake Crouch", "978-8551001226", true);
		Livro livro4 = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", "978-8575225639", true);
		
		livro1.exibirInformacoes();
		livro2.exibirInformacoes();
		livro3.exibirInformacoes();
		livro4.exibirInformacoes();
		System.out.println();
		
		Usuario usuario1 = new Professor("Albert Einstein", "123A", "Física");
		Usuario usuario2 = new Professor("Renato Portaluppi", "1983C", "Futebol");
		Usuario usuario3 = new Aluno("João Vítor Loesch", "2001B", "Ciência da Computação");
		Usuario usuario4 = new Aluno("Milena Cordeiro Oliari", "2001A", "Odontologia");
		
		usuario1.exibirInformacoes();
		usuario2.exibirInformacoes();
		usuario3.exibirInformacoes();
		usuario4.exibirInformacoes();
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Emprestimo emprestimo1 = livro1.emprestar(usuario4, LocalDate.parse("03/04/2025", formatter));
		emprestimo1.exibirResumoEmprestimo();
		System.out.println();
		livro1.devolver(emprestimo1, LocalDate.parse("15/04/2025", formatter));
		emprestimo1.exibirResumoEmprestimo();
		System.out.println();
		
		
		Emprestimo emprestimo2 = livro4.emprestar(usuario1, LocalDate.parse("01/01/1950", formatter));
		emprestimo2.exibirResumoEmprestimo();
		System.out.println();
		
		Emprestimo emprestimo3 = livro3.emprestar(usuario3, LocalDate.parse("13/06/2025", formatter));
		emprestimo3.exibirResumoEmprestimo();
		System.out.println();
		
		Emprestimo emprestimo4 = livro2.emprestar(usuario2, LocalDate.parse("11/12/1983", formatter));
		emprestimo4.exibirResumoEmprestimo();
		livro2.emprestar(usuario4, LocalDate.parse("16/04/2025", formatter));
		System.out.println();
		
		Emprestimo emprestimo5 = livro1.emprestar(usuario4, LocalDate.parse("16/04/2025", formatter));
		emprestimo5.exibirResumoEmprestimo();
		System.out.println();
	}
}
