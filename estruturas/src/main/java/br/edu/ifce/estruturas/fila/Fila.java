import java.util.LinkedList;
class Fila{

	private List<Object> objetos = new LinkedList<Object>();

	public void adiciona(Object objeto) {

	this.objetos.add(objeto);

	}

	public Object remove() {

	return this.objetos.remove(0);

	}

	public boolean vazia() {

	return this.objetos.size() == 0;

	}
}