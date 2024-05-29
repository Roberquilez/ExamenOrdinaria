package Ejercicio1;

import java.util.HashMap;

public class GlamourFinancialImplementation implements GlamourFinancial {
    private HashMap<String, Double> cotizaciones;

    public GlamourFinancialImplementation() {
        this.cotizaciones = new HashMap<>();
    }

    @Override
    public double getCotizacion(String mercado) {
        Double cotizacion = cotizaciones.get(mercado);
        if (cotizacion == null) {
            throw new IllegalArgumentException("Mercado no válido");
        }
        return cotizacion;
    }

    @Override
    public void setCotizacion(String mercado, double cotizacion) {
        cotizaciones.put(mercado, cotizacion);
    }

    @Override
    public double calcularValorMercado() {
        double total = 0;
        for (double cotizacion : cotizaciones.values()) {
            total += cotizacion;
        }
        return total;
    }

    @Override
    public double calcularPrecioValorEnLibros() {
        double valorEnLibros = 1000000; // Valor en libros de la empresa
        return calcularValorMercado() / valorEnLibros;
    }
}