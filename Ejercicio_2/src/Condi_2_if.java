import java.util.Scanner;
public class Condi_2_if {
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = sc.nextLine();
        if (nombre.equals("luis")){
            System.out.println("Nombre correcto");
        } else {
            System.out.print("Intente de nuevo");
        }
        sc.close();
    }
}