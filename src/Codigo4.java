import java.util.Scanner;
public class Codigo4 {

	public static void main(String[] args) {
		
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras ): ");
	 // Declaro el objeto e inicializ con el
	 		//objeto de entrada estándar
	 		Scanner s = new Scanner(System.in);
	    //entrada de una cadena:
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    //tomando en cuenta que piedra tiene 6 letras
	    //tomando en cuenta que papel tiene 5 letras
	    //tomando en cuenta que tijeras tiene 7 letras
	    String a="piedra";
	    String b="papel";
	    String c="tijeras";
	    String e= "empate";
	    
	    //Para comparar realmente las cadenas y no si son o no la misma instancia uso equals
	    if (j1.equals(j2)) {
	     System.out.println("Empate");
	    } else {
	      int g = 2;
	    
	      
	      switch(j1) {
	      //case "empate":
	        	//if (j2.equals(j1)) {
	          // System.out.println("Empate");
	         // }
	        case "piedra":
	        	if (j2.equals("tijeras")) {
	            g = 1;
	          }
	        case "papel":
	        	if (j2.equals("piedra")) {
	            g = 1;
	          }
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  

	    }

}