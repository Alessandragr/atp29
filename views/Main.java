package views;


import java.util.Scanner;

import controllers.CategoriasController;
import controllers.ProdutosController;
import models.Produtos;

public class Main {
    static Scanner scan = new Scanner(System.in);
    CategoriasController categoriasController = new CategoriasController();
    static ProdutosController produtosController = new ProdutosController();

    public static void main(String[] args) {
        
  
        
        
        menu();
        case1();
        case2();
        case3();
        case4();
        
       
    }
    
    public static int menu() {
        System.out.println("------Menu de Escolhas------");
        System.out.println("Digite: \n1 - para Cadastro;\n2 - para Update;\n3 - para Delete;\n4 - para Relatório;");

        int opcao =scan.nextInt();
        scan.nextLine();
        int escolha =0;
        switch (escolha) {
            case 1:
                System.out.println("Insira o ID do produto: ");
                System.out.println("Insira o modelo do produto: ");
                System.out.println("Insira o ano do produto: ");
                System.out.println("Insira o tipo de produto: ");
                System.out.println("Insira a voltagem do produto: ");
                System.out.println("Insira a linha do produto: ");
                System.out.println("Insira o valor do produto: ");
                return opcao;
            case 2:
                System.out.println("Insira o modelo do produto: ");
                System.out.println("Insira o ano do produto: ");
                System.out.println("Insira o tipo de produto: ");
                System.out.println("Insira a voltagem do produto: ");
                System.out.println("Insira a linha do produto: ");
                System.out.println("Insira o valor do produto: ");
                return opcao;
            case 3:
                System.out.println("Informe o ID do produto: ");
                return opcao;
            case 4:
                System.out.println("Informe o ID do produto: ");
                return opcao;
            default:
            System.out.println("Opção inválida!");
                break;
        }
        return escolha;
    }
    private static int cadastrarId(){
        int id = 0;
        return id;
    }
    private static String modelo () {
        String modelo = new String();
        return modelo;
    }
    private static int ano(){
        int ano = 0;
        return ano;
    }
    private static String tipo () {
        String tipo = new String();
        return tipo;
    }
    private static String voltagem () {
        String voltagem = new String();
        return voltagem;
    }
    private static String linha () {
        String linha = new String();
        return linha;
    }
    private static double valor() {
        double valor = 0.0;
        return valor;
    }
    private static int case1() {
        
        Produtos produtos = new Produtos();
        produtos.id = cadastrarId();
        produtos.modelo = modelo();
        produtos.ano = ano();
        produtos.tipo = tipo();
        produtos.voltagem = voltagem();
        produtos.linha = linha();
        produtosController.create(produtos);
        return 0;
    }
        
    private static int case2() {
        Produtos produtos = new Produtos();
        produtos.modelo = modelo();
        produtos.ano = ano();
        produtos.tipo = tipo();
        produtos.voltagem = voltagem();
        produtos.linha = linha();
        produtos.valor= valor();
        produtosController.update(produtos);
        return 0;
    }
    private static int case3() {
        Produtos produtos = new Produtos();
        produtos.id = cadastrarId();
        produtosController.delete(produtos);
        return 0;
    }
    private static int case4() {
        Produtos produtos = new Produtos();
        System.out.println(produtos.toString());
        return 0;
    }

}
