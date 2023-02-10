package br.ufjf.dcc.poo.Model;

import java.util.ArrayList;

public class CarrinhoCompras {
	
	private ArrayList<ItensCompra> itenscompras;
	private Login login;
	private Pedido pedido;
	
	public ArrayList<ItensCompra> getItenscompras() {
		return itenscompras;
	}
	public void setItenscompras(ArrayList<ItensCompra> itenscompras) {
		this.itenscompras = itenscompras;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public void finalizarCompra (){}
	public void inserirProduto (){} 
	public void excluirProduto (){} 
	public void alterarProduto (){}
	
}
