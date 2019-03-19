import java.util.LinkedList;

class Pilha{

	List<Peca> pecas = new LinkedList<Peca>();

	public void adiciona(Peca peca) {

		this.pecas.add(peca);

	}

	public Peca remove() {

		return this.pecas.remove(this.pecas.size() - 1);

	}

	public boolean vazia(){

		return this.pecas.size() == 0;

	}

}