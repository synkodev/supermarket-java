package com.example;

import java.util.Scanner;

import implementation.*;

/**
 * Hello world!
 *
 */
public class App
{
    private final static int SIZE = 3;
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do {
          System.out.println("\nLista de compras:");
          System.out.println("1 - Inserir");
          System.out.println("2 - Listar");
          System.out.println("3 - Remover");
          System.out.println("4 - Sair");
          System.out.print("Escolha uma opção: ");
          opcao = scanner.nextInt();

          switch (opcao) {
            case 1:
              System.out.print("Digite o item a ser inserido: ");
              String item = scanner.next();
              supermarket.add(item);
              break;
            case 2:
              supermarket.print();
              break;
            case 3:
              System.out.print("Posição do item a ser removido: ");
              int index = scanner.nextInt();
              supermarket.delete(index - 1);
              break;
            case 4:
              System.out.println("Saindo do programa...");
              break;
            default:
              System.out.println("Escolha uma opção válida do menu!");
          }
        } while (opcao != 4);

        scanner.close();
    }
}
