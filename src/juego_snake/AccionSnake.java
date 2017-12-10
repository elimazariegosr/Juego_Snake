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
    
    public void fSnake(Tablero tablero, AccionSnake accionSnake,
            int opcion ){
        if(opcion==1){
            posX = (int)(Math.random()*(tablero.getAncho()-1)); 
            posY = (int)(Math.random()*(tablero.getAltura()-1));
            
            tablero.setPosicionSnake(accionSnake,posX,posY);
            System.out.println("posX:"+posX+" posY:"+posY);
        }else if(opcion==2){
            //mover izquierda
            accionSnake.setX(posX -=1);
            tablero.setPosicionSnake(accionSnake, accionSnake.getX(),
                    posY);
            
        }else if(opcion==3){
            //mover abajo
            accionSnake.setY(posY +=1);
            tablero.setPosicionSnake(accionSnake, posX,accionSnake.getY());
        }else if(opcion==4){
            //mover derecha
            accionSnake.setX(posX +=1);
            tablero.setPosicionSnake(accionSnake, accionSnake.getX(), posY);
        }else if(opcion==5){
            //mover arriba
            accionSnake.setY(posY-=1);
            tablero.setPosicionSnake(accionSnake,posX,accionSnake.getY());
        }
        
    }
  
}
