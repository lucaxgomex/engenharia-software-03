public class Pedido {
  private boolean valorPago;

  public void processarPedido() {
    if (this.valorPago) {
      // Processamento do pedido
    }
    System.out.println("Ainda nao foi registrado um valor de comprar.");
  }
  
  public void pagar() {
    this.valorPago = true;
  }
}
