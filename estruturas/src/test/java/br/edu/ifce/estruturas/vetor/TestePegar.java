package br.edu.ifce.estruturas.vetor;

public class TestePegar {

	public static void main(String[] args) {

		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		a1.setNome("Felipe");

		v1.adiciona(a1);

		System.out.println(v1.pega(5));

	}

}
