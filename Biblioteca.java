package ejercicio_competencias;

public class Biblioteca {

	//ATRIBUTOS
	 int numeros;
	 int[] n;
	 
	 //ATRIBUTOS 5
	 long num;
	 static long aux, digito, decimal;
	 static int exponente;
	 static boolean binario;
	 
	 
	 
	//CONSTRUCTORES
	 public Biblioteca() {}
	 
	 public Biblioteca(int numeros) {
		 this.numeros = numeros;
		 
	 }
	 
	 //CLASES
//	 public void esBinario() {
//		 do {
//	            System.out.print("Introduce un numero binario: ");
//	            num = entrada.nextLong();
//	            
//	            binario = true;
//	            aux = num;
//	            while (aux != 0) {
//	                       digito = aux % 10; 
//	                       if (digito != 0 && digito != 1) {
//	                            binario = false; 
//	                       }
//	                      
//	                       aux = aux / 10; 
//	             }
//	            
//	        } while (!binario);
//	 }

	 
	 public void cuentaNumeros(int numeros) {
		 int longitud = 0;
		 while (numeros != 0) {
			 numeros /= 10;
			 longitud++;
		 }
		 
	 }
	 public void hazmeArray() {
		 int n[] = new int[longitud];
	 }
	 
	 
	 //PUNTO Nº1
	 public boolean esCapicua(int numeros) {
		if( numeros == voltea(numeros)) {
		  	return true;
		}
		else return false;
	 }
	
	 public int dameN() {
		 
		 return 
	 }
	 //public int digitoN(int )
	 //PUNTO Nº2
	 public int voltea(int numeros) {
		 int cifra;
		 int inverso = 0;
		 while (numeros != 0) {
			 cifra = numeros % 10;
			 inverso = inverso *10 + cifra;
			 numeros /= 10;
		 }
		 return inverso;
	 }
	 
	 
	 //PUNTO Nº3
	 public int digitoN( int n) {
		 
		 return n;
		 
			 
		 
	 }
	 //PUNTO Nº5
	 public long binario(long num) {
		 exponente = 0;
		 	decimal = 0;
		 	while (num != 0) {
		 		
		 		digito = num % 10;
		 		
		 		decimal = decimal + digito * (int) Math.pow(2, exponente);
		 		
		 		exponente++;
		 		
		 		num = num / 10;
		 	}
		 return decimal;
	 }
	 
	//1 es capicua
	
	 
	 
	
	
}

