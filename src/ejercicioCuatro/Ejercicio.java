package ejercicioCuatro;

import java.util.Scanner;

/*
 * Jonathan Yonuel Pastrana: 5/5
 * Paulina Mendoza Bernal: 5/5
 * */

public class Ejercicio {

	public static void main(String[] args) {
    //se cambió el nombre del scanner para mejorar la lectura del código
		Scanner scanner = new Scanner(System.in); //Faltaba un system.in para que el usuario ingrese información
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = scanner.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Scanner scanner2 = new Scanner(System.in);
    String j2 = scanner.nextLine(); //se usará solo un escaner
    
    int g = 2; 
    if (j1.equals(j2)) { //Se quitó un paréntesis en la condición y se utilizó el método equals para comparar j1 y j2
      System.out.println("Empate");
    } else {
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { //se quitaron los == y se usó equals
            g = 1;
          }
        break; //Por buena práctica se pone break en cada caso
        case "papel":
          if (j2.equals("piedra")) { //se quitaron los == y se usó equals
            g = 1;
          } //Faltaba una llave
        break;
        case "tijera":
          if (j2.equals("papel")) { //se quitaron los == y se usó equals
            g = 1;
          }
        break;
        default:
        	
      } // Fin de switch
	      System.out.println("Gana el jugador " + g);
	    }  //Fin del else
    	scanner.close();
    }//Fin de clase main
	
}//Fin clase Ejercicio
