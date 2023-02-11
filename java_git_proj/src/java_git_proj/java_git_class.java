package java_git_proj;
/*

Programa que pide un número al usuario y le dice si es mayor que cero o no
 
Salida del programa
------------------------------------------------------
Introduce un número : -23
-23 no es mayor que 0
 
*/
import java.util.Scanner;

class Num {
	
	static boolean estado ( int num) {
		if (num>0)return true;
		else if (num<=0)return false;
		return false;
	}
	
}

public class java_git_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//valor en teclat
		System.out.print("Introduce un número : ");
		int numero=sc.nextInt();
		
		boolean numer = Num.estado(numero);
		
		if (numer==true) {
			System.out.println(numero+" es mayor que 0");
		}
		else {
			System.out.println(numero+" no es mayor que 0");
		}
		
	}

}
