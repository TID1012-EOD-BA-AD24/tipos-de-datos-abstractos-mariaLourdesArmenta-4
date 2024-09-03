package miPrincipal;
public class AppPersona{
    public static void menu() {
        System.out.println("==================================");
		System.out.println("    Operaciones con Personas      ");
        System.out.println("==================================");
        Persona p1 = new Persona("AELL680111","Lourdes Armenta",new Fecha("11/2/1968"));
        System.out.println(p1.getDni());
        System.out.println(p1.getNombre());
        System.out.println(p1.getFechaNacimiento());


        
    }
}