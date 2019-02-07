class TesteFunc{
	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		f1.nome="Danilo";
		f1.salario=100;
		Funcionario f2=new Funcionario();
		f2.nome="Danilo";
		f2.salario=100;
		if (f1==f2){
			System.out.println("Iguais");
		}
			else{
				System.out.println("Diferentes");
			}

		Funcionario f3=new Funcionario();
		f3.nome="Hugo";
		f3.salario=100;
		Funcionario f4=new Funcionario();
		f4=f3;
		if (f4==f3){
			System.out.println("Iguais");
		}
			else{
				System.out.println("Diferentes");
			}
	}
}