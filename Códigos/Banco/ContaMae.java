public abstract class ContaMae {
    private String numero;
    private double saldo;

    ContaMae(){
        numero = null;
        saldo = 0;
    }

    ContaMae(String numero){
        this(numero, 0.0);
    }

    ContaMae(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

    public abstract void debitar(double valor);

    public double getSaldo(){
        return saldo;
    }

    public String getNumero(){
        return numero;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    protected void setNumero(String numero){
        this.numero = numero;
    }
}
