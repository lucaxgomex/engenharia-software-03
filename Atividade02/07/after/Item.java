public class Item implements ItemCarrinho {
  private String nome;
  private double preco;

  public Item(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public double getPreco() {
    return this.preco;
  }
  
  @Override
  public String getNome() {
    return this.nome;
  }
}
