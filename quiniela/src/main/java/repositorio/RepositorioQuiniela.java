package repositorio;

import modelo.domicilio.Ciudad;
import modelo.persona.Persona;
import modelo.persona.quiniela.Quiniela;
import modelo.persona.quiniela.Sucursal;
import modelo.domicilio.Domicilio;

public abstract class RepositorioQuiniela {
    
    public static final int TAMANIO_PERSONA = 10;
    
    public static Persona[] persona = new Persona[TAMANIO_PERSONA];
    public static Ciudad[] ciudades = new Ciudad[TAMANIO_PERSONA];
    public static Sucursal[] sucursales = new Sucursal[3]; // Array de sucursales

    static {
        // Inicializa las ciudades
        ciudades[0] = new Ciudad("Provincia1", "Ciudad1");
        ciudades[1] = new Ciudad("Provincia2", "Ciudad2");
        ciudades[2] = new Ciudad("Provincia3", "Ciudad3");

        // Inicializa las sucursales
        Domicilio domicilio = new Domicilio(); // Debes proporcionar la implementación adecuada
        sucursales[0] = new Sucursal(1, ciudades[0], new Quiniela("Quiniela1", "Descripción1", 1, domicilio, "Tipo1", "Activo"));
        sucursales[1] = new Sucursal(2, ciudades[1], new Quiniela("Quiniela2", "Descripción2", 2, domicilio, "Tipo2", "Activo"));
        sucursales[2] = new Sucursal(3, ciudades[2], new Quiniela("Quiniela3", "Descripción3", 3, domicilio, "Tipo3", "Activo"));
    }
}

}
