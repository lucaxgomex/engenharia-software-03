public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Item item1 = new Item("Produto 1", 10.0);
        Item item2 = new Item("Produto 2", 20.0);

        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        carrinho.imprimirRecibo();
    }
}

