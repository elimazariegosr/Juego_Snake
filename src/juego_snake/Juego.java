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
            static int punteo = 10;
            static int  idJuego;
            static String  nombreGuardado;
            static String fechaNGuardado;
            static int movimientosGuardado;
            static String punteoGuardado;
            static int posXGuardado;
            static int posYGuardado;
            
            
    public void juego(String nombrePrincipal){
        
        Scanner opcion = new Scanner(System.in);
        MuroTablero muro = new MuroTablero('#');
        AccionSnake snake = new AccionSnake('?');
        Comida comida = new Comida('%');
        Marcador marcador = new Marcador();
        Posicion posicion = new Posicion();
        if(nombrePrincipal!=null){
            marcador.setNombre(nombrePrincipal);
            nombreGuardado=nombrePrincipal;
            fechaNGuardado="1999";
            
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
        snake.fSnake(tablero, snake,1);
        comida.generarAleatorio(tablero, comida);
        String accion;
        boolean salir =false;
        
        while(!salir){
          
            tablero.mostrarTablero();
            int movimiento = marcador.getMovimientos();
            movimientosGuardado=movimiento;    
            System.out.println("");
            System.out.println("------------------------------------------"
                    + "----------------");
            System.out.println("Marcadores");
            System.out.println("Nombre: "+marcador.getNombre());
            System.out.println("Movimientos: "+movimiento);
            System.out.println("punteo: "+marcador.getPunteo());
            System.out.println("------------------------------------------"
                    + "----------------");
            switch(opcion.nextLine()){
                
                case "a":
                    snake.fSnake(tablero, snake, 2);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "s":
                    snake.fSnake(tablero, snake, 3);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "d":
                    snake.fSnake(tablero, snake, 4);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "w":
                    snake.fSnake(tablero, snake, 5);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "m":
                   idJuego++;
                   salirJuego();
                break;
                default:
                System.out.println("Ingrese opcion correcta");
            
            }
        }
    }
    public void salirJuego(){
        MenuOpcion menuOpcion = new MenuOpcion();
        AccionSnake guardarPoSnake = new AccionSnake();
        posXGuardado=guardarPoSnake.guardarPosicionX();
        posYGuardado=guardarPoSnake.guardarPosicionY();               
        /*System.out.println("id Juego:"+idJuego+"| Nombre:" +nombreGuardado+
                "| Fecha:"+fechaNGuardado+"| PosX:"+posXGuardado+
                "| PosY:"+posYGuardado+"| Movimientos: "+movimientosGuardado+
                "| Punteo:"+punteo);*/
       //Mandar datos para historial y cargar Juego
        menuOpcion.opciones(idJuego, nombreGuardado, fechaNGuardado,
                posXGuardado, posYGuardado, movimientosGuardado, punteo);
    
    }
}
