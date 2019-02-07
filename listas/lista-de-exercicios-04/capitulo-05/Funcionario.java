class Funcionario{
	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;

	void recebeAumento(double valorAumento){
		salario+=valorAumento;
	}

	double calculaGanhoAnual(){
		double ganhoAnual;
		ganhoAnual=salario*12;
		return ganhoAnual;
	}
	void mostra(){
		System.out.println("Nome: "+nome);
		System.out.println("Departamento: "+departamento);
		System.out.println("Salario: "+salario);
		System.out.println("Data de entrada: "+dataDeEntrada);
		System.out.println("RG: "+rg);
	}

}
