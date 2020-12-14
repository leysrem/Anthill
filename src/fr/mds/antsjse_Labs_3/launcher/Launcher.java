package fr.mds.antsjse_Labs_3.launcher;

import java.util.Scanner;

import fr.mds.antsjse_Labs_3.models.Ants;
import fr.mds.antsjse_Labs_3.models.Larva;
import fr.mds.antsjse_Labs_3.models.Male;
import fr.mds.antsjse_Labs_3.models.Queen;
import fr.mds.antsjse_Labs_3.models.Worker;


public class Launcher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nbr = "";

		Ants.AddAll();
		
		do {
			System.out.println("=====================");
			System.out.println("'s': Skip + enter number of day");
			System.out.println("'?': Display anthill");
			System.out.println("Enter: Skip one day");
			System.out.println("'new': Display number of new birth");
			System.out.println("'death': Display number of death");
			System.out.println("'a': Display age of Anthill");
			System.out.println("'q': Quit");
			System.out.println("=====================");
			System.out.print("Entrez votre choix :");
			
			nbr = scanner.nextLine();
			switch (nbr) {
				case "d": {
					System.out.print( "Veuillez entrez le nombre de jour a passer ou appuyer sur entrez pour passer un jour : " );
					int  nbrYear = scanner.nextInt();
					Male.ChangeDay(nbrYear-1);
					Larva.ChangeDay(nbrYear-1);
					Worker.ChangeDay(nbrYear-1);
					Queen.ChangeDay(nbrYear-1);
					break;
				}
				case "?": {
					System.out.println("Anthill");
					Ants.showAll();
					System.out.println("================================================");
					break;
				}
				case "": {
					System.out.println("Skip one day");
					Male.ChangeDay(1);
					Larva.ChangeDay(1);
					Worker.ChangeDay(1);
					Queen.ChangeDay(1);
					break;
				}
				case "new": {
					Ants.NewBirth();
					break;
				}
				case "death" : {
					Ants.NewDeath();
					break;
				}
				case "a" : {
					Ants.ageOfAnthill();
					break;
				}
				case "q": {
					nbr = "q";
				}
			}
		} while (nbr != "q");
	}
}
