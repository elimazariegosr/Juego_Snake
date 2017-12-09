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
public class MuroTablero extends Posicion {
    
    public MuroTablero(){
        setFigura('#');
    }
    public MuroTablero(char figura){
        setFigura(figura);
    }
    public void mostrarFilaMuro(Tablero tablero, MuroTablero muro, int nFila){
        for(int i = 0; i < tablero.getAncho();i++){
            tablero.setPosicionSnake(muro, i, nFila);
        }    
    }
    
    public void mostrarColumnaMuro(Tablero tablero, MuroTablero muro, int nColumna){
        for(int i = 0; i < tablero.getAltura();i++){
            tablero.setPosicionSnake(muro, nColumna, i);
        }    
    }
}
