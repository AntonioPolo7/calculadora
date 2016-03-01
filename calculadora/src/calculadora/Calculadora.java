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
     private static int Menu(){
    Scanner leer=new Scanner (System.in);
    System.out.println("*****MENU*****");
    System.out.println("1.SUMAR");
    System.out.println("2.RESTAR");
    System.out.println("3.MULTIPLICAR");
    System.out.println("4.DIVISION");
    System.out.println("5.TANTO POR CIENTO(%)");
    System.out.println("6.SALIR");
    System.out.println("**************");
    int seleccion=leer.nextInt();
    return seleccion;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         int seleccion=0;
      while(seleccion!=6){
      switch(seleccion=Menu()){
           case 1:
               
           case 2:
               
           case 3:
               
           case 4:
               
           case 5:    
               
    
    
      }
      }
    }
    
}
