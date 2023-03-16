package par_impar;
import java.util.Scanner;
public class numero_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla = new Scanner(System.in);
		int numero;
		System.out.println("ingrese el numero");
		numero=tecla.nextInt();
		
		if(numero%2==0) {
			System.out.println("el numero que usted a introducido es PAR");	
		}
		else {System.out.println("el numero ingresado es impar");
		
			
		}
		
	}

}
