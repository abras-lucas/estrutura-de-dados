package br.edu.fice.estruturas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	int numeroElementos = 0;
	
	public ArrayList<LinkedList<Object>> tabelaEspalhamento
	= new ArrayList<LinkedList<Object>>();

	public ConjuntoEspalhamento() {
		
		for(int i=0; i<26; i++) {
			
			LinkedList<Object> lista = new LinkedList<Object>();
			tabelaEspalhamento.add(lista);
			
		}
		
	}
	
	public int calculaCodigoHash(Object palavra) {
		
		int codigo = 1;
		
		for(int i=0;i<((String) palavra).length(); i++) {
		
		codigo = 31*codigo + ((String) palavra).toLowerCase().charAt(i);
		
		}
		//PODE DAR NEGATIVO
		return codigo;
		
	}
	
	private int calculaIndiceTabela(Object palavra) {
		
		int codigoHash = Math.abs(this.calculaCodigoHash(palavra));
		
		return codigoHash % this.tabelaEspalhamento.size();
		
	}
	
//	public int funcaoHash(String palavra) {
//		
//		return palavra.toLowerCase().charAt(0) % 26;
//		
//	}
	
	public void adiciona(Object palavra) {
		
		if(!contem(palavra)) {
			
			this.verificaCarga();
		
			this.tabelaEspalhamento.get(this.calculaIndiceTabela(palavra)).add(palavra);
			numeroElementos++;
		
//		int indice = funcaoHash(palavra);
//		
//		List<String> lista = this.tabelaEspalhamento.get(indice);
//		lista.add(palavra);
		
		}
		
	}
	
	public boolean contem(Object palavra) {
		
		int indice = this.calculaIndiceTabela(palavra);
		LinkedList<Object> verifica = this.tabelaEspalhamento.get(indice);
		return verifica.contains(palavra);
		
	}
	
	public void remove(Object palavra) {
		
		if(contem(palavra)) {
		
		int indice = this.calculaIndiceTabela(palavra);
		LinkedList<Object> remover = this.tabelaEspalhamento.get(indice);
		remover.remove(palavra);
		numeroElementos--;
		this.verificaCarga();
		
		}
		
	}
	
	public void verificaCarga() {
		
		int numeroElementos = this.numeroElementos;
		int numeroListas = tabelaEspalhamento.size();
		
		double carga = numeroElementos/numeroListas;
		
		if(carga > 0.7) {
			
			redimensionaTabela(numeroListas*2);
			
		}else if(carga < 0.3) {
			
			redimensionaTabela(Math.max(10, numeroListas/2));
			
		}
		
	}
	
	public void redimensionaTabela(int novoNumeroListas) {
		
		List<Object> guardaPalavras = new ArrayList<Object>();
		
		for(int i=0;i<this.tabelaEspalhamento.size();i++) {
			
			guardaPalavras.addAll(this.tabelaEspalhamento.get(i));
			
		}
				
		this.tabelaEspalhamento.clear();
		
		for(int i=0; i<novoNumeroListas; i++) {
			
			tabelaEspalhamento.add(new LinkedList<Object>());
			
		}
		
		for(Object palavra : guardaPalavras) {
			
			this.adiciona(palavra);
			
		}
		
	}
	
	public String toString() {
		
		if(numeroElementos == 0) {
			
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i<numeroElementos; i++) {
			
			builder.append("[");
			
			for(int j = 0; j<numeroElementos - 1; j++) {
				
				if(this.tabelaEspalhamento.get(i).isEmpty()) {
				
					builder.append("[]");
				
				}else {
					
					builder.append(this.tabelaEspalhamento.get(i).get(j));
					builder.append(", ");
					
				}
				
			}
			
			builder.append(this.tabelaEspalhamento.get(i).getLast());
			builder.append("]");
			
		}
		
		return builder.toString();
		
	}
}
