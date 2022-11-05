public class Banco {
    private ContaMae[] contas;
    private int i;
    private double taxa;

    public Banco(){
        contas = new ContaMae[100];
        i = 0;
        taxa = 0.01;
    }

    public void cadastrarConta(ContaMae c){
        contas[i] = c;
        i += 1;
    }

    public void creditarConta(String numero, double valor){
        ContaMae c;
        c = this.procurarConta(numero);
        c.creditar(valor);
    }

    public void debitarConta(String numero, double valor){
        ContaMae c;
        c = this.procurarConta(numero);
        c.debitar(valor);
    }

    public double getSaldo(String numero){
        ContaMae c;
        c = this.procurarConta(numero);
        //System.out.println("O saldo da conta " + numero + " conta eh: " + c.getSaldo());
        return c.getSaldo();
    }

    public void transferir(String contaOri, String contaDest, double valor){
        ContaMae o = this.procurarConta(contaOri);
        ContaMae d = this.procurarConta(contaDest);

        if(o.getSaldo() < valor){
            System.out.println("Valor para transferencia indesponivel, transferindo o maxio: R$" + o.getSaldo());
            d.creditar(o.getSaldo());
            o.setSaldo(0.0);
        }else{
            o.debitar(valor);
            d.creditar(valor);
        }
    }

    public void rendeJuros(String numero){
        ContaMae p = this.procurarConta(numero);

        if(p instanceof ContaP){
            ((ContaP) p).renderJuros(taxa);
        }else{
            throw new RuntimeException("Nao eh uma conta poupanca.");
        }
    }

    public void renderEspecial(String numero){
        ContaMae e = this.procurarConta(numero);

        if(e instanceof ContaE){
            ((ContaE) e).renderBonus();
        }else{
            throw new RuntimeException("Nao eh uma conta especial.");
        }
    }

    private ContaMae procurarConta(String numero){
        int j=0;
        boolean fnd = false;
        ContaMae resp = null;

        while ((!fnd) && (j<i)){
            if(contas[j].getNumero().equals(numero)){
                fnd = true;
                resp = contas[j];
            }else{
                j += 1;
            }
        }
        if (!fnd){
            throw new RuntimeException("Conta nao encontrada");
        }
        return resp;
    }
}
