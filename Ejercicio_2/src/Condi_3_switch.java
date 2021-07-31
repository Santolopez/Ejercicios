import java.util.Scanner;
public class Condi_3_switch {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = sc.nextLine();
        System.out.println("Digite Sexo (f) / (m)");
        String sexo = sc.nextLine();
        
        if (nombre.equals("luis")){
            System.out.println("Nombre correcto");
        } else if(nombre != "lui"){
            System.out.println("son diferentes");
        } else  {
            System.out.println("No correcto");
        } 
        switch (sexo) {
            case "f":
            // operacion
                System.out.println("Eres mujer"); 
                break;
            case "m": 
            // operacion
                System.out.println("Eres hombre");
                break;
            default:
                // operacion
                System.out.println("Opcion Invalida");
                break;
        }
        sc.close();
    }
}
