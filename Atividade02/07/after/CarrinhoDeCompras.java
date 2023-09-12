import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCarrinho item) {
        this.itens.add(item);
    }

    public void removerItem(ItemCarrinho item) {
        this.itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo:");
        for (ItemCarrinho item : itens) {
            System.out.println(item.getNome() + ": R$" + item.getPreco());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}

