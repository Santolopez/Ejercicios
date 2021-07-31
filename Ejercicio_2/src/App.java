import java.util.Scanner;
//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        String raya = "----------------------------------------------------------";
        Scanner sc = new Scanner (System.in );
        System.out.println("ingrese un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("El nombre es : " + nombre);
        System.out.println(raya);
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Digite su nombre :");
        String nombre1 = br.readLine();
        System.out.println("El nombre es : " + nombre1);
        System.out.println(raya);
        //var sc = new Scanner(System.in);
        System.out.println("Digite su nombre : ");
        var nombre2 = sc.nextLine();
        System.out.println("hola " + nombre2);
        sc.close();
        


    }
}
