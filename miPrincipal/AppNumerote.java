package miPrincipal;
public class AppNumerote{
    public static void menu() {
        System.out.println("==================================");
		System.out.println("    Operaciones con Numerote      ");
        System.out.println("==================================");
        Numerote a =  new Numerote("987654321543216789123");
		Numerote b =  new Numerote("123456789123456789123");
	
		System.out.println("Operador 1="+a);
		System.out.println("Operador 2="+b);
		System.out.println("Suma="+a.suma(b));
		System.out.println("Resta="+a.resta(b));
        
    }
}