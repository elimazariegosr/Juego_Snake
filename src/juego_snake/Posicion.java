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
    protected int x,y;
    protected char figura;
    
    public Posicion(){}
    
    public Posicion(int x, int y, char figura){
        this.x=x;
        this.y=y;
        this.figura=figura;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){return x;}
    
    public void setY(int y){
        this.y=y;
    }
    public int getY(){return y;}

    public char getFigura() {
        return figura;
    }

    public void setFigura(char figura) {
        this.figura = figura;
    }
    
    @Override
    public String toString() {
        return "Posicion{" + "x=" + x + ", y=" + y + ", figura=" + figura + '}';
    }
    
}
