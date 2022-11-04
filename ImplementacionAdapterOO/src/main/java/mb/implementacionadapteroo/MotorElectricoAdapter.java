/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mb.implementacionadapteroo;

/**
 *
 * @author mbravop
 */
public class MotorElectricoAdapter implements Motor {
    private MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando MotorElectricoAdapter");
    }
    
    @Override
    public void encender(){
        System.out.println("Encendiendo MotorElectricoAdapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }
    
    @Override
    public void acelerar(){
        System.out.println("Acelerando MotorElectrico");
        this.motorElectrico.acelerarRapido();
    }
    
    
    @Override
    public void apagar(){
        System.out.println("Apagando MotorElectrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
