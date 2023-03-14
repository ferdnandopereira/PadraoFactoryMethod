public class ServicoFactoryCaixaEletronico {

    public static IServico obterServico(String servico){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("null" + servico);
            objeto = classe.newInstance();
        } catch(Exception op) { //op = operacao
            throw new IllegalArgumentException("Serviço Inoperante.");
        }
        if(!(objeto instanceof IServico)){
            throw new IllegalArgumentException("Serviço Inválido.");
        }
        return(IServico) objeto;
    }
}
