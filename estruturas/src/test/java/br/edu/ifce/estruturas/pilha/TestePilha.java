class TestePilha{


	public static void main(String[] args) {

		Pilha pilha = new Pilha();

		if (pilha.vazia()) {

			System.out.println("A pilha está vazia");
		
		}

		Peca peca1 = new Peca();
		peca1.setNome("Base");
		pilha.adiciona(peca1);

		Peca peca2 = new Peca();
		peca2.setNome("Tronco");
		pilha.adiciona(peca2);

		Peca peca3 = new Peca();
		peca3.setNome("Helices");
		pilha.adiciona(peca3);
		

		System.out.println(pilha.remove());

	
	}

}
