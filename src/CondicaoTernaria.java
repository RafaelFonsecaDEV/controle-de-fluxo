public class CondicaoTernaria {

    public static void main(String[] args) {
        int nota = 6;

        System.out.println("nota do aluno e de:" + nota);
        String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperaçao" : "reprovado";

        System.out.println(resultado);
    }

}
