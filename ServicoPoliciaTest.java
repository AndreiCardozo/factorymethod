package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPoliciaTest {

    @Test
    void deveExecutarPolicia() {
        IServico servico = ServicoFactory.obterServico("Policia");
        assertEquals("Entrada policia", servico.executar());
    }

    @Test
    void deveCancelarPolicia() {
        IServico servico = ServicoFactory.obterServico("Policia");
        assertEquals("Saida policia", servico.cancelar());
    }

}