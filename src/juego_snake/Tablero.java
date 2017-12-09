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
public class Tablero {
    private int base, altura;
    private char [][] tamañoMatriz;

    public Tablero(){}
    public Tablero(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.tamañoMatriz = new char[this.altura][this.base];
    }

    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char[][] getTamañoMatriz() {
        return tamañoMatriz;
    }

    public void setTamañoMatriz(char[][] tamañoMatriz) {
        this.tamañoMatriz = tamañoMatriz;
    }
    //getter mandandando nueva posicion
    public char getPosicionSnake(int x, int y){
        return this.tamañoMatriz[x][y];
    }
    //recibiendo nueva posicion 
    public void setPosicionSnake(Posicion pos,int x, int y){
        this.tamañoMatriz[x][y] = pos.getFigura();
    }
    //posiciones en blanco en donde pasara la culebrita
    public void tabPosicion(){
        for(int i =0; i < this.altura ;i++){
            for(int j=0; j< this.base ; j++){
                this.tamañoMatriz[i][j]=' ';
            }
        }
    }
    //mostrar el tablero 
    public void mostrarTablero(){
        for(int i =0; i < this.altura ;i++){
            for(int j=0; j< this.base ; j++){
                System.out.print(this.tamañoMatriz[i][j]);
            }
            System.out.println();
        }
    }
    
}
