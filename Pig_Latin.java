import java.util.Scanner;

 class Pig_Latin {

	 String add1="way";
	 String add22= "ay";
	 
	  public static void Palabras (String[] args) {
		  Scanner in = new Scanner (System.in);
		  char[] letters= new char [21];
  		char[] vowels= {'a','e','i','o','u'};
  		String respuesta; 
  		char primL, secL;
  		int number=0;
		
		//ESTO ES PARA GUARDAR LAS CONSONANTES EN UN ARREGLO
		//
	     	for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
    {
           if (alphabet != vowels[0] && alphabet != vowels[1] && alphabet !=vowels[2]  && alphabet !=vowels[3]  && alphabet !=vowels[4]) {
        	 
           letters[number]=alphabet;
           number++;
        }
  }
		
        System.out.println("¡Bienvenido a el traductor Pig Latín, ingresa el texto que desees (en inglés) y será traducido"
        		+ "al idioma de Pig Latín que nadie habla pero suena gracioso!");
    
        System.out.print("Adelante, ingresa un texto, recordando únicamente que debe ser en inglés: ");
        respuesta=in.next();
        
        primL=respuesta.charAt(0);
        secL=respuesta.charAt(1);
        
        if (primL != vowels[0] && primL != vowels[1] && primL !=vowels[2]  && primL !=vowels[3]  && primL !=vowels[4]) {
        	
        }
    
        }
	}
	

