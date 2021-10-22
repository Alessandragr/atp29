package views;

import java.util.Scanner;

import controllers.CategoriasController;
import controllers.ProdutosController;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CategoriasController categoriasController = new CategoriasController();
        ProdutosController produtosController = new ProdutosController();

    
    }
    public void menu() {
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
            System.out.println("Insira o ID do produto: ");
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
    }
    private static String ler_texto(String mensagem) {
        System.out.println(mensagem);
        String texto = scan.nextLine();
        return texto;
    }
    private static double ler_numero(String mensagem){
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }


}
