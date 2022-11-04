class Chocolate {
    private static Chocolate instanciado = null;
    private String marca;
    private float peso;
    private String tipo;
    private float precio;
    
    protected Chocolate(){
        marca = "Nestle";
        peso = 2.20f;
        tipo = "Amargo";
        precio = 1.00f;
    }
    
    public static Chocolate getChocolate(){
        if(instanciado == null){
            instanciado = new Chocolate();
        }
        return instanciado;
    }
    
    public static void metodoExtra(){
        //cuerpo de metodoExtra...
    }
}
