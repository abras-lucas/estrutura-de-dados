package br.edu.fice.estruturas.conjunto;

public class Main {

	public static void main(String[] args) {

		ConjuntoEspalhamento cel = new ConjuntoEspalhamento();
		
//		System.out.println(cel.calculaCodigoHash("campeão"));
		
		cel.adiciona("Abrahao");
		cel.adiciona("Bia");
		cel.adiciona("Karol");
		cel.adiciona("Kevin");
		cel.adiciona("Cesar");
		cel.adiciona("Ednaldo");
		cel.adiciona("Gustavo");
		cel.adiciona("Felipe");
		cel.adiciona("Alisson");
		cel.adiciona("Warley");
		cel.adiciona("Junior");
		cel.adiciona("Pancadinha");
		
		System.out.println(cel.numeroElementos);
	
//		System.out.println(cel.tabelaEspalhamento.get(2));
//		
//		cel.remove("Higor");
//		
//		System.out.println(cel.tabelaEspalhamento.get(0));
		
	}

}
