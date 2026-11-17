package lacofor.simuladorcaixadeloja;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalCompra = 0.0;
        String resumoCompra = "";

        System.out.print("Quantos produtos diferentes você vai registrar? ");
        int quantidadeProdutos = sc.nextInt();

        for (int i = 1; i <= quantidadeProdutos; i++) {
            sc.nextLine();

            System.out.print("Digite o nome do produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Digite o preço unitário: ");
            double precoUnitario = sc.nextDouble();

            System.out.print("Quantidade comprada: ");
            int quantidade = sc.nextInt();

            double subTotal = precoUnitario * quantidade;
            totalCompra += subTotal;

            resumoCompra += "Item: " + nomeProduto + " | Quantidade: " + quantidade + " | Subtotal: R$ " + subTotal + "\n";
        }

        System.out.println();

        sc.close();
    }

}
