/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoejrm;
import java.time.LocalDateTime;
/**
 *
 * @author Ernesto Josuè Reyna
 */
public class HolaMundoEJRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime fechayHora = LocalDateTime.now();

        System.out.println("- Nombre: Ernesto Josue Reyna Monrreal");
        System.out.println("- Matricula: 2103944");
        System.out.println("- Fecha y hora actual: " + fechayHora);
    }
    
}
