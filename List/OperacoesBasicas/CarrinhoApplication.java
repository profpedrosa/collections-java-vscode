package List.OperacoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class CarrinhoApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2.00, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2.00, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35.00, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.00, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        // Removendo um item do carrinho
        System.out.println("Removendo ìtens: ");
        System.out.println("Digite o item que será removido: ");
        String itemRemover = sc.next();
        carrinhoDeCompras.removerItem(itemRemover);

       // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        sc.close();
    }

}