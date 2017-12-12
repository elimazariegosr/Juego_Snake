/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_snake;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mazariegos
 */
public class MenuOpcion {
       static int [] arregloX,arregloY,arregloId,arregloMovimiento,
               arregloPunteo;
      
       static String [] arregloNombre,arregloFecha;
       boolean desicion = true;
    
    public void opciones(int idGuardada,String nombreGuardado,String fechaGuardada,
            int posXGuardada,int posYGuardada,int movGuardado,int punteoGuardado) throws Exception{
            
        if(idGuardada!=0 && nombreGuardado!=null)
        {
            System.out.println("El id es:"+idGuardada);
            //guardar Usuario
            arregloId=new int[idGuardada];
            arregloX=new int[idGuardada];
            arregloY=new int[idGuardada];
            arregloMovimiento=new int[idGuardada];
            arregloPunteo=new int[idGuardada];
            arregloNombre=new String[idGuardada];
            arregloFecha=new String[idGuardada];
            arregloId[idGuardada-1]=idGuardada;
            arregloNombre[idGuardada-1]=nombreGuardado;
            arregloFecha[idGuardada-1]=fechaGuardada;
            arregloMovimiento[idGuardada-1]=movGuardado;
             arregloPunteo[idGuardada-1]=punteoGuardado;
             //Guardar matrix
            arregloX[idGuardada-1]=posXGuardada;
            arregloY[idGuardada-1]=posYGuardada;
           
        }
        String nombre;
        String dia;
        String mes;
        String anio;
       Scanner opcion = new Scanner(System.in);
       Principal principal = new Principal();
       Marcador marcador = new Marcador();
       Juego juego = new Juego();
          boolean salir =false;
        
        while(!salir){
            System.out.println("Menu de Juego Snake");
            System.out.println("1.Jugar");
            System.out.println("2.Regresar al juego");
            System.out.println("3.Historial");
            System.out.println("4.Salir");
   
            switch(opcion.nextLine())
            {
                case "1":
                    System.out.println("-------------------------------"
                            + "-------------------------");
                    System.out.println("Ingrese Nombre");
                    nombre=opcion.nextLine();
                    System.out.println("Fecha Nacimiento");
                    System.out.println();
                    System.out.println("ingrese Dia");
                    dia=opcion.nextLine();
                    
                    System.out.println("ingrese Mes ");
                    mes=opcion.nextLine();
                    System.out.println("ingrese anio");
                    anio=opcion.nextLine();
                    String fecha = dia+"/"+mes+"/"+anio;
                    try{
                        if(Integer.valueOf(mes)>12 || Integer.valueOf(dia)>31){
                            System.out.println("Digito incorrecto > 31 o >12");
                        }else{
                            if(nombre!=null && desicion==true){
                                juego.juego(nombre,fecha,0,0);
                                desicion=false;
                            }else{
                                System.out.println("Ingrese al menos una letra");
                            }
                        }    
                    }catch(NumberFormatException nfe){
                        System.out.println("Debe ingresar Numeros ");
                    }
                    
                    
                   
                break;
                case "2":
                    System.out.println("-------------------------------"
                            + "-------------------------");
                    System.out.println("Ingrese Nombre");
                    String newNombre;
                    newNombre=opcion.nextLine();
                    if(arregloNombre!=null){
                        System.out.println("Nombre:"+arregloNombre[idGuardada-1]);
                        String arNombre=arregloNombre[idGuardada-1];
                        if(newNombre == null ? arNombre == null :
                                newNombre.equals(arNombre)){
                            salir=true;
                            
                        }
                    }else{
                        System.out.println("No hay registro");
                    }
                break;        
                case "3":
                    System.out.println("Historial");
                    historial();
                break;    
                case "4":
                    
                    break;
                        
                default:
                System.out.println("ingrese una opcion correcta");    
            }
        }
    }
     //metodo para mostrar el historial
    public void historial(){
        if(arregloId==null){
        
        }else{
            System.out.println("Bienvenido Al Historial del Juego");
            System.out.println("----------------------------------------------");
            System.out.println("Id   | Nombre  | Fecha  | Punteo  | Movimientos  ");
            for(int i=0;i<arregloId.length;i++){
                System.out.println(arregloId[i]+"    |  "+arregloNombre[i]
                        +"   |   "+arregloFecha[i]+"   |   "+arregloPunteo[i]
                        +"   |   "+arregloMovimiento[i]);
            }
           
        }
    }
    public void salir(int status){
        if(arregloId==null){
            
        }else{
           status+=1;
        }
        boolean salir = false;
            while(!salir){
                switch(status){
                    case 1:
                        salir=true;
                     break;
                    case 2:
                        salir=true;
                     break;   
                }
            }
        
            
    }
}
