public class ContaI extends ContaMae{
    private static final double IMPOSTO = 0.001;

    public ContaI(String numero){
        super(numero);
    }

    public void debitar(double valor){
        double taxa;

        taxa = valor * IMPOSTO;
        this.setSaldo(this.getSaldo() - (valor+taxa));
    }
}
