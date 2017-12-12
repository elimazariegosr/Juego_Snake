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
    static int punteo=10;
    static int [][]guardarId;
    public Comida() {
    }
        
    
    public Comida(char comida){
        setFigura(comida);
    }
    // generar obstaculos y comida
    public void generarAleatorio(Tablero tablero, Comida comida){
        
        datoComidaX = new int[40];
        datoComidaY = new int[40];
        
        for(int i=0;i<40;i++){
            
            comidaX=(int) (Math.random()*(tablero.getAncho()-2));
            comidaY=(int)(Math.random()*(tablero.getAltura()-2));
        tablero.setPosicionSnake    
        (comida,comidaX,comidaY);
            idComida++;
            datoComidaX[idComida-1]=comidaX;
            datoComidaY[idComida-1]=comidaY;
            
            //this.punteo = punteo;   
        }
    }
    public void posicionComidaX(int x, int y,int idPosicion){
        Marcador marcador = new Marcador();
        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        
        System.out.println("id Posicion:"+idPosicion);
        /*
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 70; j++){
                 idNew++;   
                if(x==datoComidaX[i] && y==datoComidaY[j]&&idPosicion==idNew)
                {
                    System.out.println("Comiendo en la posicion: "
                    +"("+datoComidaX[i]+", "+datoComidaY[j]+ ")");
                     //juego.setMostrarPunteo(10);
                    punteo+=10;
                    
                }
            }
        } */ 
     }
    public int getPunteo(){
        return punteo;
    }
}
