//import java.util.List;

public class RelatorioImpostoRenda {
    public void gerarRelatorio(ImpostoDeRenda imposto, double calculoImposto) {
        System.out.println("CPF: " + imposto.getCpfContribuinte());
        System.out.println("Rendimentos: " + imposto.getRendimentos());
        System.out.println("Despesas: " + imposto.getDespesas());
        
        //System.out.println("Imposto Devido: " + calcularImposto());
        System.out.println("Imposto Devido: " + calculoImposto);
    }
}
