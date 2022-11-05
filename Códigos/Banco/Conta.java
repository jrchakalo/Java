public class Conta extends ContaMae {

    Conta(String numero, double saldo){
        super(numero, saldo);
    }

    Conta(String numero){
        super(numero);
    }

    public void debitar(double valor){
        this.setSaldo(this.getSaldo() - valor);
    }
}
