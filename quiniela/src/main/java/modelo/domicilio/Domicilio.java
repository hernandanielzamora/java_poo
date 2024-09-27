/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.domicilio;
import java.util.Scanner;

/**
 *
 * @author NCAULA208
 */
public class Domicilio {

    private Ciudad ciudad;
    private String calle;
    private int nro;

    public Domicilio(Ciudad ciudad, String calle, int nro) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.nro = nro;
    }

    public static Domicilio crearDomicilio() {
        Scanner scanDomicilio = new Scanner(System.in);
        Ciudad ciudad = Ciudad.seleccionarCiudad();  // Método estático en Ciudad
        System.out.println("Ingrese nombre de la calle");
        String calle = scanDomicilio.nextLine();
        System.out.println("Ingrese número de la calle");
        int nro = scanDomicilio.nextInt();
        return new Domicilio(ciudad, calle, nro);
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

}
