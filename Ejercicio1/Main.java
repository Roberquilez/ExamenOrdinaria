package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de GlamourFinancialImplementation
        GlamourFinancialImplementation glamourFinancial = new GlamourFinancialImplementation();

        // Establecer cotizaciones para diferentes mercados
        glamourFinancial.setCotizacion("Nasdaq", 150.0);
        glamourFinancial.setCotizacion("NYSE", 200.0);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Ver cotización Nasdaq");
            System.out.println("2. Ver cotización NYSE");
            System.out.println("3. Ver valor de mercado total");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cotización Nasdaq: $" + glamourFinancial.getCotizacion("Nasdaq"));
                    break;
                case 2:
                    System.out.println("Cotización NYSE: $" + glamourFinancial.getCotizacion("NYSE"));
                    break;
                case 3:
                    System.out.println("Valor de mercado total: $" + glamourFinancial.calcularValorMercado());
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