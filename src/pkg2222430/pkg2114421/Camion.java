/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2222430.pkg2114421;

/**
 *
 * @author suare
 */
public class Camion {
    private int capacidad;
    private double consumo;
    private String placa;

    public Camion() {
        
    }

    public Camion(int capacidad, double consumo, String placa) {
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

 
            
    
}
