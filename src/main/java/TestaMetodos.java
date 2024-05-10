public class TestaMetodos {
    public static void main(String[] args) {
         Conta contaDaLia = new Conta();

         //O cliente está sendo instanciado a uma conta, ou seja, o objeto Cliente está sendo associado a uma conta específica.
         contaDaLia.titular = new Cliente();

         contaDaLia.titular.nome = "Marcela"; //aqui está sendo atribuído o nome do cliente (titular da conta).
         contaDaLia.titular.cpf = "000001000200";
         contaDaLia.titular.profissao = "Jornalista";
        System.out.println(contaDaLia.titular);
        System.out.println(contaDaLia.titular.nome);
        System.out.println(contaDaLia.titular.cpf);
        System.out.println(contaDaLia.titular.profissao);

        Conta contaDoPedro = new Conta();
        contaDoPedro.titular = new Cliente();

        contaDoPedro.titular.nome = "Pedro";
        contaDoPedro.titular.cpf = "11144477785";
        contaDoPedro.titular.profissao = "Estagiário";
        System.out.println(contaDoPedro.titular.nome);
    }


}
