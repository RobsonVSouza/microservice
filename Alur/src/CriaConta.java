public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = -200;
        primeiraConta.agencia = 24;
        primeiraConta.numero = 343434;
        primeiraConta.titular ="Robson";

        Conta segundaConta = new Conta();
        segundaConta.saldo = 200;

        System.out.println("Titular: " + primeiraConta.titular);
        System.out.println("Agencia: " + primeiraConta.agencia);
        System.out.println("Numero: " +primeiraConta.numero);
        System.out.println("Saldo: " + primeiraConta.saldo);

    }
}
