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
        System.out.println("Digite: \n1 - para Cadastro;\n2 - para Update;\n
        3 - para Delete;\n4 - para Relatório;");

        int opcao =scan.nextInt();
        scan.nextLine();
        int escolha =0;
        switch (escolha) {
            case 1:
                System.out.println("Insira ");
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
        
            default:
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
