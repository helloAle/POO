package supermercado;

public class produtos {
	String produto;
	String dinheiro;
	String cheque;
	String cartao;
	public produtos(String produto, String dinheiro, String cheque, String cartao) {
		super();
		this.produto = produto;
		this.dinheiro = dinheiro;
		this.cheque = cheque;
		this.cartao = cartao;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(String dinheiro) {
		this.dinheiro = dinheiro;
	}
	public String getCheque() {
		return cheque;
	}
	public void setCheque(String cheque) {
		this.cheque = cheque;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
}
