import java.util.Scanner;

public class program1 {

	public static void main(String[] args){
		
		Scanner entrada = new Scanner( System.in );
		
		Palindromo objpalindrome=new Palindromo();
		
		System.out.println("Ingrese una frase: ");
		String frase = entrada.nextLine();
		if(objpalindrome.espalindromo(frase)){
			
			System.out.println("ES Palindromo");
		}else{
			System.out.println("NO es Palindromo");
		}	
		
		// aqui inicia mediante ciclo
		System.out.println("Ingrese una frase mediante un ciclo: ");
		String palabra = entrada.nextLine();

		if (objpalindrome.palindromociclo(palabra)){
			System.out.println("ES Palindromo");
		}else{
			System.out.println("NO es Palindromo");
		}

		// aqui inicia mediante Recursividad
		System.out.println("Ingrese una frase: ");
		String palabras = entrada.nextLine();


		if (objpalindrome.Palindromorecursivo(palabras)){
			System.out.println("ES Palindromo");
		}else{
			System.out.println("NO es Palindromo");
		}		
		
	}
}
