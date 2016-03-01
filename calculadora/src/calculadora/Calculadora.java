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
     
     public static void Restar()
    {
    Scanner leer=new Scanner (System.in);    
    System.out.println("Primer numero");
    int num1=leer.nextInt();
    System.out.println("Segundo numero");
    int num2=leer.nextInt();
    
    System.out.println("La resta de "+num1+" con "+num2+" es: "+(num1-num2));
    
    }  
    
    private static void mensaje(){
        System.out.println ("Trabajamos aquí");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
