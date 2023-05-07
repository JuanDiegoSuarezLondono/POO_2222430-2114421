/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2222430.pkg2114421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int promedio;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese capacidad, consumo(Km) y placa del camion 1: ");
        Camion C1=new Camion(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),br.readLine());
        System.out.println("Ingrese capacidad, consumo (Km) y placa del camion 2: ");
        Camion C2=new Camion(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),br.readLine());
        System.out.println("Ingrese capacidad, consumo (Km) y placa del camion 3: ");
        Camion C3=new Camion(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),br.readLine());
        if(C1.getCapacidad()>C2.getCapacidad())            
        {            
            if(C1.getCapacidad()>C3.getCapacidad())
            {
                System.out.println("El de mayor capacidad es: "+C1.getPlaca());
            }
            else
            {
                System.out.println("El de mayor capacidad es: "+C3.getPlaca());
            }
        }   
        else
        {
            if(C2.getCapacidad()>C3.getCapacidad())
            {
                System.out.println("El de mayor capacidad es: "+C2.getPlaca());
            }
            else
            {
                System.out.println("El de mayor capacidad es: "+C3.getPlaca());
            }
        }
       promedio=(C1.getCapacidad()+C2.getCapacidad()+C3.getCapacidad())/3;
       System.out.println("Promedio: "+ promedio);
      
    }
    
    
}
