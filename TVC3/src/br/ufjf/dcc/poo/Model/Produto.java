package br.ufjf.dcc.poo.Model;

import java.util.ArrayList;

public class Produto  {
	
	private ItensCompra itensCompra;
	private EspecificacaoProduto especificacaoProduto;
	
	public ItensCompra getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(ItensCompra itensCompra) {
		this.itensCompra = itensCompra;
	}

	public EspecificacaoProduto getEspecificacaoProduto() {
		return especificacaoProduto;
	}

	public void setEspecificacaoProduto(EspecificacaoProduto especificacaoProduto) {
		this.especificacaoProduto = especificacaoProduto;
	}
	
	public ArrayList<Produto> buscarProduto() {
		return null;
	}

}
