/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_snake;

/**
 *
 * @author Mazariegos
 */
public class Juego_Snake {
        
        
    public static void main(String[] args) {
        int ancho=70;
        int altura=35;

        /* MenuOpcion menu = new MenuOpcion();
         menu.opciones();*/
        //probando tablero
         Tablero tablero = new Tablero(ancho,altura);
         tablero.tabPosicion();
         //mostrar asterisco como muro
        MuroTablero muro = new MuroTablero('#');
        //filas
        muro.mostrarFilaMuro(tablero, muro,0);
        muro.mostrarFilaMuro(tablero, muro, tablero.getAltura() -1);
        //Columnas
        muro.mostrarColumnaMuro(tablero, muro, 0);
        muro.mostrarColumnaMuro(tablero, muro, tablero.getAncho() -1);
         
       tablero.mostrarTablero();
    }
    
}
