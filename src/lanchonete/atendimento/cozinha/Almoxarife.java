package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.print("CONTROLANDO A ENTRADA  DOS ITENS");
	}

	private void controlarSaida() {
		System.out.print("CONTROLANDO A SAIDA DOS ITENS ");

	}
	//MÉTODOS DEFAULT
	void entregarIngredientes() {

		System.out.print("ENTREGANDO iNGREDIENTES");
		controlarSaida();
	}

	void pedirParaTrocarGas() {

		System.out.print("ALMOXARIFE TROCANDO O GAS");
	}
}
