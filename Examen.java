package examen_parcial_1;

public class Examen {


	public Examen(String palabra_1) {
		
	}
	
	public Examen(int lim) {
		
	}
	
	public String primeraMayuscula(String palabra_1) {
		String nombre= palabra_1;
		nombre= nombre.substring(0,1).toUpperCase()+ nombre.substring(1);
		return nombre;	
	}
	
	public String invertirCadena(String frase) {
		String str="";
		for(int x=frase.length()-1; x>=0; x--){
			char ch= frase.charAt(x);
			str=str+ch;
			}
		return str;
	}
	public String vocalesMayuscula(String vocales) {
		String frase = vocales;
	    char[] frase_1 = frase.toCharArray();
	    for (int x = 0; x < frase_1.length; x++) {
	        char ch_02 = frase_1[x];
	        if (ch_02 == 'a' || ch_02 == 'e' || ch_02 == 'i' || ch_02 == 'o' || ch_02 == 'u') {
	            frase_1[x] = Character.toUpperCase(ch_02);
	        }
	    }
	    frase = new String(frase_1);
	
		return frase;
	}
	
	public int fizzBuzz(int lim) {
		
		int contador = 1;
		int n = lim;
		
		while (contador <= n) {
			if ((contador % 3 == 0) && (contador % 5 == 0)) {
				System.out.println("fizzBuzz");
			}
			else if(contador%5==0) {
				System.out.println("Buzz");
			}
			else if(contador % 3 == 0) {
				System.out.println("fizz");
			}
			else {
				System.out.println(contador);
			}
			contador++;
		}
		return contador;
	}
	
	public boolean palindromo(String pali) {
		
		String frase_02= pali;
	       char [] pali_01;
	       int izq, der;
	       frase_02 = frase_02.toLowerCase();
	       frase_02 = frase_02.replace(" ","");
	       pali_01 = frase_02.toCharArray();
	       izq = 0;
	       der = pali_01.length - 1 ;
	       boolean condicion = false;
	       
	       while(izq < der){
	           if(pali_01[izq] == pali_01[der]){
	               der --;
	               izq++;
	           }else{
	               condicion = false;
	               break;
	           }
	       }
	       
	       if (izq == der){
	    	   condicion = true;
	       }
		return condicion;
	    }
}
		
		/*frase_02=frase_02.toLowerCase();
		
		for(int x=0, a= frase_02.length()-1; x<=a; x++, a--) {
				if (frase_02.charAt(x)==frase_02.charAt(a)) {
					condicion=true;
				}
				else {
				 condicion=false;
				}
			}
		return condicion;
		*/
	
	
	

