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
public class LimitePared extends Posicion {
    int limiteX;
    int limiteY;
    public LimitePared(char limiteF) {
        setFigura(limiteF);
    }
    
    public void generarPared(Tablero tablero, LimitePared limite){
        for(int i = 0; i < 40;i++){
            limiteX=(int)(Math.random()*(tablero.getAncho()-2));
            limiteY=(int)(Math.random()*(tablero.getAltura()-2));
            tablero.setPosicionSnake(limite, limiteX, limiteY);
        }
    }
}
