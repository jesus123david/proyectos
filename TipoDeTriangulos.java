package triangulos;
import java.util.Scanner;

public class TipoDeTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("introduzca el lado #1");
		do {
			a = leer.nextInt();
			System.out.println("introduzca el lado #2");
			b = leer.nextInt();
			System.out.println("introduzca el lado #3");
			c = leer.nextInt();}
		while(a<=0 || b<=0 || c<=0);
		
		if (a==b && a==c)
		{System.out.println("triangulo equilatero");}
		
		else if (a==b || a==c || b==c)
		{System.out.println("triangulo isosceles");}
		else if (a!=b && a!=c && b!=c)
		{System.out.println("triangulo escaleno");}
	}

}
