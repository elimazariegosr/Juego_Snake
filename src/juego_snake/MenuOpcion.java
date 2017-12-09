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
        String nombre;
       Scanner opcion = new Scanner(System.in);
       Principal principal = new Principal();
       Marcador marcador = new Marcador();
       Juego juego = new Juego();
          boolean salir =false;
        
        while(!salir){
            System.out.println("Menu de Juego Snake");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al juego");
            System.out.println("3.Historial");
            System.out.println("4.Salir");
   
            switch(opcion.nextLine())
            {
                case "1":
                    System.out.println("-------------------------------"
                            + "-------------------------");
                    System.out.println("Ingrese Nombre");
                    nombre=opcion.nextLine();
                    if(nombre!=null){
                        juego.juego(nombre);
                       
                    }else{
                        System.out.println("Ingrese al menos una letra");
                    }
                   
                break;
                case "2":
                    System.out.println("Regresar al juego");
                break;    
                case "3":
                    System.out.println("Historial");
                break;    
                case "4":
                    salir=true;
                break;    
                default:
                System.out.println("ingrese una opcion correcta");    
            }
        }
    }
}
