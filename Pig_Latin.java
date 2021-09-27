import java.util.Scanner;
//@Final version, already working succesfully
 class Pig_Latin {

	 
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);

		 int lenght1;
		
		char[] vowels= {'a','e','i','o','u'}; //Para vocales 
		
		String respuesta;  
		
		char primL, secL, terL;
		//Estos char se usarán para la función lógica del Pig Latin entre consonanates y vocales 
		
        
        System.out.println("¡Bienvenido al traductor Pig Latín, ingresa el texto que desees (en inglés) y será traducido"
        		+ "al idioma de Pig Latín que nadie habla pero suena gracioso!");
    
        System.out.print("Adelante, ingresa un texto, recordando únicamente que debe ser en inglés: ");
        respuesta=in.nextLine();
        in.close();
        respuesta=respuesta.toLowerCase();
      
        String[] words =respuesta.split("\\W+"); 
        /*Esto separa las palabras de la cadena que ingresa el usuario, utiliza \\W como separador para palabra por palabra 
         (También se puede usar " " pero genera un problema cuando ingresas una palabra y al finalizar colocas ",") */
        for (String word : words) {
        	int consonant_pot=0;	
        	
        lenght1=word.length();
        //consonantes
        if(word.charAt(consonant_pot) != vowels[0] && word.charAt(consonant_pot) != vowels[1] && word.charAt(consonant_pot) !=vowels[2] 
    			&& word.charAt(consonant_pot) !=vowels[3] && word.charAt(consonant_pot) != vowels[4]) {
        	consonant_pot++;//valor de 1
        	
        	
        	//Excepcion para Palabras de 3 o menos caracteres
        	if (word.charAt(consonant_pot) != vowels[0] && word.charAt(consonant_pot) != vowels[1] && word.charAt(consonant_pot) !=vowels[2] 
        			&& word.charAt(consonant_pot) !=vowels[3] && word.charAt(consonant_pot) != vowels[4] && lenght1>=3 ) {
        		consonant_pot++;//valor de 2
        		if (lenght1<3) {
            		String exception="";
            		for (int i=1; i<word.length();i++) {
            			exception=exception + word.charAt(i);
            		}
            		
            		exception=exception+word.charAt(0)+"ay";
                		System.out.print(exception+" ");
                		}
        		
        		//3 consonantes
        		else if (word.charAt(consonant_pot) != vowels[0] && word.charAt(consonant_pot) != vowels[1] && word.charAt(consonant_pot) !=vowels[2] 
            			&& word.charAt(consonant_pot) !=vowels[3] && word.charAt(consonant_pot) != vowels[4]) {
            		String word2="";
            		for (int i=3; i<word.length();i++) {
            			word2=word2 + word.charAt(i);
            		}
            		
            		word2=word2+word.charAt(0)+word.charAt(1)+word.charAt(2)+"ay";
            		System.out.print(word2+" ");
            		
        		}
        		
        		//2 consonantes
        		else if (word.charAt(consonant_pot) == vowels[0] || word.charAt(consonant_pot) == vowels[1] || word.charAt(consonant_pot) == vowels[2]
        				|| word.charAt(consonant_pot) == vowels[3]  || word.charAt(consonant_pot) == vowels[4]) {
        		String word1="";
        		for (int i=2; i<word.length();i++) {
        			word1=word1 + word.charAt(i);
        		}
        			word1=word1+word.charAt(0)+word.charAt(1)+"ay";
            		System.out.print(word1+" ");
        	}
        		
        		}
        	
        		//1 consonante
        		else {
        				String word3="";
        				for (int i=1; i<word.length();i++) {
            			word3=word3 + word.charAt(i);
        				}
        				word3=word3+word.charAt(0)+"ay";
        				System.out.print(word3+" ");
        				
        				
        		}
        } 
        //Comprobante de vocal
    	consonant_pot=0;
        if (word.charAt(consonant_pot) == vowels[0] ||word.charAt(consonant_pot) == vowels[1] || word.charAt(consonant_pot) ==vowels[2]  
        		|| word.charAt(consonant_pot) ==vowels[3]  || word.charAt(consonant_pot) ==vowels[4]){
        	
        		System.out.print(word.concat("way")+" ");
        	
        		}
        }
        }
	}
 
  

	
 
