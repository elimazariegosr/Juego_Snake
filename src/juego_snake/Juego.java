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
public class Juego {
 
    
    public void juego(String nombrePrincipal){
        Scanner opcion = new Scanner(System.in);
        MuroTablero muro = new MuroTablero('#');
        AccionSnake snake = new AccionSnake('%');
        Comida comida = new Comida('%','#','$');
        Marcador marcador = new Marcador();
        
        if(nombrePrincipal!=null){
            marcador.setNombre(nombrePrincipal);
        }else{
            System.out.println("No existe un nombre");
        }
        
        int conteo=0;
        int ancho=70;
        int altura=35;

        //probando tablero
         Tablero tablero = new Tablero(ancho,altura);
         
         
         tablero.tabPosicion();
         //mostrar asterisco como muro
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
        boolean salir =false;
        
        while(!salir){
          
            tablero.mostrarTablero();
            int movimiento = marcador.getMovimientos();
                
            System.out.println("");
            System.out.println("------------------------------------------"
                    + "----------------");
            System.out.println("Marcadores");
            System.out.println( marcador.toString());
            System.out.println("------------------------------------------"
                    + "----------------");
            switch(opcion.nextLine()){
                
                case "a":
                    System.out.println("Presionado");
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "s":
                    System.out.println("Presionado1");
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "d":
                    System.out.println("Presionado2");
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "w":
                    System.out.println("Presionado3");
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "m":
                    System.out.println("Presionad4");
                break;
                default:
                System.out.println("Ingrese opcion correcta");
            
            }
        }
    }
}
