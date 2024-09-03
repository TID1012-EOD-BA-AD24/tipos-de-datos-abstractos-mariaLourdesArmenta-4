package miPrincipal;
public class AppFecha{
    public static void menu() {
        System.out.println("====================================");
		System.out.println("    Operaciones con Fechas        ");
        System.out.println("====================================");
        Fecha f1 = new Fecha(2,11,1970);
		Fecha f2 = new Fecha("2/11/1970");
		
		//imprimir el día
		System.out.println("Dia = "+f1.getDia());
		//imprimimos el mes
		System.out.println("Mes = "+f1.getMes());
		//imprimimos el año
		System.out.println("Año = "+f1.getAnio());
		System.out.println(f2);
		if (f1.equals(f2))
			System.out.println("Son iguales");
		else
			System.out.println("Son Diferentes");
		f2 = f1.addDias(360+30+1);
		System.out.println(f2);


        
    }
}