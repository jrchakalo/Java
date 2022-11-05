public class ContaP extends Conta{
    
    public ContaP (String numero){
        super(numero);
    }
    public void renderJuros(double taxa){
        double juros = this.getSaldo() * taxa;
        this.creditar(juros);
    }
}