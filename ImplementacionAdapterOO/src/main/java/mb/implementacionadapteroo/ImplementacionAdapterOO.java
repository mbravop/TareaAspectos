/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mb.implementacionadapteroo;

/**
 *
 * @author mbravop
 */
public class ImplementacionAdapterOO {

    public static void main(String[] args) {
        Motor motorComun = new MotorComun();
        motorComun.encender();
        motorComun.acelerar();
        motorComun.apagar();
        
        System.out.println("");
        
        Motor motorElectrico = new MotorElectricoAdapter();
        motorElectrico.encender();
        motorElectrico.acelerar();
        motorElectrico.apagar();
    }
}
