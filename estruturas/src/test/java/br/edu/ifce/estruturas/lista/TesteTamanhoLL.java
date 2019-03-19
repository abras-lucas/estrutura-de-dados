class TesteTamanhoLL{

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();

		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		lista.adicionaNoComeco("Felipe");

		System.out.println(lista);

		System.out.println(lista.tamanho());

	}
}