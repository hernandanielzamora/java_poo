/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persona.quiniela;

import modelo.domicilio.Ciudad;
import modelo.persona.Vendedor;
import repositorio.RepositorioQuiniela;
import java.util.Scanner;

/**
 *
 * @author NCAULA208
 */
public class Sucursal {

    private int nroSucursal;
    private Ciudad ciudad;
    private Quiniela quiniela;
    private Vendedor[] vendedors;

    public Sucursal(int nroSucursal, Ciudad ciudad, Quiniela quiniela) {
        this.nroSucursal = nroSucursal;
        this.ciudad = ciudad;
        this.quiniela = quiniela;
    }

    public int getNroSucursal() {
        return nroSucursal;
    }

    public void setNroSucursal(int nroSucursal) {
        this.nroSucursal = nroSucursal;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Quiniela getQuiniela() {
        return quiniela;
    }

    public void setQuiniela(Quiniela quiniela) {
        this.quiniela = quiniela;
    }

    public Vendedor[] getVendedors() {
        return vendedors;
    }

    public void setVendedors(Vendedor[] vendedors) {
        this.vendedors = vendedors;
    }

    public static Sucursal seleccionarSucursal() {
        System.out.println("=========== Listado de Sucursales ================");
        for (int i = 0; i < RepositorioQuiniela.sucursales.length; i++) {
            Sucursal sucursal = RepositorioQuiniela.sucursales[i];
            System.out.println((i + 1) + " Sucursal Nro: " + sucursal.getNroSucursal()
                    + ", Ciudad: " + sucursal.getCiudad().getCiudad());
        }

        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();

        // Validar la selección
        if (seleccion < 1 || seleccion > RepositorioQuiniela.sucursales.length) {
            System.out.println("Selección no válida. Intente nuevamente.");
            return seleccionarSucursal(); // Vuelve a llamar a la función si la selección no es válida
        }

        return RepositorioQuiniela.sucursales[seleccion - 1]; // Retorna la sucursal seleccionada
    }

}
