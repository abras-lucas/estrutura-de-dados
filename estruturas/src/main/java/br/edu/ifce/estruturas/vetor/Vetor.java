package br.edu.ifce.estruturas.vetor;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.alunos[totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		for(int i=this.totalDeAlunos;i>posicao;i--){
			this.alunos[i]=this.alunos[i-1];
		}
		this.alunos[posicao]=aluno;
		this.totalDeAlunos++;
	}

	public Aluno pega(int posicao) {
		if(posicaoOcupada(posicao)==false){
			//EXCEÇÃO
			throw new IllegalArgumentException("Posicao Invalida!");
		}
		return alunos[posicao];
	}

	private boolean posicaoOcupada(int posicao) {
		if(posicao>=0 && posicao<totalDeAlunos){
			return true;
		} else{
			return false;
		}
	}

	public void remove(int posicao) {
		// implementacao
	}

	public boolean contem(Aluno aluno) {
		for(int i=0;i<this.totalDeAlunos;i++){
			if(alunos[i].getNome()==aluno.getNome()) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");

		return builder.toString();
	}

}
