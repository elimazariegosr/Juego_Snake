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
    private int idPosicion=0;

    public Tablero(){}
    public Tablero(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;
        this.tamañoMatriz = new char[this.altura][this.ancho];
    }

    
    //mostrar el tablero 
    public void mostrarTablero(){
        if(idPosicion <=2100){
                idPosicion++;
                }else if(idPosicion>2100){
                idPosicion=0;    
                }
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
                this.tamañoMatriz[i][j]=' ';
                
                
            }
        }
    }
    //limpiar posicion anteror de la serpiente
    public void limpiarPoscion(int x,int y){
        this.tamañoMatriz[y][x]=' ';  
        
    }
     public void limpiarPoscionNumeral(int x,int y){
        this.tamañoMatriz[y][x]='#';  
        
    }
    
    //getter mandandando nueva posicion
    public char getPosicionSnake(int x, int y){
        return this.tamañoMatriz[y][x];
    }
    //recibiendo nueva posicion 
    public void setPosicionSnake(Posicion pos,int x, int y){
        this.tamañoMatriz[y][x] = pos.getFigura();
        
    }
    public void setComidaPosicion(char figura,int x,int y){
            if(this.tamañoMatriz[y][x]!='#'){
             System.out.print(figura);
             agregarItemSnake(x,y);
            }

    }
    public int getAncho() {
        return this.ancho;
    }

    public int getAltura() {
        return this.altura;
    }
    public void agregarItemSnake(int x,int y){
        
        Juego juego = new Juego();
        int punteo=juego.mandarPunteo();
        if(this.tamañoMatriz[y][x]=='%'){
           punteo +=10;
           System.out.println("punteo en tablero"+punteo);
           juego.obtenerPunteo(punteo);
      }else if(this.tamañoMatriz[y][x]=='$'){
            punteo-=10;
           System.out.println("punteo en tablero"+punteo);
            juego.obtenerPunteo(punteo);
      }else if(this.tamañoMatriz[y][x]=='#'){
          limpiarPoscionNumeral(x,y);
      }       
    }

    public int getIdPosicion() {
        
        return idPosicion;
    }
}
