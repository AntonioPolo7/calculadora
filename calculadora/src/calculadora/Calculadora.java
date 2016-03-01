/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Profesor
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
     
    private static void mensaje(){
        System.out.println ("Trabajamos aquí");
    }
    private static void Porcentage(){
     Scanner leer = new Scanner(System.in);
    double porcen;
    double num, total;
    System.out.println("Introduce un porcentage");
        porcen = leer.nextInt();
    System.out.println("Introduce un numero para calcular el porcentage");
    
        num = leer.nextInt();
    
        total = (porcen * num)/100;
    
    System.out.println("El numero es: "+total);
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
