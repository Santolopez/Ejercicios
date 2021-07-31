import java.util.Scanner;

public class Funciones_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero entero :");
        int digito = sc.nextInt();

        var resultado = numdigito(digito);
        System.out.println("El numero tiene " + resultado + " cifras");
        sc.close();
    }

    public static int numdigito(int digito) {
        var cifras = 0;
        /*
         * bloque de codigo remplazado con la sintaxis (?:) if (digito == 0) { cifras =
         * 1; }
         */
        // cifras = digito == 0 ? 1 : 0;
        while (digito != 0) {
            digito /= 10;
            cifras++;
            System.out.println("digito / 10 -->" + digito);
        }
        // return cifras;tambien--->
        return cifras == 0 ? 1 : 0;
    }

}
