class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String rg;

	private void recebeAumento(double valorAumento){
		salario+=valorAumento;
	}

	private double calculaGanhoAnual(){
		double ganhoAnual;
		ganhoAnual=salario*12;
		return ganhoAnual;
	}
	private void mostra(){
		System.out.println("Nome: "+nome);
		System.out.println("Departamento: "+departamento);
		System.out.println("Salario: "+salario);
		System.out.println("Data de entrada: "+dataDeEntrada);
		System.out.println("RG: "+rg);
	}
	public double getSalario() {
	return this.salario;
	}
	public void setSalario(double salario) {
	this.salario = salario;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public Funcionario() {
	}
	public Funcionario(String nome) {
	}

}
