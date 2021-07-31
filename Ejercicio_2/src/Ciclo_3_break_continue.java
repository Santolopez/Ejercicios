
public class Ciclo_3_break_continue {
    public static void main (String[]args) throws Exception{
 
        var num = 0;
        while(num < 100){
            System.out.println("Impresion del while : " + num);
            num++;
            if (num  > 50){
                System.out.println("-----------------------");
            break;   
            }
        }
        
        do {
            num++;
            if ((num >= 120 ) & (num <= 180)){
                  
                continue;
            }
            System.out.println("Impresion del Do-While : " + num); 
        }while (num < 200);
      
        
    }
}