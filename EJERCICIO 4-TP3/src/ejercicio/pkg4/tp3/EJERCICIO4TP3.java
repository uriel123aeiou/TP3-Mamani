
package ejercicio.pkg4.tp3;

import java.util.Scanner;


public class EJERCICIO4TP3 {

  
    public static void main(String[] args) {
     
        
        
        
           Scanner scanner = new Scanner(System.in); 

        int numero1;
        int numero2;

        do{
            System.out.print("ingrese el primer numero: ");
            numero1 = scanner.nextInt(); 

            System.out.print("Ingrese el segundo numero: ");
            numero2 = scanner.nextInt();

            if ( numero1 == numero2 ) {

                System.out.println("Los numeros son iguales, ingrese los numeros nuevamente");
            } 
        }
        while(numero1 == numero2);




        while (numero1 <= numero2) {
            System.out.println(numero1 );
            numero1++;                  
        }

        
        
        
        
    }
    
}
