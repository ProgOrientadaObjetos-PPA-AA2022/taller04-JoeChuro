/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author Joe
 */
public class Cheque {
    private String nombre;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public Cheque(){
    nombre = "Juan Calva";
    nombreBanco = "Banco de Loja";
    valorCheque = 3000;
    }
    public Cheque(String nom, String nBanco, Double vCheque){
    nombre = nom;
    nombreBanco = nBanco;
    valorCheque = vCheque;
    }
    public void establecerNombre(String n){
    nombre = n;
    }
    public void establecerNombreBanco(String n){
    nombreBanco = n;
    }
    public void establecerValorCheque(double n){
    valorCheque = n;
    }
    public void calcularComisionBanco(){
    comisionBanco = valorCheque*0.003/100;
    }
    public String obtenerNombre(){
    return nombre;
    }
    public String obtenerNombreBanco(){
    return nombreBanco;
    }
    public double obtenerValorCheque(){
    return valorCheque;
    }
    public double obtenerComisionBanco(){
    return comisionBanco;
    }
    @Override
    public String toString() {
        String cadena = String.format("\tCheque\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n",
                obtenerNombre(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
