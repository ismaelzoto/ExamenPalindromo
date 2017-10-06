
public class Palindromo {

	public boolean espalindromo(String cadena){
	
		boolean valor=true;
		int inicio,fin;    
		String cad2="";
		
		//quitamos los espacios
		for (int x=0; x < cadena.length(); x++) {
			if (cadena.charAt(x) != ' ')
				cad2 += cadena.charAt(x);
		}
		
		//volvemos a asignar variables
		cadena=cad2;    
		fin =cadena.length();
		
		//comparamos cadenas
		for (inicio= 0 ;inicio < (cadena.length()); inicio++){        
			if (cadena.substring(inicio, inicio+1).equals(cadena.substring(fin-1, fin)) == false ) {
				//si una sola letra no corresponde no es un palindromo por tanto
				//sale del ciclo con valor false
				valor=false;
				break;
			}
			fin--;
		}
		return valor;
}
	public boolean palindromociclo(String cadena){
		
		boolean valor = true;
		int inicio = 0;
		int fin=1;
		 
	
		while (cadena.charAt(0)!=cadena.charAt(cadena.length()-inicio-1)){

			if (cadena.substring(inicio).equals(cadena.substring(fin)) == false){				
				
			} else {
				valor=false;
				break;
			}
            fin--;
		 }
			return valor;
	}
	
	 public boolean Palindromorecursivo(String cadena){
		  
		 if(cadena.length() == 0 || cadena.length() == 1){
			 return true;
		 }
		 if (cadena.charAt(0) == cadena.charAt(cadena.length() -1)){
			 
			 return	Palindromorecursivo(cadena.substring(1,cadena.length()-1));
		 }
		 return false;
	 }   
}
