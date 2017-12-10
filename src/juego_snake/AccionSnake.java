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
        System.out.println("posX:"+posX+" posY:"+posY);
        if(opcion==1){
            posX = (int)(Math.random()*(tablero.getAncho()-1)); 
            posY = (int)(Math.random()*(tablero.getAltura()-1));
            
            tablero.setPosicionSnake(accionSnake,posX,posY);
            
        }else if(opcion==2){
            //mover izquierda
            if(posX<=68){
                if(posX>=2){
                    accionSnake.setX(posX -=1);
                    tablero.setPosicionSnake(accionSnake, accionSnake.getX(),
                    posY);  
                }
            }else{
                 System.out.println("ha topado contra el muro"+posX);
            }
        }else if(opcion==3){
            //mover abajo
            if(posY<=33){
                if(posY>=2){
                accionSnake.setY(posY +=1);
                tablero.setPosicionSnake(accionSnake, posX,accionSnake.getY());
                } 
            }else{
                 System.out.println("ha topado contra el muro"+posY);
            }
        }else if(opcion==4){
            //mover derecha
            if(posX<=68){
               if(posX>=2){
                   
                accionSnake.setX(posX +=1);
                tablero.setPosicionSnake(accionSnake, accionSnake.getX(), posY);
               } 
            }else{
                System.out.println("ha topado contra el muro"+posX);  
            }
        }else if(opcion==5){
            //mover arriba
            if(posY<=33){
                if(posY>=2){
                    accionSnake.setY(posY-=1);
                    tablero.setPosicionSnake(accionSnake,posX,accionSnake.getY());
                }else{
                    System.out.println("ha topado contra el muro"+posY);
                }
                 
            }
        }
        
    }
  
}
