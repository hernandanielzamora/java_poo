package modelo.persona.quiniela;

import modelo.persona.Persona;
import modelo.domicilio.Domicilio;

/**
 *
 * @author NCAULA208
 */
public class Quiniela extends Persona {
    
    private String razonSocial;
    private String cuit;
    private Sucursal[] sucursales;
    
    // Constructor de la clase Quiniela
    public Quiniela(String nombre, String apellido, int dni, Domicilio domicilio, String razonSocial, String cuit) {
        // Llama al constructor de la clase Persona
        super(nombre, apellido, dni, domicilio);
        // Asigna los valores específicos de la clase Quiniela
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
    
    // Getters y setters
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String generarCodigo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
