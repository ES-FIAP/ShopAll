package Produtos;

public class Eletronico extends Produto {
    private String modelo;

    public Eletronico(String nome, double preco, String descricao, int estoque, String fabricante, String modelo) {
        super(nome, preco, descricao, estoque, fabricante);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String imprimirDetalhes() {
        return "Produto Eletrônico:\n" +
                "Nome: " + this.getNome() + "\n" +
                "Preço: $" + this.getPreco() + "\n" +
                "Descrição: " + this.getDescricao() + "\n" +
                "Modelo: " + this.getModelo() + "\n" +
                "Estoque: " + this.getEstoque() + "\n" +
                "Fabricante: " + this.getFabricante();
    }
}
