//3.3 Exercícios: Variáveis e tipos primitivos
/*a)*/class BalancoTrimestral{
	public static void main(String[] args) {
		//b)
		int gastosJaneiro=15000;
		//c)
		int gastosFevereiro=23000;
		int gastosMarco=17000;
		//d)
		int gastosTrimestre=gastosJaneiro+gastosFevereiro+gastosMarco;
		//e)
		System.out.println("O Total de gasto no trimestre foi: R$"+gastosTrimestre);
		//2)
		double mediaMensal=((double)gastosJaneiro+gastosFevereiro+gastosMarco)/3;
		System.out.println("Valor da media mensal: R$"+mediaMensal);
	}
}