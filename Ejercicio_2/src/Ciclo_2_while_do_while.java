//import java.util.Scanner;
public class Ciclo_2_while_do_while {
    public static void main (String[]args) throws Exception{
 
        var num = 0;
        while(num < 100){
            System.out.println("Impresion del while : " + num);
            //num += 2; 
            num++;
            if (num  > 50){
            break;   
            }
        }
        
        do {
            
            if ((num >= 120 ) & (num <= 180)){
                System.out.println("Impresion del Do-While : " + num);   
                
            }           
            
        }while (num < 200);
      
        do {
            System.out.println("Impresion del Do-While**** : " + num);
            num++;
        }while (num < 200);
        
    }
}