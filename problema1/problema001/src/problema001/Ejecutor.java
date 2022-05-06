/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

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
    Estudiante estudient = new Estudiante();
    Estudiante estudient2 = new Estudiante("Katty Churo", 7.5, 9.5, 8.5);
    
    
    estudient.calcularPromedio();
    System.out.printf("%s\n", estudient);
    estudient2.calcularPromedio();
    System.out.printf("%s\n", estudient2);
    }
    
}
