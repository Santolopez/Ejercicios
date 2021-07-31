//import java.util.Scanner;
public class Ciclo_1_for {
    public static void main (String[]args) throws Exception{
 /*
        for (int i = 0; i<= 100; i++){
          System.out.println("numero es : " + i);
       }
*/
       var num = 0;
       while(num < 100){
            System.out.println("Impresion del while : " + num);
            //num += 2; 
            num++;
       }

       do {
           System.out.println("Impresion del Do-While : " + num);
           num++;

       }while (num < 200);
    }
}