/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema001;

/**
 *
 * @author SALA I
 */
public class Estudiante {

    private String nombre;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private double promedio;

    public Estudiante() {
        nombre = "Joe Churo";
        notaMateria1 = 7.5;
        notaMateria2 = 8.5;
        notaMateria3 = 9.8;
        
    }
    public Estudiante(String nom, double nMateria1
            , double nMateria2,double nMateria3) {
        nombre = nom;
        notaMateria1 = nMateria1;
        notaMateria2 = nMateria2;
        notaMateria3 = nMateria3;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerMateria1(double n) {
        notaMateria1 = n;
    }
    public void establecerMateria2(double n) {
        notaMateria2 = n;
    }
    public void establecerMateria3(double n) {
        notaMateria3 = n;
    }
    public void calcularPromedio() {
        promedio = notaMateria1+notaMateria2+notaMateria3;
        promedio = promedio / 3;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public double obtenerMateria1() {
        return notaMateria1;
    }
    public double obtenerMateria2() {
        return notaMateria2;
    }
    public double obtenerMateria3() {
        return notaMateria3;
    }
    public double obtenerPromedio() {
        return promedio;
    }
    @Override
    public String toString() {
        String cadena = String.format("Estudiantes\n"
                + "Nombre: %s\n"
                + "Calificacion materia 1: %.2f\n"
                + "Calificacion materia 2: %.2f\n"
                + "Calificacion materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromedio());
        return cadena;
    }
}
