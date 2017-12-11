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
    
    int idComida ;
    int comidaX;
    int comidaY;
    static int contador;
    static int [] datoComidaX;
    static int [] datoComidaY;
    
    static char [][]nuevoItem;
    public Comida() {
    }
        
    
    public Comida(char comida){
        setFigura(comida);
    }
    // generar obstaculos y comida
    public void generarAleatorio(Tablero tablero, Comida comida){
        
        datoComidaX = new int[10];
        datoComidaY = new int[10];
        for(int i=0;i<10;i++){
            comidaX=(int) (Math.random()*(tablero.getAncho() -1));
            comidaY=(int)(Math.random()*(tablero.getAltura()-1));
        tablero.setPosicionSnake    
        (comida,comidaX,comidaY);
            idComida++;
            datoComidaX[idComida-1]=comidaX;
            datoComidaY[idComida-1]=comidaY;
                
        }
    }
    public void posicionComidaX(int x, int y){
        Marcador marcador = new Marcador();
        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        for(int i = 0; i < datoComidaX.length; i++){
            for(int j = 0; j < datoComidaY.length; j++){
                if(x==datoComidaX[i] && y==datoComidaY[j])
                {
                    System.out.println("Comiendo en la posicion: "
                    +"("+datoComidaX[i]+", "+datoComidaY[j]+ ")");
                    //juego.setMostrarPunteo(10);
                }
            } 
        }  
    }
}
