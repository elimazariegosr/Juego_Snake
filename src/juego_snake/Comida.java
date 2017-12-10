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
public class Comida extends Posicion{
    
    public Comida(char comida){
        setFigura(comida); 
    }
    // generar obstaculos y comida
    public void generarAleatorio(Tablero tablero, Comida comida){
        for(int i=0;i<11;i++){
            tablero.setPosicionSnake(comida,(int) (Math.random()*
            (tablero.getAncho() -1)),
            (int)(Math.random()*(tablero.getAltura()-1)));
        }
    }
}
