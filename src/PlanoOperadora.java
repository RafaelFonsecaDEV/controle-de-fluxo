public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "T";

        if (plano == "B") {
            System.out.println("basico" + "100 minutos de ligaçao gratis" + "50 sms gratis");
        } else if (plano == "M") {
            System.out.println("medio" + " 200 minutos de ligaçao gratis" + "100 giga de internet");
        } else if (plano == "T") {
            System.out.println("top" + "500 minutos de ligaçao gratis" + "200 giga de internet");

        } else {
            System.out.println("plano nao identificado");
        }
    }
}
