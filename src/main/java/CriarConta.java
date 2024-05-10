public class CriarConta {
    public static void main(String[] args) {

        Conta contaDoJoao= new Conta();

        contaDoJoao.depositarValorNaConta(500.00);
        System.out.println(contaDoJoao.saldo);

        contaDoJoao.depositarValorNaConta(100.00);
        System.out.println(contaDoJoao.saldo);

        Conta contaDaMaria = new Conta();
        contaDaMaria.depositarValorNaConta(100);
        System.out.println(contaDaMaria.saldo);

        System.out.println("Saldo antes do saque: " + contaDoJoao.saldo);
        contaDoJoao.realizarSaque(50.00);
        System.out.println("Saldo após o saque: " + contaDoJoao.saldo);

        contaDoJoao.transferirDinheiroEntreContas(100, contaDaMaria);
        System.out.println("Transferência realizada com sucesso " + "Saldo atual: " + contaDoJoao.saldo);
    }
}
