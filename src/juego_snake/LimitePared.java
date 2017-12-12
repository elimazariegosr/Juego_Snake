/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_snake;

/**
 *
 * @author Mazariegos
1
*/
public class LimitePared extends Posicion {
    int limiteX;
    int limiteY;
    int limiteParedX;
    int limiteParedY;
    public LimitePared(char limiteF) {
        setFigura(limiteF);
    }
    
    public void generarPared(Tablero tablero, LimitePared limite){
       
        for(int i=0;i<140;i++){
             limiteParedX=(int)(Math.random()*(tablero.getAncho()-1));
            limiteParedY=(int)(Math.random()*(tablero.getAltura()-1));
            tablero.setPosicionSnake(limite, limiteParedX, limiteParedY);
        }
    }
    
}
