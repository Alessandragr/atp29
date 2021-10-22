package models;

public class Categorias extends Base {
    public String tipo;
    public String voltagem;
    public String linha;

    @Override
    public String toString() {
        String retorno = "Tipo: " + this.tipo + "\n" +
            "Voltagem: " + this.voltagem + "\n" +
            "Linha: " + this.linha + "\n";
        return retorno;
    }
    }
