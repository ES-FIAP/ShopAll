package Produtos;

public class Bebida extends Produto {
	private String dataValidade;
	private String ingredientes;
	private Boolean Alcoolica;
	private Double volume;

	public Bebida(String nome, double preco, String descricao, int estoque, String fabricante, String dataValidade,
			String ingredientes, boolean alcoolica, double volume) {
		super(nome, preco, descricao, estoque, fabricante);
		this.Alcoolica = alcoolica;
		this.volume = volume;
		this.dataValidade = dataValidade;
		this.ingredientes = ingredientes;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDatVali(String DataValidade) {
		this.dataValidade = DataValidade;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Boolean getAlcoolica() {
		return Alcoolica;
	}

	public void setAlcoolica(Boolean Alcoolica) {
		this.Alcoolica = Alcoolica;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String imprimirDetalhes() {
		return "Bebida:\n" +
				"Nome: " + this.getNome() + "\n" +
				"Preço: $" + this.getPreco() + "\n" +
				"Descrição: " + this.getDescricao() + "\n" +
				"Data de Validade: " + this.dataValidade + "\n" +
				"Ingredientes: " + this.ingredientes + "\n" +
				"Alcoólica: " + this.getAlcoolica() + "\n" +
				"Volume: " + this.volume + " ml" + "\n" +
				"Estoque: " + this.getEstoque() + "\n" +
				"Fabricante: " + this.getFabricante();

	}

}
