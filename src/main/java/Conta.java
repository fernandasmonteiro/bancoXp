public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositarValorNaConta(double valor) {
            this.saldo += valor;
    }

    public boolean realizarSaque(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferirDinheiroEntreContas(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositarValorNaConta(valor);
        }
        return false;
    }
}
