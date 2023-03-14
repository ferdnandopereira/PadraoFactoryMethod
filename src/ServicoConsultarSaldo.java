public abstract class ServicoConsultarSaldo implements IServico{
    @Override
    public String consultarSaldo() {
        return "Seu saldo em conta - R$: ";
    }
    @Override
    public String informacoes(){
        return "Deseja realizar outra operação ?";
    }
}
