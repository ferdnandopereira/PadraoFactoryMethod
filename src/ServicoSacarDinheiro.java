public abstract class ServicoSacarDinheiro implements IServico{
    @Override
    public String sacarDinheiro() {
        return "Saque realizado com sucesso, retire seu dinheiro.";
    }
    @Override
    public String informacoes(){
        return "Deseja realizar outra operação ?";
    }
}
