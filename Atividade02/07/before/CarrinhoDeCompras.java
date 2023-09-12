import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo:");
        for (Item item : itens) {
            System.out.println(item.getNome() + ": R$" + item.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}

