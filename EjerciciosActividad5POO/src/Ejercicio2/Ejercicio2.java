/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joni64
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Cortar c1 = new Cortar();
            Soldar s1 = new Soldar();
            ColaDeTrabajo colaTrabajo1 = new ColaDeTrabajo("Cola 1",true);
            colaTrabajo1.agregar(c1);
            colaTrabajo1.agregar(s1);
            */
            /*
            Cortar c2 = new Cortar();
            Soldar s2 = new Soldar();
            ColaDeTrabajo colaTrabajo2 = new ColaDeTrabajo("Cola 2",true);
            colaTrabajo2.agregar(c2);
            colaTrabajo2.agregar(s2);
            colaTrabajo2.sacar();
            colaTrabajo2.sacar();
            colaTrabajo2.sacar();
            */
            /*
            Cortar c3 = new Cortar();
            Soldar s3 = new Soldar();
            ColaDeTrabajo colaTrabajo3 = new ColaDeTrabajo("Cola 3",false);
            colaTrabajo3.agregar(c3);
            colaTrabajo3.agregar(s3);
            colaTrabajo3.sacar();
            */
            
            Cortar c3 = new Cortar();
            Soldar s3 = new Soldar();
            ColaDeTrabajo colaTrabajo3 = new ColaDeTrabajo("Cola 3",false);
            colaTrabajo3.agregar(c3);
            colaTrabajo3.agregar(s3);
            try{
            colaTrabajo3.sacar();
            } catch (NoListaException e){
                System.out.println("Excepcion: " + e.getMessage());
            } catch (SinTrabajoEnColaException ex){
                System.out.println("Excepcion: " + ex.getMessage());
            }
        }
            
            
        
    }
    

