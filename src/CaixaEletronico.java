public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 1000.0;

        System.out.println("saldo atual e de:" + saldo);

        double valorSolicitado = 500.0;

        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;

            System.out.println("Saque realizado com sucesso!" + saldo);
        }
    }

}
