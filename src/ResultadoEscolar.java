public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 6;
        System.out.println("nota do aluno e de:" + nota);
        if (nota >= 7) {
            System.out.println("aprovado");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("recuperaçao");

        } else {
            System.out.println("reprovado");

        }

    }
}