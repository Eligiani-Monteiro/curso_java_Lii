package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// AÇÕES QUE NÃO PRECISAM ESTAR DISPONIVEIS ESTÃO PRIVADOS
		//cozinheiro.lavarIngredientes();
		//cozinheiro.baterVtaminaLiquidificador();
		//cozinheiro.selecionarIngredientesVitaminas();
		//cozinheiro.prepararLanche();
		//cozinheiro.prepararVitamina();
		//cozinheiro.prepararVitamina();

		// AÇÕES QUE O ESTABELECIMENTO PRECISA TER CIÊNCIA
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		//Almoxarife almoxarife = new Almoxarife();
		// AÇÕES QUE NÃO PRECISAM ESTAR DISPONÍVEIS
		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		//ESSA CLASSE NÃO PRECISA EXISTIR

		
		// AÇÕES QUE SOMENTE O SEU PACOTE COZINHA PRECISA CONHECER (defaut)
		//Neste trecho do código a classe estabelecimento não reconhece o método porque a classe Almoxarife a que se refere esta usando um modificador de acesso void (default)
		//almoxarife.entregarIngredientes();
		//almoxarife.pedirParaTrocarGas();

		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		//atendente.pegarLancheCozinha();PRIVATE
		//atendente.recebendoPagamento(); PRIVATE
		

		// AÇÕES QUE SOMENTE O SEU PACOTE COZINHA PRECISA CONHECER (defaut)
		//atendente.trocarGas();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		

		// esta ação é muito sigilosa, qua tal seman
		// ESTA AÇÃO É MUITO SIGILOSA, QUA TAL SEMANA
		

		// já pensou os clientes ouvindo que o gás acabou?

		//cozinheiro.pedirParaTrocarGas(atendente);
		//cozinheiro.pedirParaTrocarGas(almoxarife);

	}

}
