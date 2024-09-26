/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persona;

import java.util.Calendar;
import java.util.Date;
import modelo.domicilio.Domicilio;
import repositorio.RepositorioQuiniela;

/**
 *
 * @author NCAULA208
 */
public class Cliente extends Persona {
    
    private String codigo;

    public Cliente(String nombre, String apellido, int dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.codigo = generarCodigo();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String generarCodigo() {
         Date date= new Date();    
        return date.getDay()+"-"+date.getMonth()+"-"+date.getYear()+"C-"+ contarClientes();
    }
    
    private int contarClientes(){
        int contar=0;
        for (int i = 0; i < RepositorioQuiniela.persona.length; i++) {
            if(RepositorioQuiniela.persona[i] instanceof Cliente)
                contar++;
        }
        return contar;
    }
    
}
