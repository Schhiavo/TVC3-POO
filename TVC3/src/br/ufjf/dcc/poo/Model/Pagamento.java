package br.ufjf.dcc.poo.Model;

import java.sql.Date;

public class Pagamento {

	private Date dataPagamento; 
	
	private Pedido pedido;
	
	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void criarPagamento (){};
}
