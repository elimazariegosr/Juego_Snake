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
           static int posX ;
           static int posY ;
           
    //Constructor AccionSnake que recibe a la culebrita a donde moverse
    public AccionSnake( char figura){
        setFigura(figura);
    }
    
    public void fSnake(Tablero tablero, AccionSnake accionSnake,
            int opcion ){
        System.out.println("posX:"+posX+" posY:"+posY);
         switch(opcion){
            case 1:
                posX = (int)(Math.random()*(tablero.getAncho()-1)); 
                posY = (int)(Math.random()*(tablero.getAltura()-1));
            
                tablero.setPosicionSnake(accionSnake,posX,posY);
            break;
            //mover hacia la izquierda
            case 2:
                if(posX<69){
                    if(posX>0){
                        accionSnake.setX(posX -=1);
                        if(posX==0){
                            posX+=1;
                            System.out.println("topo en el muro"+posX);
                        }else{
                            tablero.setPosicionSnake(accionSnake, accionSnake.getX(),
                            posY);
                            tablero.limpiarPoscion(posX+1, posY);
                            tablero.agregarItemSnake(posX, posY);
                        }
                    }
                }
            break;
            //mover hacia abajo
            case 3:
                if(posY<34){
                    if(posY>0&&posY<=32){
                        accionSnake.setY(posY +=1);
                        if(posY==34){
                            posY-=1;
                        }
                        tablero.setPosicionSnake(accionSnake, posX,accionSnake.getY());
                        tablero.limpiarPoscion(posX, posY-1);
                        tablero.agregarItemSnake(posX, posY);

                    } 
                }
            break;
            //mover hacia la derecha
            case 4:
                if(posX<=68){
                    if(posX>0 &&posX<=67){
                        accionSnake.setX(posX +=1);
                        if(posX==69){
                        posX-=1;
                        }
                        tablero.setPosicionSnake(accionSnake, accionSnake.getX(), posY);
                        tablero.limpiarPoscion(posX-1, posY);
                        tablero.agregarItemSnake(posX, posY);

                    } 
                }
            break;
            //mover hacia arriba
            case 5:
                if(posY<34){
                   if(posY>=2 && posY<34){
                        accionSnake.setY(posY-=1);
                        if(posY==0){
                            posY+=1;
                        }
                        tablero.setPosicionSnake(accionSnake,posX,accionSnake.getY());
                        tablero.limpiarPoscion(posX, posY+1);
                        tablero.agregarItemSnake(posX, posY);
 
                   }
                }
            break;
                
        }
    }
}
