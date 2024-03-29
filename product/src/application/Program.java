package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto =  new Product();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Digite o numero de produtos para ser adicionado ao estoque:");
		
		int quantidade = sc.nextInt();
		produto.AdicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Digite o numero de produtos para ser removidos do estoque:");
		
		quantidade = sc.nextInt();
		produto.RemoverProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		
		sc.close();

	}

}
