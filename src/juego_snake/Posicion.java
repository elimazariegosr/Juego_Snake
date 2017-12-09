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
public class Posicion {
   
    private int x,y;
    private char figura;
    
    public void setX(int nPosicion){
        this.x=nPosicion;
    }
    public int getX(){
        return x;
    }
    public void setY(int nPosicion){
        this.y=nPosicion;
    }
   
    public int getY(){
        return y;
    }
    
    public char getFigura() {
        return figura;
    }

    public void setFigura(char nFigura) {
        this.figura = nFigura;
    }
}
