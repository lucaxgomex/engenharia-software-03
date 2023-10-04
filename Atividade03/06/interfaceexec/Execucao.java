package interfaceexec;

import java.util.List;

public interface Execucao<T> {
    public void executar(List<T> auditaveis);
}
