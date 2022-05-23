/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Joe
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automotor aMotor = new Automotor();
        Automotor aMotor2 = new Automotor("1102607932", "Mazda", 2019, 19.000);
        
        aMotor.calcularValorMatricula();
        System.out.printf("%s\n", aMotor);
        aMotor2.calcularValorMatricula();
        System.out.printf("%s\n", aMotor2);
    }
    
}
