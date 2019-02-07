class TesteFunc{
	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		f1.setNome="Danilo";
		f1.setSalario=100;
		Funcionario f2=new Funcionario();
		f2.setNome="Danilo";
		f2.setSalario=100;
		if (f1==f2){
			System.out.println("Iguais");
		}
			else{
				System.out.println("Diferentes");
			}

		Funcionario f3=new Funcionario();
		f3.setNome="Hugo";
		f3.setSalario=100;
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