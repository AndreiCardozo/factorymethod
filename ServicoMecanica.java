package padroescriacao.factorymethod;

public class ServicoMecanica implements IServico {

    public String executar() {
        return "Entrada mecanica";
    }

    public String cancelar() {
        return "Saida mecanica";
    }
}
