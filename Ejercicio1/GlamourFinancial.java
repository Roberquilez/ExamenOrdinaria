package Ejercicio1;

public interface GlamourFinancial {
    double getCotizacion(String mercado);
    void setCotizacion(String mercado, double cotizacion);
    double calcularValorMercado();
    double calcularPrecioValorEnLibros();
}
