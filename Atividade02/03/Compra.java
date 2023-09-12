public class Compra {
  private double valorCompra;
  Conta objConta = new Conta();

  public void realizarCompra() {
    if (objConta.saldo < valorCompra) {
      System.out.println("Saldo insuficiente para compra.");
    }
    System.out.println("Compra realizada com sucesso");
  }
}
