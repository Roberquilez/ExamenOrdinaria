package Ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class IPODocument {
    private String nombre;
    private String fecha;

    public IPODocument(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }
}

class DocumentacionLegal extends IPODocument {
    private String abogadoEncargado;
    private String registroMercantil;

    public DocumentacionLegal(String nombre, String fecha, String abogadoEncargado, String registroMercantil) {
        super(nombre, fecha);
        this.abogadoEncargado = abogadoEncargado;
        this.registroMercantil = registroMercantil;
    }

    public void printDetails() {
        System.out.println("Nombre: " + getNombre() + ", Fecha: " + getFecha() + ", Abogado Encargado: " + abogadoEncargado + ", Registro Mercantil: " + registroMercantil);
    }
}

class DocumentacionFinanciera extends IPODocument {
    private double balance;
    private double estadoResultados;

    public DocumentacionFinanciera(String nombre, String fecha, double balance, double estadoResultados) {
        super(nombre, fecha);
        this.balance = balance;
        this.estadoResultados = estadoResultados;
    }

    public void printDetails() {
        System.out.println("Nombre: " + getNombre() + ", Fecha: " + getFecha() + ", Balance: " + balance + ", Estado de Resultados: " + estadoResultados);
    }
}

class HitosAvancesIPO {
    private String descripcion;
    private String fecha;
    private String estado;

    public HitosAvancesIPO(String descripcion, String fecha, String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public void printDetails() {
        System.out.println("Descripcion: " + descripcion + ", Fecha: " + fecha + ", Estado: " + estado);
    }
}

class Proveedor {
    private String nombre;
    private String contacto;

    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void printDetails() {
        System.out.println("Nombre: " + nombre + ", Contacto: " + contacto);
    }
}

class Inversionista {
    private String nombre;
    private double inversionRealizada;

    public Inversionista(String nombre, double inversionRealizada) {
        this.nombre = nombre;
        this.inversionRealizada = inversionRealizada;
    }

    public void printDetails() {
        System.out.println("Nombre: " + nombre + ", Inversion Realizada: " + inversionRealizada);
    }
}

class ActorIPO {
    private String nombre;
    private String rol;

    public ActorIPO(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void printDetails() {
        System.out.println("Nombre: " + nombre + ", Rol: " + rol);
    }
}

class DocumentacionOperativa extends IPODocument {
    private String operacion;
    private String procedimiento;

    public DocumentacionOperativa(String nombre, String fecha, String operacion, String procedimiento) {
        super(nombre, fecha);
        this.operacion = operacion;
        this.procedimiento = procedimiento;
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentacionLegal docLegal = new DocumentacionLegal("Contrato de IPO", "2024-05-29", "Abogado UAX", "Registro123");
        DocumentacionFinanciera docFinanciera = new DocumentacionFinanciera("Balance General", "2024-05-29", 1000000.0, 500000.0);
        Proveedor proveedor1 = new Proveedor("Proveedor UAX", "contacto@myuax.com");
        Inversionista inversionista1 = new Inversionista("Inversionista UAX", 200000.0);
        ActorIPO actor1 = new ActorIPO("Consultor C", "Consultoría legal");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Imprimir documentación legal");
            System.out.println("2. Imprimir documentación financiera");
            System.out.println("3. Imprimir proveedores");
            System.out.println("4. Imprimir inversionistas");
            System.out.println("5. Imprimir actores IPO");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    docLegal.printDetails();
                    break;
                case 2:
                    docFinanciera.printDetails();
                    break;
                case 3:
                    proveedor1.printDetails();
                    break;
                case 4:
                    inversionista1.printDetails();
                    break;
                case 5:
                    actor1.printDetails();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}