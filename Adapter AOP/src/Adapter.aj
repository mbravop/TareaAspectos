public aspect Adapter{
	declare parents:
		ContabilidadSAP implements AdaptadorContabilidad;
	declare parents:
		ContabilidadGranBoreal implements AdaptadorContabilidad;
	
	public void ContabilidadSAP.anotarVenta(){
		System.out.println("Adaptado - ContabilidadSAP");
	}
	
	public void ContabilidadGranBoreal.anotarVenta(){
		System.out.println("Adaptado - ContabilidadGranBoreal");
	}
}