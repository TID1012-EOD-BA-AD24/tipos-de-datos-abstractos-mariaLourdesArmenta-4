package miPrincipal;
public class Conjunto {
	static int M = 20; //Aumento de la capacidad
	private Object cto[];
	private int cardinal;
	private int capacidad;
	//Operaciones
	public Conjunto()
	{
		cto = new Object[M];
		cardinal = 0;
		capacidad = M;
	}
	//determina si el conjunto esta vacio
	public boolean esVacio()
	{
	   return (cardinal == 0);
	}
	//añade un elemento si no está en el conjunto
	public Conjunto añadir(Object elemento)
	{
		//coloque aquí el código faltante
		
		
	}
	//quita el elemento del conjunto

	public Conjunto retirar(Object elemento)
	{
		//coloque aquí el código faltante
	}
	//busca si un elemento pertenece al conjunto
	public boolean pertenece(Object elemento)
	{
		//coloque aquí el código faltante
	}
	//devuelve el número de elementos
	public int cardinal()
	{
		return this.cardinal;
	}
	//Operacion union de dos conjuntos
	public Conjunto union(Conjunto c2)
	{
		Conjunto u = new Conjunto();
		// primero copia el primer operando de la union
		for(int k = 0;k<cardinal;k++)
			u.cto[k] = cto[k];
		u.cardinal = cardinal;
		//añade los elementos de c2 no incluidos
		for (int k=0;k<c2.cardinal;k++)
			u.añadir(c2.cto[k]);
		return u;
	}
	public Object elemento(int n) throws Exception
	{
	  if (n<=cardinal)
		return cto[--n];
	  else
		throw new Exception("Fuera deRango");
	}
	
	public String toString()
	{
		String s = "{";
		for(int k = 0;k<cardinal;k++)
			s += cto[k].toString() + ",";
		if (cardinal>0)
			s = s.substring(0,s.length()-1);
		s += "}";
		return s;
	}

}