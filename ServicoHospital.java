package padroescriacao.factorymethod;

public class ServicoHospital implements IServico {

    public String executar() {
        return "Entrada hospital";
    }

    public String cancelar() {
        return "Saida hospital";
    }
}
