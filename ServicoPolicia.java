package padroescriacao.factorymethod;

public class ServicoPolicia implements IServico {

    public String executar() {
        return "Entrada policia";
    }

    public String cancelar() {
        return "Saida policia";
    }
}
