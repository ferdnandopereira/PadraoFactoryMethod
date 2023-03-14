public abstract class ServicoMovimentarValores implements IServico{
    @Override
    public String realizarMovimentacao() {
        return "Operação realizada com Sucesso.";
    }

    @Override
    public String consultarSaldo() {
        return "Seu saldo após a movimentação é de, R$: " + consultarSaldo();
    }

    @Override
    public String informacoes(){
        return "Deseja realizar outra operação ?";
    }
}
