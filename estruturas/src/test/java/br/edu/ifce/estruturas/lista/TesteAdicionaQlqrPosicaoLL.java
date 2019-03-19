class TesteAdicionaQlqrPosicaoLL{

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();

		lista.adiciona(0,"Rafael");
		lista.adiciona(1,"Paulo");
		lista.adiciona(0,"Felipe");

		System.out.println(lista);

	}
}