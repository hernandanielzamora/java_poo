/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package execption;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author NCAULA208
 */
public class ClaseException {

    public static void main(String[] args) {
        
        try{
            primerLlamadaCalculo();
        }catch(Exception e){
            e.printStackTrace();
            if(e instanceof ArithmeticException)
                System.out.println("El divisor debe ser mayor a cero");
            if(e instanceof InputMismatchException)
                System.out.println("Los datos de entrada no son de tipo númerico");
        }finally{
            try{
                primerLlamadaCalculo();
            }catch(Exception e){}
        }
    }
    
    private static void primerLlamadaCalculo()throws Exception{
        calcularDivision();
    }
    private static void calcularDivision()throws Exception{
        int dividendo, divisor, cociente;
        dividendo=divisor=cociente=0;
        System.out.println("Division de dos numeros enteros");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dividendo:");
        dividendo = sc.nextInt();
        System.out.println("Ingrese divisor:");
        divisor = sc.nextInt();
        if(divisor>0){
            cociente = dividendo/divisor;
            System.out.println("El cociente es:"+cociente);
        }else
            throw new MiPropiaExepcion("Se ejecuta mi propia excepcion");
            
    }
}
