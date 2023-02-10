package br.ufjf.dcc.poo.Model;

public class Login {
	private String usuario; 
	private String senha;
	
	
	private CarrinhoCompras carrinhoCompra;
	private Cliente cliente;
	
	
	 public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public CarrinhoCompras getCarrinhoCompra() {
		return carrinhoCompra;
	}
	public void setCarrinhoCompra(CarrinhoCompras carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void createUsuario(){} 
	 public void efetuarLogin (){} 
	 public void alterarDados (){}
	 public void excluirConta (){}

}
