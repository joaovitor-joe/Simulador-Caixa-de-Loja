package lacofor.simuladorcaixadeloja;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalCompra = 0.0;
        String resumoCompra = "";

        System.out.println("Quantos produtos diferentes você vai registrar? ");
        int quantidadeProdutos = sc.nextInt();

        for (int i = 1; i <= quantidadeProdutos; i++) {
            sc.nextLine();
        }

        System.out.println();

        sc.close();
    }

}
