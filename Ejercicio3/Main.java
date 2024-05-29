package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

class IPODocument {
    private String nombre;
    private String fecha;

    public IPODocument(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
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

class DocumentacionFinanciera extends IPODocument {
    private double balance;
    private double estadoResultados;

    public DocumentacionFinanciera(String nombre, String fecha, double balance, double estadoResultados) {
        super(nombre, fecha);
        this.balance = balance;
        this.estadoResultados = estadoResultados;
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

}

class Proveedor {
    private String nombre;
    private String contacto;

    public Proveedor(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

}

class Inversionista {
    private String nombre;
    private double inversionRealizada;

    public Inversionista(String nombre, double inversionRealizada) {
        this.nombre = nombre;
        this.inversionRealizada = inversionRealizada;
    }

    // Otros métodos específicos para los inversionistas
}

class ActorIPO {
    private String nombre;
    private String rol;

    public ActorIPO(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

}

public class Main {
    public static void main(String[] args) {
        DocumentacionLegal docLegal = new DocumentacionLegal("Contrato de IPO", "2024-05-29", "Abogado X", "Registro123");
        DocumentacionFinanciera docFinanciera = new DocumentacionFinanciera("Balance General", "2024-05-29", 1000000.0, 500000.0);
        HitosAvancesIPO hito1 = new HitosAvancesIPO("Presentación ante la SEC", "2024-05-30", "En progreso");
        Proveedor proveedor1 = new Proveedor("Proveedor A", "contacto@proveedora.com");
        Inversionista inversionista1 = new Inversionista("Inversionista B", 200000.0);
        ActorIPO actor1 = new ActorIPO("Consultor C", "Consultoría legal");

    }
}

