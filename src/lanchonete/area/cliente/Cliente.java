package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {

		System.out.print("ESCOLHENDO O LANCHE");
	}

	public void fazerPedido() {

		System.out.print("FAZENDO PEDIDO");

	}

	public void pagarConta() {
		consultaSaldoDoAplicativo();
		System.out.print("PAGANDO A CONTA");
	}

	private void consultaSaldoDoAplicativo() {

		System.out.print("CONSULTANDO SALDO NO APLICATIVO ");
	}

}
