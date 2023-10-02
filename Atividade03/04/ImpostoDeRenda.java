import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;
    private ValidacaoImpostoRenda validacoes;
    
    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas, ValidacaoImpostoRenda validacoes) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
        this.validacoes = validacoes;
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
        validacoes.validarCpf(cpfContribuinte);
        validacoes.validar(rendimentos);
        validacoes.validar(despesas);
    
        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);
    
        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    } 
}
