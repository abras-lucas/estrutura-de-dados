package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaQualquer {

	public static void main(String[] args) {
		
		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		a1.setNome("De");

		Aluno a2 = new Aluno();
		a2.setNome("Ze");

		Aluno a3 = new Aluno();
		a3.setNome("Sa");

		Aluno a4 = new Aluno();
		a4.setNome("Ju");

		v1.adiciona(a1);
		System.out.println(v1);
		v1.adiciona(a2);
		System.out.println(v1);
		v1.adiciona(a3);
		System.out.println(v1);
		v1.adiciona(0,a4);
		System.out.println(v1);

		System.out.println(v1);

	}

}
