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
public class AccionSnake extends Posicion {
    
    //Constructor AccionSnake que recibe a la culebrita a donde moverse
    public AccionSnake(int x, int y, char figura){
        setX(x);
        setY(y);
        setFigura(figura);
    }
    public void arriba(){
    }
    public void abajo(){
    }
    public void izquierda(){
    }
    public void derecha(){
    }
}
