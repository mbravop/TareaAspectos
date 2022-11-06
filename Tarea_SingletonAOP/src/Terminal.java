
public class Terminal {
	public static void main(String [] args) {
		
		ServiciosExt factoria1= new ServiciosExt("Factoria EC");
		System.out.println(factoria1.getNombre());

		ServiciosExt factoria2= new ServiciosExt("ECFac");
		System.out.println(factoria2.getNombre());
				
		ServiciosExt factoria3= new ServiciosExt();
		System.out.println(factoria3.getNombre());
		
	}
}
