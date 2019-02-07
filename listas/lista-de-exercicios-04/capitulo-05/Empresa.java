class Empresa{
	String nomeEmpresa;
	int cnpj;
	int i=0;
	Funcionario[] empregados;
	void adiciona(Funcionario f){
		empregados[i]=f;
		i++;
	}
	void mostraEmpregados() {
		for (int i=0;i<empregados.length;i++){
			System.out.println("Funcionario na posicao: "+i);
			System.out.println("Salario: "+empregados[i].salario);
		}
	}
}