package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMecanicaTest {

    @Test
    void deveExecutarMecanica() {
        IServico servico = ServicoFactory.obterServico("Mecanica");
        assertEquals("Entrada mecanica", servico.executar());
    }

    @Test
    void deveCancelarMecanica() {
        IServico servico = ServicoFactory.obterServico("Mecanica");
        assertEquals("Saida mecanica", servico.cancelar());
    }

}