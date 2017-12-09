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
        int base=70;
        int altura=35;

        /* MenuOpcion menu = new MenuOpcion();
         menu.opciones();*/
        //probando tablero
         Tablero tablero = new Tablero(base,altura);
         tablero.tabPosicion();
         //mostrar asterisco como muro
    }
    
}
