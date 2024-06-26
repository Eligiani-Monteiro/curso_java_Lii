package escola;

public class Escola {
	public static void main(String[] args) {
Aluno felipe = new Aluno();// criando o objeto

		felipe.setNome ("Felipe Junior ");  //l inhas 7 e 8 definindo os objetos
		felipe.setIdade ( 12);
		
		System.out.println("O Aluno " + felipe.getNome()  + " tem " + felipe.getIdade()  + " anos ");
		//imprimindo o valor dos atributos
		// RESULTADO NO CONSOLE
		// O aluno Felipe tem 8 anos

	}

}
