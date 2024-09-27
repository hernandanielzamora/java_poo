/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.domicilio;

import modelo.persona.quiniela.Sucursal;
import repositorio.RepositorioQuiniela;
import java.util.Scanner;

/**
 *
 * @author NCAULA208
 */
public class Ciudad {

    private String provincia;
    private String ciudad;
    private Sucursal[] sucursals;

    public Ciudad(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudd(String ciudad) {
        this.ciudad = ciudad;
    }

    public Sucursal[] getSucursals() {
        return sucursals;
    }

    public void setSucursals(Sucursal[] sucursals) {
        this.sucursals = sucursals;
    }

    public static Ciudad seleccionarCiudad() {
        System.out.println("===========Listado de ciudades==================");
        for (int i = 0; i < RepositorioQuiniela.ciudades.length; i++) {
            System.out.println((i + 1) + " Ciudad: " + RepositorioQuiniela.ciudades[i].getCiudad());
        }
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();
        return RepositorioQuiniela.ciudades[seleccion - 1];  // Seleccionar ciudad válida
    }

}
