imimport java.util.Scanner;

 class Pig_Latin {

	 String add1="way";
	 String add22= "ay";
	 
	public void Palabra(String[] args) {
		Scanner in = new Scanner (System.in);
		
		char[] letters= new char [21]; //Guarda las consonantes del abecedario / Save all consonants letters from the alphabet
		
		char[] vowels= {'a','e','i','o','u'}; //Para vocales / Save vowels
		
		String respuesta;  
		
		char primL, secL; 
		/*Estos char se usarán para la función lógica del Pig Latin entre consonanates y vocales 
		 * Those char will be use as logic conditions for Pig latin between consonants and vowels*/
		
		//Ciclo for para guardar las consonantes del alfabeto / loop for to save alphabet consonants
		int number=0;
		for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
    {
        if (alphabet != vowels[0] && alphabet != vowels[1] && alphabet !=vowels[2]  && alphabet !=vowels[3]  && alphabet !=vowels[4]) {
        	 
         letters[number]=alphabet;
        number++;
        }
        
        //Aquí empieza la interacción con el usuario / At this point Starts the interaction with the user
        
        System.out.println("¡Bienvenido a el traductor Pig Latín, ingresa el texto que desees (en inglés) y será traducido"
        		+ "al idioma de Pig Latín que nadie habla pero suena gracioso!");
    
        System.out.print("Adelante, ingresa un texto, recordando únicamente que debe ser en inglés: ");
        respuesta=in.nextLine();
        
        
        String[] words = respuesta.split(" ");

        for (String word : words) {
        	
        }
        primL=respuesta.charAt(0);
        secL=respuesta.charAt(1);
        
        if (primL != vowels[0] && primL != vowels[1] && primL !=vowels[2]  && primL !=vowels[3]  && primL !=vowels[4]) {
        	
        }
  }
		
		/*Es todo lo que llevo hasta ahora, en este punto debo cambiar el primL y secL para que trabajen con un ciclo for y la decisión lógica de if para ir por cada 
		* words[number].charAt(0), mismo caso con charAt(1) */
	
		}
	public static void main (String []args) {
        
        
        }
 }
	

