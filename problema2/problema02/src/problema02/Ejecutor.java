/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesor profe = new Profesor();
        Profesor profe2 = new Profesor("Tania", "Rios", 900, "1102607932");

        profe.calcularSueldoTotal();
        System.out.printf("%s\n", profe);
        profe2.calcularSueldoTotal();
        System.out.printf("%s\n", profe2);
    }

}
