import org.junit.jupiter.api.Test;
import org.example.IServico;
import org.example.ServicoFactory;
import static org.junit.jupiter.api.Assertions.*;

class ServicoRenovacaoTest {

    @Test
    void deveExecutarMatricula() {
        IServico servico = ServicoFactory.obterServico("Renovacao");
        assertEquals("Renovação efetuada com sucesso.", servico.executar());
    }

    @Test
    void deveCancelarMatricula() {
        IServico servico = ServicoFactory.obterServico("Renovacao");
        assertEquals("Renovação cancelada.", servico.cancelar());
    }

}
