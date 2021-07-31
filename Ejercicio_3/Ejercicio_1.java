import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {
        var raya = "-----------------------------------------";
        var sc = new Scanner(System.in);
        System.out.println("Digine numero");
        var num = sc.nextInt();
        var dou = 2 * num;
        var tri = 3 * num;
        System.out.println("doble del numero : " + dou);
        System.out.println("triple del numero : " + tri);

        System.out.println(raya);

        System.out.println("Digite grados centigrados");
        var gradosC = sc.nextInt();
        var respuesta = tempe(gradosC);
        System.out.println("En grados farengeith es : " + respuesta);

        System.out.println(raya);

        System.out.println("digite numero a evavualr par / impar");
        var num1 = sc.nextInt();
        var respuesta2 = parimpar(num1);
        System.out.println("El numero es " + respuesta2);

        sc.close();
    }

    public static int tempe(int gradosC) {
        var gradosF = 32 + ((9 * gradosC) / 5);
        // saber el tipo de variable si es int
        System.out.println(((Object) gradosF).getClass().getSimpleName());
        return gradosF;
    }

    public static String parimpar(int num1) {
        var sol = num1 % 2 == 0 ? "Par" : "Impar";
        // saber el tipo de variable si es string
        System.out.println(sol.getClass().getSimpleName());
        return sol;
    }

}
