package fr.mds.antsjse_Labs_3.models;

import java.util.ListIterator;

public class Queen extends Ants {

	public Queen(int id, int age, int maxAge) {
		super(id, age, maxAge);
		
	}
	
	
	
	public Queen() {
		
	}



	@Override
	public String toString() {
		return "Queen: " + super.toString() + "]";
	}
	
	public static void Add(int nbr) {
		for (int i = 0; i < nbr; i++) {
			Ants myAntsQueen = new Queen(i, 0, 50);
			listQueen.add((Queen) myAntsQueen);
		}
	}
	
	public static void ChangeDay(int nbr) {
		int nbrOfDeath = 0;
		if (listMale.size() !=0) {
			for (int k = 0; k < listQueen.size();k++) {
				for (int i = 0; i < nbr; i++) {
					for (int j = 0; j < 10; j++) {
						Ants myAntLarva = new Larva(i, 0, 10);
						listLarva.add((Larva) myAntLarva);
						Ants myAnts = new Ants();
						listNewBirth.add((Ants) myAnts);
					}
				}
			}
		}
		
		for (Queen nbrQueen : listQueen) {
			nbrQueen.setAge(nbrQueen.getAge() + nbr);
		}
		
		for (int i = 0; i < nbr; i++) {
			
			ListIterator<Queen> it = listQueen.listIterator();
			while (it.hasNext()) {
				Ants v = it.next();
				if (v.getAge() >= v.getMaxAge()) {
					System.out.println("Queen Died");
					it.remove();
					nbrOfDeath++;
				}	
			}
			
			for (int k = 0; k < nbrOfDeath; k++) {
				Ants myAntsDeath= new Ants();
				listDeath.add((Ants) myAntsDeath);
			}
		}
	}
		
	public static void Show() {
		System.out.println("nbr of Queens : " + listQueen.size());
		System.out.println(listQueen);
	}
}
