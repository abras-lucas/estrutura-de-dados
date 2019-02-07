package br.edu.ifce.estruturas.vetor;

public class TesteContemAluno {

	public static void main(String[] args) {

		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		a1.setNome("Bia");
		Aluno a2 = new Aluno();
		a2.setNome("Bia");

		v1.adiciona(a1);
		v1.adiciona(a2);

		System.out.println(v1);

		System.out.println(v1.contem(a2));
		
	}

}
