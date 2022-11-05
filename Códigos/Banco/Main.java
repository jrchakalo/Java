public class Main {
    public static void main(String args[]){
        Conta count = new Conta("123-x", 800.0);

        count.creditar(100.0);
        count.debitar(50.0);

        System.out.println("Conta: " + count.getNumero());
        System.out.println("Saldo: " + count.getSaldo());

        Conta poupanca = new ContaP("21.342-7");

        poupanca.creditar(500.87);
        poupanca.debitar(45.00);
        System.out.println("Conta Poupanca: " + poupanca.getNumero());
        System.out.println("Saldo: " + poupanca.getSaldo());

        Banco bank = new Banco();
        bank.cadastrarConta(new Conta ("123-4"));
        bank.cadastrarConta(new ContaP ("567-8"));
        bank.creditarConta("123-4", 129.34);
        bank.transferir("123-4", "567-8", 9.34);
        System.out.println("Saldo da nova conta poupanca: " + bank.getSaldo("567-8"));
        bank.rendeJuros("567-8");
        System.out.println("Novo saldo depois da conta render eh: " + bank.getSaldo("567-8"));

        Conta contae = new ContaE("132.220-4");
        bank.cadastrarConta(contae);
        bank.creditarConta("132.220-4", 200.00);
        bank.debitarConta("132.220-4", 100.00);
        System.out.println("Saldo da conta especial antes de render: " + bank.getSaldo("132.220-4"));
        bank.renderEspecial("132.220-4");
        System.out.println("Saldo da conta especial depois de render: " + bank.getSaldo("132.220-4"));
        
        ContaI contai = new ContaI("099.234-2");
        bank.cadastrarConta(contai);
        bank.creditarConta("099.234-2", 400.00);
        System.out.println("Saldo da conta imposto antes de debitar: " + bank.getSaldo("099.234-2"));
        bank.debitarConta("099.234-2", 100.00);
        System.out.println("Saldo da conta imposto depois de debitar R$100: " + bank.getSaldo("099.234-2"));
    } 
}
