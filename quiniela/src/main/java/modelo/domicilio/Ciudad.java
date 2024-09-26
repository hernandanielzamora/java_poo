/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.domicilio;

import modelo.persona.quiniela.Sucursal;

/**
 *
 * @author NCAULA208
 */
public class Ciudad {
    private String provincia;
    private String ciudd;
    private Sucursal[]sucursals;

    public Ciudad(String provincia, String ciudd) {
        this.provincia = provincia;
        this.ciudd = ciudd;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudd() {
        return ciudd;
    }

    public void setCiudd(String ciudd) {
        this.ciudd = ciudd;
    }

    public Sucursal[] getSucursals() {
        return sucursals;
    }

    public void setSucursals(Sucursal[] sucursals) {
        this.sucursals = sucursals;
    }
   
}
