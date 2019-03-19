class Celula{

	private Object elemento;
	private Celula proximo; 

	public void setElemento(Object elemento){
		this.elemento = elemento;
	}

	public Object getElemento(){
		return this.elemento;
	}

	public void setProximo(Celula proximo){
		this.proximo = proximo;
	}

	public Celula getProximo(){
		return this.proximo;
	}
}