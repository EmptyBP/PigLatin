import java.util.Scanner;
//@Final Version, the code is already completed and working succesfully!
 class Pig_Latin {

	 
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);

		 String add1="way";
		 String add2= "ay";
		 

		char[] vowels= {'a','e','i','o','u'}; //Para vocales / Save vowels
		
		String respuesta;  
		
		char primL, secL; 
		/*Estos char se usarán para la función lógica del Pig Latin entre consonanates y vocales 
		 * Those char will be use as logic conditions for Pig latin between consonants and vowels*/
		
    }
        //Aquí empieza la interacción con el usuario / At this point Starts the interaction with the user
        
        System.out.println("¡Bienvenido al traductor Pig Latín, ingresa el texto que desees (en inglés) y será traducido"
        		+ "al idioma de Pig Latín que nadie habla pero suena gracioso!");
    
        System.out.print("Adelante, ingresa un texto, recordando únicamente que debe ser en inglés: ");
        respuesta=in.nextLine();
        respuesta=respuesta.toLowerCase();
        
        String[] words =respuesta.split("\\s+");
        String espacio="";
        
        for (String word : words) {
        	
        primL=word.charAt(0);
        
        
        if(primL != vowels[0] && primL != vowels[1] && primL !=vowels[2]  && primL !=vowels[3]  && primL !=vowels[4]) {
        	secL=word.charAt(1);
        	if (secL != vowels[0] && secL != vowels[1] && secL !=vowels[2]  && secL !=vowels[3]  && secL !=vowels[4]) {
        		String word1="";
        		for (int i=2; i<word.length();i++) {
        			word1=word1 + word.charAt(i);
        		}
        		word1=word1+word.charAt(0)+word.charAt(1)+add2;
        		System.out.print(word1+" ");
        	
        	}
        		
        		else {
        				String word2="";
        				for (int i=1; i<word.length();i++) {
            			word2=word2 + word.charAt(i);
        				}
        				word2=word2+word.charAt(0)+add2;
        				System.out.print(word2+" ");
        				
        				
        		}
        } 
        if (primL == vowels[0] || primL == vowels[1] || primL ==vowels[2]  || primL ==vowels[3]  || primL ==vowels[4]){
        	
        		String word3="";
        		for (int i=1; i<word.length();i++) {
        			word3=word3 + word.charAt(i);
        		}
        		word3=word3+word.charAt(0)+add1;
        		System.out.print(word3+" ");
        	
        		}
        
        	}
        }
	}
 
  

