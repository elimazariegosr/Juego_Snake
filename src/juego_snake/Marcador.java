/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_snake;

import java.util.Date;

/**
 *
 * @author Mazariegos
 */
public class Marcador {
    String nombre;
    String fechaNacimiento;
    int punteo =10;
    int movimientos;

    public Marcador() {
    }

    public Marcador(String nombre, String fechaNacimiento, int punteo,int movimientos) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.punteo=punteo;
        this.movimientos=movimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Puntos:"+punteo+" "
                + " Movimientos:"+movimientos+" "
                + " Nombre:"+nombre;
    }
    
}
