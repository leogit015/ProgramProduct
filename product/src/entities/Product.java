package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double TotalValorEmEstoque() {
		return quantidade * preco;
	}
	
	public void AdicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void RemoverProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome +" , R$" + String.format("%.2f", preco) + " ," + quantidade + " unidades, Total: " + "R$" + String.format("%.2f", TotalValorEmEstoque());

	}

}
