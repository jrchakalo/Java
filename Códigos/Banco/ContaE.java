public class ContaE extends Conta{
    private double bonus;

    public ContaE (String numero){
        super(numero);
        bonus = 0.0;
    }

    public double getBonus() {
        return bonus;
    }

    public void renderBonus(){
        super.creditar(bonus);
        bonus = 0.0;
    }

    public void creditar(double valor){
        super.creditar(valor);
        bonus += valor * 0.01;
    }
}
