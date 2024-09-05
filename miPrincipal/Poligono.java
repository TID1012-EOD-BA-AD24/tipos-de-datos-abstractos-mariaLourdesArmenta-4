package miPrincipal;
import java.util.Scanner;
public class Poligono {
	private int N;
	private Punto arreglo[];
	
	public Poligono(int N) {
		this.N = N;
		this.arreglo = new Punto[N+1];
	}
	public Poligono(Punto a[]){
		this.N = a.length;
		this.arreglo = a;
	}
	public void LeerDatos() {
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<this.arreglo.length-1;i++) {
			System.out.print("Dame coordenada(x) de vertice"+(i+1)+":");
			int valorX=entrada.nextInt();
			System.out.print("Dame coordenada(y) de vertice"+(i+1)+":");
			int valorY=entrada.nextInt();
			Punto punto = new Punto(valorX,valorY);
			this.arreglo[i]=punto;
		}
		this.arreglo[N]=this.arreglo[0];	
	}
	public void DesplegarArreglo() {
		for (int i=0;i<this.arreglo.length-1;i++) {
			System.out.print("Vertice"+(i+1)+" x ="+
		            this.arreglo[i].getX()+"   ");
			System.out.println(" y ="+
		            this.arreglo[i].getY());
			
		}
	}
	public double calcularPerimetro() {
		//coloca aquí el código faltante
		double p=0;
		for (int i=0;i<this.arreglo.length-1;i++) {
			 p += this.arreglo[i].distancia(this.arreglo[i+1]);	 
			 
		}
		return p;
	}
	public double calcularPerimetro(Poligono a) {
		//coloca aquí el código faltante
		double p=0;
		for (int i=0;i<a.arreglo.length-1;i++) {
			 p += a.arreglo[i].distancia(a.arreglo[i+1]);	
			 
		}
		return p;
	}
	

}
