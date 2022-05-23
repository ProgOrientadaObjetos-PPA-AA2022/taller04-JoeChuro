/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

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
        Cheque cq = new Cheque();
        Cheque cq2 = new Cheque("Fabio Rolando", "Banco Pichincha", 550.30);
        
        cq.calcularComisionBanco();
        System.out.printf("%s\n", cq);
        cq2.calcularComisionBanco();
        System.out.printf("%s\n", cq2);
    }
    
}
