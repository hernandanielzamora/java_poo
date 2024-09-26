/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persona;

import java.util.Date;
import modelo.domicilio.Domicilio;
import modelo.persona.quiniela.Sucursal;
import repositorio.RepositorioQuiniela;

/**
 *
 * @author NCAULA208
 */
public class Vendedor extends Persona {

    private String codigo;
    private String cuil;
    private Sucursal sucursal;

    public Vendedor(String cuil, Sucursal sucursal, String nombre, String apellido, int dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.codigo = generarCodigo();
        this.cuil = cuil;
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String generarCodigo() {
        Date date = new Date();
        return date.getDay() + "-" + date.getMonth() + "-" + date.getYear() + "V-" + contarVenddedores();
    }

    private int contarVenddedores() {
        int contar = 0;
        for (int i = 0; i < RepositorioQuiniela.persona.length; i++) {
            if (RepositorioQuiniela.persona[i] instanceof Vendedor) {
                contar++;
            }
        }
        return contar;
    }

}
