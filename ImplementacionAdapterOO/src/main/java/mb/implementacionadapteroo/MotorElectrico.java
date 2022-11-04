/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mb.implementacionadapteroo;

/**
 *
 * @author mbravop
 */
public class MotorElectrico {
    private boolean conectado = false;
    
    public MotorElectrico(){
        System.out.println("Creando MotorElectrico");
        this.conectado = false;
    }
    
    public void conectar(){
        System.out.println("Conectando MotorElectrico");
        this.conectado = true;
    }
    
    public void activar(){
        if(conectado){
            System.out.println("Activando MotorElectrico");
        }else{
            System.out.println("No se puede activar, MotorElectrico desconectado");
        }
    }
    
    public void acelerarRapido(){
        if(conectado){
            System.out.println("Acelerando mas rapido");
        }else{
            System.out.println("No se puede acelerar mas rapido, MotorElectrico desconectado");
        }
    }
    
    public void detener(){
        if(conectado){
            System.out.println("Deteniendo MotorElectrico");
        }else{
            System.out.println("No se puede detener, MotoElectrico desconectado");
        }
    }
    
    public void desconectar(){
        System.out.println("Desconectando MotorElectrico");
        this.conectado = false;
    }
}
