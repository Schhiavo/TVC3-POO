package br.ufjf.dcc.poo.Model;

public class Pedido {
    private int numero;
	
	private CarrinhoCompras carrinhoCompra;
	private Pagamento pagamento;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public CarrinhoCompras getCarrinhoCompra() {
		return carrinhoCompra;
	}
	public void setCarrinhoCompra(CarrinhoCompras carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void fecharPedido (){}
	public void buscarPedido (){}
	public void criarPagamento (){}
	public int gerarNumeroPedido (){
		return 0;
	};
}
