
package ejercicio.pkg2.tp3;

import java.util.Scanner;


public class EJERCICIO2TP3 {

    
    public static void main(String[] args) {
        
        
        
        
        
        
//FOR


        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce un número entero: ");

        int N = scanner.nextInt();

        
            for (int i = 1; i <= N; i++) {
                System.out.println(i); 
            }

    
//WHILE

        Scanner sc = new Scanner (System.in);
        System.out.print("introduce un número entero: ");

        int P= sc.nextInt();
        int contador1= 1;
        
        
        while (contador1<= P) { 
            System.out.println("Número: " + contador1);
            contador1++; 
        }


//DO WHILE        

       Scanner sca=new Scanner (System.in);
        System.out.println("ingrese un numero entero:");
        
           int O = sca.nextInt(); 
           int contador= 1;
        do {
            System.out.println("Número: " + contador);
            contador++; 
        } while (contador<= O);  

        
        
        
        
        
    }
    
}
