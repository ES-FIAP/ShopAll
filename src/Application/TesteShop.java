package Application;

import java.util.Scanner;

import Produtos.Alimento;
import Produtos.Bebida;
import Produtos.Eletronico;
import Produtos.Vestuario;

public class TesteShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Shop All");
        System.out.println("Escolha o tipo de produto a ser cadastrado:");
        System.out.println("1 - Eletrônico");
        System.out.println("2 - Vestuário");
        System.out.println("3 - Alimentício");
        System.out.println("4 - Bebida");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                cadastrarEletronico();
                break;
            case 2:
                cadastrarVestuario();
                break;
            case 3:
                cadastrarAlimenticio();
                break;
            case 4:
                cadastrarBebida();
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    private static void cadastrarEletronico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Eletrônico:");
        String nome = scanner.nextLine();

        System.out.println("Descrição do Eletrônico:");
        String descricao = scanner.nextLine();

        System.out.println("Preço do Eletrônico:");
        double preco = scanner.nextDouble();

        System.out.println("Quantidade no estoque:");
        int estoque = scanner.nextInt();

        System.out.println("Fabricante do Eletrônico:");
        String fabricante = scanner.nextLine();

        System.out.println("Modelo do Eletrônico:");
        String modelo = scanner.nextLine();

        Eletronico eletronico = new Eletronico(nome, preco, descricao, estoque, fabricante, modelo);

        System.out.println(eletronico.imprimirDetalhes());
    }

    private static void cadastrarVestuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome da Roupa:");
        String nome = scanner.nextLine();

        System.out.println("Descrição da Roupa:");
        String descricao = scanner.nextLine();

        System.out.println("Preço da Roupa:");
        double preco = scanner.nextDouble();

        System.out.println("Quantidade no estoque:");
        int estoque = scanner.nextInt();

        System.out.println("Fabricante da Roupa:");
        String fabricante = scanner.nextLine();

        System.out.println("Tamanho da Roupa:");
        String tamanho = scanner.nextLine();

        System.out.println("Cor da Roupa:");
        String cor = scanner.nextLine();

        System.out.println("Material da Roupa:");
        String material = scanner.nextLine();

        Vestuario vestuario = new Vestuario(nome, preco, descricao, estoque, fabricante, tamanho, cor, material);

        System.out.println(vestuario.imprimirDetalhes());
    }

    private static void cadastrarAlimenticio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Alimento:");
        String nome = scanner.nextLine();

        System.out.println("Preço do Alimento:");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Descrição do Alimento:");
        String descricao = scanner.nextLine();

        System.out.println("Estoque do Alimento:");
        int estoque = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Fabricante do Alimento:");
        String fabricante = scanner.nextLine();

        System.out.println("Data de Validade do Alimento:");
        String dataValidade = scanner.nextLine();

        System.out.println("Ingredientes do Alimento:");
        String ingredientes = scanner.nextLine();

        Alimento alimento = new Alimento(nome, preco, descricao, estoque, fabricante, dataValidade, ingredientes);

        System.out.println(alimento.imprimirDetalhes());
    }

    private static void cadastrarBebida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome da Bebida:");
        String nome = scanner.nextLine();

        System.out.println("Preço da Bebida:");
        double preco = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Descrição da Bebida:");
        String descricao = scanner.nextLine();

        System.out.println("Estoque da Bebida:");
        int estoque = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Fabricante da Bebida:");
        String fabricante = scanner.nextLine();

        System.out.println("Data de Validade da Bebida:");
        String dataValidade = scanner.nextLine();

        System.out.println("Ingredientes da Bebida:");
        String ingredientes = scanner.nextLine();

        System.out.println("A Bebida é alcoólica? (true/false):");
        boolean alcoolica = scanner.nextBoolean();

        System.out.println("Volume da Bebida (ml):");
        double volume = scanner.nextDouble();

        Bebida bebida = new Bebida(nome, preco, descricao, estoque, fabricante, dataValidade, ingredientes, alcoolica,
                volume);

        System.out.println(bebida.imprimirDetalhes());
    }

}
