package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Curso {
    private String nombre;
    private double duracionHoras;

    public Curso(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    @Override
    public String toString() {
        return nombre + " (" + duracionHoras + " horas)";
    }
}

class Empleado {
    private String nombre;
    private List<Curso> cursosTomados;
    private HashMap<Curso, Double> notas;
    private double promedioAcademico;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cursosTomados = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public void inscribirCurso(Curso curso) {
        cursosTomados.add(curso);
    }

    public void registrarNota(Curso curso, double nota) {
        notas.put(curso, nota);
        calcularPromedioAcademico();
    }

    public void calcularPromedioAcademico() {
        double total = 0;
        for (double nota : notas.values()) {
            total += nota;
        }
        promedioAcademico = total / notas.size();
    }

    public void emitirCertificado() {
        System.out.println("Certificado de formación para " + nombre);
        System.out.println("Cursos tomados:");
        for (Curso curso : cursosTomados) {
            System.out.println("- " + curso + ": " + notas.get(curso));
        }
        System.out.println("Promedio académico: " + promedioAcademico);
    }

    // Método añadido
    public List<Curso> getCursosTomados() {
        return cursosTomados;
    }
}
public class SistemaFormacion {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Introducción a la Economia", 20);
        Curso curso2 = new Curso("Interpretacion de las cotizaciones y valores del mercado", 30);

        Empleado empleado1 = new Empleado("Juan Pérez");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Inscribirse en un curso");
            System.out.println("2. Registrar nota");
            System.out.println("3. Emitir certificado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cursos disponibles:");
                    System.out.println("1. " + curso1);
                    System.out.println("2. " + curso2);
                    System.out.print("Elige un curso: ");
                    int cursoElegido = scanner.nextInt();
                    if (cursoElegido == 1) {
                        empleado1.inscribirCurso(curso1);
                    } else if (cursoElegido == 2) {
                        empleado1.inscribirCurso(curso2);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.println("Cursos inscritos:");
                    int i = 1;
                    for (Curso curso : empleado1.getCursosTomados()) {
                        System.out.println(i + ". " + curso);
                        i++;
                    }
                    System.out.print("Elige un curso para registrar una nota: ");
                    int cursoNota = scanner.nextInt();
                    System.out.print("Ingresa la nota: ");
                    double nota = scanner.nextDouble();
                    empleado1.registrarNota(empleado1.getCursosTomados().get(cursoNota - 1), nota);
                    break;
                case 3:
                    empleado1.emitirCertificado();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}