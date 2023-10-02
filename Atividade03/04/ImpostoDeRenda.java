import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;
    
    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        ValidacaoImpostoDeRenda.validarCPF(cpfContribuinte);
        ValidacaoImpostoDeRenda.validarRendimentos(rendimentos);
        ValidacaoImpostoDeRenda.validarDespesas(despesas);
        
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public String getCpfContribuinte() {
        return this.cpfContribuinte;
    }
        
    public List<Double> getRendimentos() {
        return this.rendimentos;
    }     
    
    public List<Double> getDespesas() {
        return this.despesas;
    }
    
    // Execucao de validacao    
    public void processar() {
        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);
    
        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    } 
}
