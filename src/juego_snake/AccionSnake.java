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
            int posX ;
            int posY ;

    //Constructor AccionSnake que recibe a la culebrita a donde moverse
    public AccionSnake( char figura){
        setFigura(figura);
    }
    
    public void agregarSnakeAleatorio(Tablero tablero, AccionSnake accionSnake){
        posX = (int)(Math.random()*(tablero.getAncho()-1)); 
        posY = (int)(Math.random()*(tablero.getAltura()-1));
        tablero.setPosicionSnake(accionSnake,posX,posY);
        System.out.println("posX:"+posX+" posY:"+posY);
    }
    public void guardarPartida(){
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
