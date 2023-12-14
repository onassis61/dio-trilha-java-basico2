public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

       
        String meuNome = "Nome e Sobrenome";

            System.out.println(meuNome);

        int numero = 5;
        int numero2 = 10;
        int numero3 = 19;
        System.out.print(numero + numero2 * numero3);

        //Adicionando final o valor da variavel nao pode ser alterada
        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 10.75;

        //Revisar tipos primitivos e classe String que representa texto.
    }
}


