/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
import modelo.domicilio.Ciudad;
import modelo.domicilio.Domicilio;
import modelo.persona.Vendedor;
import modelo.persona.quiniela.Sucursal;
import repositorio.RepositorioQuiniela;

/**
 *
 * @author NCAULA208
 */
public class Principal {
    
    public static void main(String[] args){
        
    }
    
    private static void menuPrncipal(){
        System.out.println("=================== Sistema de Quiniela=====================");
        System.out.println("ingrese una opción del menu");
        System.out.println("1 Cosultar Vendedores");
        System.out.println("2 Cosultar Clientes");
        System.out.println("3 Cosultar Apuests");
        System.out.println("4 Salir");
        
        Scanner scanner= new Scanner(System.in);
        int opMenu=scanner.nextInt();
        
        while(opMenu!=4){
            switch (opMenu) {
                case 1:
                    subMenuAbmVendedor();
                    break;
                case 2:
                    subMenuAbmCliente();
                    break;
                case 3:
                    subMenuAbmApuestas();
                    break;
                default:
                    break;
            }
        }
    }
    
    private static void subMenuAbmVendedor(){
        System.out.println("===================Menú Vendedores =====================");
        System.out.println("1 Alta de Vendedor");
        System.out.println("2 Eliminar Vendedor");
        System.out.println("3 Modificar Vendedor");
        System.out.println("4 Atras");
        
        Scanner scanner= new Scanner(System.in);
        int opMenu=scanner.nextInt();
        
        while(opMenu!=4){
            switch (opMenu) {
                case 1:
                    subMenuAbmVendedor();
                    break;
                case 2:
                    subMenuAbmCliente();
                    break;
                case 3:
                    subMenuAbmApuestas();
                    break;
                default:
                    break;
            }
        }
    }
    private static void subMenuAbmCliente(){
        
    }
    private static void subMenuAbmApuestas(){
        
    }
    
    private static void itemAltaSubMenuAbmVendedor(){
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el cuit vendedor");
        String cuit=scanner.nextLine();
        System.out.println("Ingrese el nombre del vendedor");
        String nombre=scanner.nextLine();
        System.out.println("Ingrese el apellido del vendedor");
        String apellido=scanner.nextLine();
        System.out.println("Ingrese el dni del vendedor");
        int dni=scanner.nextInt();
        System.out.println("Crear domicilio");
        Domicilio domi=crearDomicilio();
        Sucursal sucursal= seleccionarSucursal();
        Vendedor vendedor= new Vendedor(cuit, sucursal, nombre, apellido, dni, domi);
    }
    
    private static Domicilio crearDomicilio(){
        Scanner scanDomicilio= new Scanner(System.in);
        seleccionarCiudad();
        Ciudad ciudad=RepositorioQuiniela.ciudades[scanDomicilio.nextInt()];
        System.out.println("Ingrese nombre de la calle");
        String calle=scanDomicilio.nextLine();
        System.out.println("Ingrese número de la calle");
        int nro=scanDomicilio.nextInt();
        return new Domicilio(ciudad, calle, nro);
    }
    
    private static void cargarCiudades(){
        Ciudad ciudad1= new Ciudad("Cordoba", "Cordoba");
        Ciudad ciudad2= new Ciudad("Cordoba", "Carlos Paz");
        RepositorioQuiniela.ciudades[0]=ciudad1;
        RepositorioQuiniela.ciudades[0]=ciudad1;
                
    }
    
    private static void seleccionarCiudad(){
        System.out.println("===========Listado de ciudades==================");
        for (int i = 0; i<RepositorioQuiniela.ciudades.length; i++) {
            System.out.println(i+1+" Ciudad: "+RepositorioQuiniela.ciudades[i]);
        }
    }
    
    private static Sucursal seleccionarSucursal(){
        return null;
    }}
