package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	// pode ser defaut

	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL");
	}
	// PODE SER DEFAULT
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	//PODE SER DEFAULT
	public void  adicionarComboNoBalcao() {
			adicionarLancheNoBalcao();
			adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO  NATURAL...");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO LANCHE SUCO");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	//TRABALHANDO COM A QUESTÃO DA VISIBILIDADE DAS CLASSES COM O MODIVICADOR (PRIVATE)
	// QUANDO A CLASSE É DEAFAUT(void) ESTA DISPONIVEIS AOS PACOTES MAS SE  A APLICAÇÃO NÃO PRECISA DISSO
	//ENTÃO O IDEAL É USAR O (private)
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÂO, SALADA...");
		
	}

	private void selecionarIngredientesVitaminas() {
		System.out.println("SELECIONANDO A FRUTA,LEITE...");
		
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
		
	}
	private void baterVtaminaLiquidificador() {
		System.out.println("BATENDO A VITAMINA NO LIQUIDIFICADOR");
		
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO CARNE OVOS E BACON");
		
	}
	//Neste trecho do codigo o cozinhero não pode mais pedir para o atendente trocar o gas , somente ao Almoxarife
	
	//public void pedirParaTrocarGas(Atendente meuAmigo) {
		//meuAmigo.trocarGas();
		
	//}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	private void pedirParaTrocarGas(Almoxarife almoxarife) {
		almoxarife.pedirParaTrocarGas();
	}
}

