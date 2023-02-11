package java_git_proj_branch;
import java.util.Scanner;

public class java_git_proj_branch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat=new Scanner(System.in);
            
		//Leer el valor en euros
    	    	System.out.print("Entra un valor en euros : ");
    	       double euros=teclat.nextDouble();
    	        
    	       //calculo de pesetas
    	    	double CAMBIO=166.386;
       
        //Calcular el valor en pesetas
    	    	double pts=euros*CAMBIO;
    	        
    	      //Mostrar el resultado
    	       System.out.println("El valor en pesetas es :" +pts);     
		
	}
}
