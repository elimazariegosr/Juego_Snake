/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_snake;

import java.util.Scanner;

/**
 *
 * @author Mazariegos
 */
public class MenuOpcion {
   
    public void opciones(){
        boolean salir =false;
        Scanner opcion = new Scanner(System.in);
    
        while(!salir){
            System.out.println("Menu de Juego Snake");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al juego");
            System.out.println("3.Historial");
            System.out.println("4.Salir");
   
            switch(opcion.nextInt())
            {
                case 1:
                    System.out.println("Jugar");
                    juego();
                break;
                case 2:
                    System.out.println("Regresar al juego");
                break;    
                case 3:
                    System.out.println("Historial");
                break;    
                case 4:
                    salir=true;
                break;    
                default:
                System.out.println("ingrese una opcion correcta");    
            }
        }
    }
    public static void juego()
    {
        Scanner text = new Scanner(System.in);
        System.out.println("Ingrese Su nombre");
        
    }
}
