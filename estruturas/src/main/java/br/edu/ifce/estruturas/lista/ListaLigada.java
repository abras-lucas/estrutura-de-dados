class ListaLigada{

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	//Aidiona no começo
	public void adicionaNoComeco(Object elemento){

		Celula nova = new Celula();
		nova.setElemento(elemento);
		nova.setProximo(this.primeiro);

		this.primeiro = nova;

		if(this.tamanho == 0){
			this.ultimo = this.primeiro;
		}

		this.tamanho++;

	}

	//Adiciona em qlqr posiçao
	public void adiciona(int posicao, Object elemento){

		if(posicao == 0){

			this.adicionaNoComeco(elemento);

		}else if(posicao == this.tamanho){

			this.adiciona(elemento);

		}else{

			Celula anterior = new Celula();
			anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula();
			nova.setProximo(anterior.getProximo());
			nova.setElemento(elemento);
			anterior.setProximo(nova);
			this.tamanho++;
		
		}
	}

	//Adiciona no final
	public void adiciona(Object elemento){

		if(this.tamanho == 0){

			this.adicionaNoComeco(elemento);

		}

		else{

			Celula nova = new Celula();
			nova.setElemento(elemento);
			nova.setProximo(null);
			this.ultimo.setProximo(nova);
			this.ultimo = nova;

			this.tamanho++;

		}

	}

	public Object pega(int posicao) {

		return this.pegaCelula(posicao).getElemento();

	}

	public Celula pegaCelula(int posicao){

		if(this.posicaoOcupada(posicao) == true){

			Celula atual = primeiro;

			for(int i=0;i<posicao;i++) {

				atual = atual.getProximo();

			}

			return atual;

		}else{

			throw new IllegalArgumentException("Posição não existe");

		}

	}

	public boolean contem(Object elemento){

		Celula atual = this.primeiro;

		while (atual != null) {

			if (atual.getElemento().equals(elemento)) {

				return true;

			}

			atual = atual.getProximo();

		}

		return false;

	}

	public int tamanho(){
		
		return this.tamanho;	
	}

	public void remove(int posicao){

	}

	private boolean posicaoOcupada(int posicao){

		if(posicao >= 0 && posicao < this.tamanho){

			return true;

		}

		return false;
	}

	public String toString(){

		if(this.tamanho == 0){

			return ("[]");

		}

		StringBuilder builder = new StringBuilder();

		builder.append("[");

		Celula atual = this.primeiro;

		for(int i=0;i<this.tamanho-1;i++){

			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();

		}

		builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}

}