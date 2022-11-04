/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mb.implementacionadapteroo;

/**
 *
 * @author mbravop
 */
public class MotorComun implements Motor{
    public MotorComun(){
        super();
        System.out.println("Creacion MotorComun");
    }
    @Override
    public void encender(){
        System.out.println("Encendiendo MotorComun");
    }
    
    @Override
    public void acelerar(){
        System.out.println("Acelerando MotorComun");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando MotorComun");
    }
}
