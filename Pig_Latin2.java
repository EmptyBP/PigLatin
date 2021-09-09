import java.util.Scanner;

/*@version 1.2 
Está versión trae como diferencia el como ahora si detecta el texto ingresado, igualmente la forma en la cual mueve los caracteres sigue siendo incorrecta, solo los 
duplica y añade al final y algunos otros errores*/
 class Pig_Latin2 {

	 
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);

		 String add1="way";
		 String add2= "ay";
		 
		char[] letters= new char [21]; //Guarda las consonantes del abecedario 
		
		char[] vowels= {'a','e','i','o','u'}; //Para vocales / Save vowels
		
		String respuesta;  
		
		char primL, secL; 
		//Estos char se usarán para la función lógica del Pig Latin entre consonanates y vocales //
		
		//Ciclo for para guardar las consonantes del alfabeto 
		int number=0;
		for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
    {
        if (alphabet != vowels[0] && alphabet != vowels[1] && alphabet !=vowels[2]  && alphabet !=vowels[3]  && alphabet !=vowels[4]) {
        	 
         letters[number]=alphabet;
        number++;
        }
    }
        //Aquí empieza la interacción con el usuario 
        
        System.out.println("¡Bienvenido a el traductor Pig Latín, ingresa el texto que desees (en inglés) y será traducido"
        		+ "al idioma de Pig Latín que nadie habla pero suena gracioso!");
    
        System.out.print("Adelante, ingresa un texto, recordando únicamente que debe ser en inglés: ");
        respuesta=in.nextLine();
        
        
        String[] words = respuesta.split(" ");

        for (String word : words) {
        	
        
        primL=respuesta.charAt(0);
        secL=respuesta.charAt(1);
        
         {//DETECTA LOS 3 CASOS PERFECTAMENTE, SOLO FALTA CORREGIR EL COMO MUEVE LAS LETRAS DENTRO DE LAS CADENAS DE TEXTO
        if (primL != vowels[0] && primL != vowels[1] && primL !=vowels[2]  && primL !=vowels[3]  && primL !=vowels[4]) {
        	if (secL != vowels[0] && secL != vowels[1] && secL !=vowels[2]  && secL !=vowels[3]  && secL !=vowels[4]) {
        		String word1;
        		word1=(word.subSequence(0, word.length())+ word.substring(1, word.length()))+ word.concat(add1);
        		System.out.print(word1+" ");
        	}
        		else {
        			String word2;
        			word2=word.substring(1, word.length())+word.concat(add1);
        			System.out.print(word2+" ");
        	}
        }
        else if (primL == vowels[0] || primL == vowels[1] || primL ==vowels[2]  || primL ==vowels[3]  || primL ==vowels[4]){
        	
        		String word3;
        		word3=word.concat(add2);
        		System.out.print(word3+" ");
        	}	
        	}
        }
  }
}
	
