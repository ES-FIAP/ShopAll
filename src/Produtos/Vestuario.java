package Produtos;

public class Vestuario extends Produto {
	private String tamanho;
	private String cor;
	private String material;

	public Vestuario(String nome, double preco, String descricao, int estoque, String fabricante, String tamanho,
			String cor, String material) {
		super(nome, preco, descricao, estoque, fabricante);
		this.tamanho = tamanho;
		this.cor = cor;
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String imprimirDetalhes() {
		return "Produto Vestuário:\n" +
				"Nome: " + this.getNome() + "\n" +
				"Preço: $" + this.getPreco() + "\n" +
				"Descrição: " + this.getDescricao() + "\n" +
				"Tamanho: " + this.getTamanho() + "\n" +
				"Cor: " + this.getCor() + "\n" +
				"Material: " + this.getMaterial() + "\n" +
				"Estoque: " + this.getEstoque() + "\n" +
				"Fabricante: " + this.getFabricante();
	}

}
