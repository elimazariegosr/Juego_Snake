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
    private int ancho, altura;
    private char [][] tamañoMatriz;

    public Tablero(){}
    public Tablero(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;
        this.tamañoMatriz = new char[this.altura][this.ancho];
    }

    
    //mostrar el tablero 
    public void mostrarTablero(){
        for(int i = 0; i < this.altura ; i++){
            for(int j = 0; j < this.ancho ; j++){
                System.out.print(this.tamañoMatriz[i][j]);
            }
            System.out.println();
        }
    }
      //posiciones en blanco en donde pasara la culebrita
    public void tabPosicion(){
        for(int i = 0; i < this.altura ;i++){
            for(int j = 0; j < this.ancho ; j++){
                this.tamañoMatriz[i][j]='.';
            }
        }
    }
    //limpiar posicion anteror de la serpiente
    public void limpiarPoscion(int x,int y){
        this.tamañoMatriz[y][x]='.';  
        
    }
    
    //getter mandandando nueva posicion
    public char getPosicionSnake(int x, int y){
        return this.tamañoMatriz[y][x];
    }
    //recibiendo nueva posicion 
    public void setPosicionSnake(Posicion pos,int x, int y){
        this.tamañoMatriz[y][x] = pos.getFigura();
    }
    public int getAncho() {
        return this.ancho;
    }

    public int getAltura() {
        return this.altura;
    }
    public void agregarItemSnake(int x,int y){
        //this.tamañoMatriz[y][x]='%';
        Comida comida = new Comida();
        comida.posicionComidaX(x, y);
    }
}
