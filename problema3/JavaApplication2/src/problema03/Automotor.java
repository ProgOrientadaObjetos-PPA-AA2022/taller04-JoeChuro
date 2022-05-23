/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author Joe
 */
public class Automotor {

    private String cedula;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
        cedula = "1103082598";
        marcaVehiculo = "Toyota";
        añoFabricacion = 2010;
        valorVehiculo = 8.000;
    }

    public Automotor(String ced, String marca, int año, double vVehiculo) {
        cedula = ced;
        marcaVehiculo = marca;
        añoFabricacion = año;
        valorVehiculo = vVehiculo;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerMarca(String n) {
        marcaVehiculo = n;
    }

    public void establecerAño(int n) {
        añoFabricacion = n;
    }

    public void establecerValorVehiculo(double n) {
        valorVehiculo = n;
    }

    public void calcularValorMatricula() {
        valorMatricula = valorVehiculo * añoFabricacion;
        valorMatricula = valorMatricula * 0.002;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marcaVehiculo;
    }

    public int obtenerAño() {
        return añoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tAutomotor\n"
                + "cedula: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: %.3f\n"
                + "valor de la matricula: %.3f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAño(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
