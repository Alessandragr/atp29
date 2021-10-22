package models;

public class Produtos extends Categorias {
    public String cor;
    public String modelo;
    public int ano;
    public double valor;

    @Override
    public String toString() {
        String retorno = super.toString() + "Cor: " + this.cor + "\n" +
        "Modelo: " + this.modelo + "\n" + "Ano: " + this.ano + "\n" +
        "Valor: R$ " + this.valor;
        return retorno;
    }
}