package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoHospitalTest {

    @Test
    void deveExecutarHospital() {
        IServico servico = ServicoFactory.obterServico("Hospital");
        assertEquals("Entrada hospital", servico.executar());
    }

    @Test
    void deveCancelarHospital() {
        IServico servico = ServicoFactory.obterServico("Hospital");
        assertEquals("Saida hospital", servico.cancelar());
    }

}