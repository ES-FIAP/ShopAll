package Produtos;

public class Alimento extends Produto {
	private String dataValidade;
	private String ingredientes;

	public Alimento(String nome, double preco, String descricao, int estoque, String fabricante, String dataValidade,
			String ingredientes) {
		super(nome, preco, descricao, estoque, fabricante);
		this.dataValidade = dataValidade;
		this.ingredientes = ingredientes;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String datVal) {
		this.dataValidade = datVal;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String imprimirDetalhes() {
		return "Alimento:\n" +
				"Nome: " + this.getNome() + "\n" +
				"Preço: $" + this.getPreco() + "\n" +
				"Descrição: " + this.getDescricao() + "\n" +
				"Data de Validade: " + this.dataValidade + "\n" +
				"Ingredientes: " + this.ingredientes + "\n" +
				"Ingredientes: " + this.getIngredientes() + "\n" +
				"Estoque: " + this.getEstoque() + "\n" +
				"Fabricante: " + this.getFabricante();
	}
}
