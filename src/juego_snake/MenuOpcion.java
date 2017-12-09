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
   
       static Scanner opcion = new Scanner(System.in);
       static boolean salir =false;
    public void opciones(){
        Juego_Snake juego = new Juego_Snake();
        
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
    public static void juego(){
        int ancho=70;
        int altura=35;

        //probando tablero
         Tablero tablero = new Tablero(ancho,altura);
         
         
         tablero.tabPosicion();
         //mostrar asterisco como muro
        MuroTablero muro = new MuroTablero('#');
        AccionSnake snake = new AccionSnake('%');
        Comida comida = new Comida('%','#','$');
        
        //filas
        muro.mostrarFilaMuro(tablero, muro,0);
        muro.mostrarFilaMuro(tablero, muro, tablero.getAltura() -1);
        //Columnas
        muro.mostrarColumnaMuro(tablero, muro, 0);
        muro.mostrarColumnaMuro(tablero, muro, tablero.getAncho() -1);
        //agregar el snake aleatorio y comida 
        snake.agregarSnakeAleatorio(tablero, snake);
        comida.generarAleatorio(tablero, comida);
        String accion;
            
        while(!salir){
            
            tablero.mostrarTablero();
            accion = opcion.nextLine();
            switch(accion){
                case "a":
                break;
                case "s":
                break;
                case "d":
                break;
                case "w":
                break;
                case "m":
                break;
                default:
                System.out.println("Ingrese opcion correcta");
            }
            System.out.println("/n");
            System.out.println("------------------------------------------"
                    + "----------------");
        }
    }
}
