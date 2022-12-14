import java.util.Hashtable;

public aspect SingletonRegister{
	/**
	 * especificar la clase que implementa la interfaz Singleton mediante una declaracion de parentesco 
	 */
	declare parents: ServiciosExt implements Singleton;

	/**
	 * Almacena las instancias Singleton.
	 */
	private Hashtable singletons=new Hashtable();
	
	/**
	 * Esta interfaz define el rol Singleton.
	 */
	interface Singleton {}

	/**
	 * Define excepciones a la proteccion del constructor, permitiendo que
	 * determinadas clases puedan acceder al constructor original
	 */
	protected pointcut protectionExclusions();

	/**
	 * Remplaza las llamadas al constructor de una clase Singleton para crear una unica instancia bajo demanda.
	 */
	 Object around(): call((Singleton+).new(..))&& !protectionExclusions() {
		 Class singleton=thisJoinPoint.getSignature().getDeclaringType();
		 if (singletons.get(singleton) == null){
			 singletons.put(singleton, proceed());
	 }
	return singletons.get(singleton);
	 }
}

