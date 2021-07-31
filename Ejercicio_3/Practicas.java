public class Practicas {
    // prueba de el funcionamiento de while y el do while.
    public static void main(String[] args) throws Exception {
        int variable = 0;
        while (variable < 5) {
            System.out.println("numero while  -> " + variable);
            variable++;
        }
        do {
            System.out.println("numero  do_while es -> " + variable);
            variable++;
        } while (variable < 5);
        System.out.println("valor final  " + variable);

        // prubas para los operadores aritmeticos incrementales
        // a++
        var a = 5;
        System.out.println("valor de a: " + a++);
        var b = a++;
        System.out.println("valor de b: " + b);
        var c = a;
        System.out.println("valor de c: " + c);
        // ++a
        System.out.println("----------------------");
        var d = ++c;
        System.out.println("valor de c: " + c);
        System.out.println("valor de d: " + d);
        // C += D
        System.out.println("----------------------");
        c += d;
        System.out.println("C += D -> " + c);
        // C /= D
        System.out.println("----------------------");
        c /= d;
        // condicionales avreviados

        System.out.println("C += D -> " + c);
        var f = 4;
        var e = f == 4 ? f + 5 : 6 - f;
        System.out.println(" ------> " + e);
        e = f > 4 ? f * 7 : f + 8;
        System.out.println("-----> " + e);

    }
}
