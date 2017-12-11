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
public class Obstaculo extends Posicion {
    
    int limiteX;
    int limiteY;
    public Obstaculo(char obstaculo) {
        setFigura(obstaculo);
    }
    
    public void generarObstaculo(Tablero tablero, Posicion posicion){
        for(int i = 0; i < 40;i++){
            limiteX=(int)(Math.random()*(tablero.getAncho()-1));
            limiteY=(int)(Math.random()*(tablero.getAltura()-1));
            tablero.setPosicionSnake(posicion, limiteX, limiteY);
        }
    }
}
