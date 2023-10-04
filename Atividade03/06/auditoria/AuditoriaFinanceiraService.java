package auditoria;

import root.*;
import java.util.List;
import java.util.ArrayList;

public class AuditoriaFinanceiraService {
    private List<ContaCorrente> contas; 
    private List<Investimento> investimentos; 
    private List<Transacao> transacoes;
    
    ArrayList<Object> arr = new ArrayList<Object>();

    public AuditoriaFinanceiraService() {
        arr.add(contas);
        arr.add(investimentos);
        arr.add(transacoes);
    }
}
