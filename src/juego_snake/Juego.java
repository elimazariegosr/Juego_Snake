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
            static int punteoGuardado;
            static int posXGuardado=0;
            static int posYGuardado=0;
            
    public void juego(String nombrePrincipal,int posicionGx ,int posicionGy){
        
        Scanner opcion = new Scanner(System.in);
        LimitePared limite = new LimitePared('#');
    
        MuroTablero muro = new MuroTablero('#');
        AccionSnake snake = new AccionSnake('?');
        Comida comida = new Comida('%');
        Obstaculo obstaculo = new Obstaculo('$');
        Marcador marcador = new Marcador();
        Posicion posicion = new Posicion();
        
        int conteo=0;
        int ancho=70;
        int altura=35;
        
        //probando tablero
         Tablero tablero = new Tablero(ancho,altura);
        
         tablero.tabPosicion();
         //mostrar asterisco como muro
        //filas
        muro.mostrarFilaMuro(tablero, muro,0);
        muro.mostrarFilaMuro(tablero, muro, tablero.getAltura()-1);
        //Columnas
        muro.mostrarColumnaMuro(tablero, muro, 0);
        muro.mostrarColumnaMuro(tablero, muro, tablero.getAncho()-1);
        //agregar el snake aleatorio y comida 
        //validacion para volver al juego
        posXGuardado = posicionGx;
        posYGuardado = posicionGy;
        snake.fSnake(tablero, snake,1,posXGuardado,posYGuardado);
        comida.generarAleatorio(tablero, comida);
        limite.generarPared(tablero, limite);
        obstaculo.generarObstaculo(tablero, obstaculo);
        String accion;
        boolean salir =false;
        
        while(!salir){
          
            tablero.mostrarTablero();
            marcador.setNombre(nombrePrincipal);
            nombreGuardado=nombrePrincipal;
            int movimiento = marcador.getMovimientos();
            movimientosGuardado=movimiento;    
            System.out.println("");
            System.out.println("------------------------------------------"
                    + "----------------");
            System.out.println("Marcadores");
            System.out.println("Nombre: "+marcador.getNombre());
            System.out.println("Movimientos: "+movimiento);
            System.out.println("punteo: "+comida.getPunteo());
            System.out.println("------------------------------------------"
                    + "----------------");
            switch(opcion.nextLine()){
                
                case "a":
                    snake.fSnake(tablero, snake, 2,0,0);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "s":
                    snake.fSnake(tablero, snake, 3,0,0);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "d":
                    snake.fSnake(tablero, snake, 4,0,0);
                    movimiento++;
                    marcador.setMovimientos(movimiento);
                break;
                case "w":
                    snake.fSnake(tablero, snake, 5,0,0);
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
    //metodo para salir del juego con M
    public void salirJuego(){
       
        AccionSnake guardarPoSnake = new AccionSnake();
        posXGuardado=guardarPoSnake.guardarPosicionX();
        posYGuardado=guardarPoSnake.guardarPosicionY();               
        if(idJuego!=0 && nombreGuardado!=null)
        {
            MenuOpcion menu = new MenuOpcion();
            menu.opciones(idJuego, nombreGuardado, 
                    fechaNGuardado, posXGuardado, 
                    posYGuardado, movimientosGuardado, punteoGuardado);
        }
     }
   
}
