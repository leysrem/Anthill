package fr.mds.antsjse_Labs_3.models;

import java.util.ListIterator;

public class Larva extends Ants {

	public Larva(int id, int age, int maxAge) {
		super(id, age, maxAge);

	}

	public Larva() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Larva: " + super.toString() + "]";
	}

	public static void Add(int nbr) {
		for (int i = 0; i < nbr; i++) {
			Ants myAntsLarva = new Larva(i, 0, 10);
			listLarva.add((Larva) myAntsLarva);
		}

	}

	public static void Show() {
		System.out.println("nbr of Larvae : " + listLarva.size());
		System.out.println(listLarva);
	}

	public static void ChangeDay(int nbr) {
		int nbrNewBirth = 0;
		int nbrOfDeath = 0;
		for (Larva nbrLarva : listLarva) {
			nbrLarva.setAge(nbrLarva.getAge() + nbr);
			
		}
		
		for (int i = 0; i < nbr; i++) {
			ListIterator<Larva> it = listLarva.listIterator();
			while (it.hasNext()) {
				Ants v = it.next();
				if (v.getAge() >= v.getMaxAge()) {
					it.remove();
					nbrOfDeath++;
					if (Ants.twoChance20(nbr) == true) {
						nbrNewBirth++;
						System.out.println("Larva à eclos");
						if (Ants.oneChance20(nbr) == true) {
							System.out.println("Nouvelle Queen ");
							listQueen.add(new Queen(0,0,50));
						} else if (Ants.BeMale(nbr) == true)  {
							System.out.println("Nouveau Male ");
							listMale.add(new Male(0,0,20));
						} else  {
							System.out.println("Nouveau Worker ");
							listWorker.add(new Worker(0,0,50));
						}
					}
				}
			}
			Ants myAntsAgeAnthill= new Ants();
			listAgeAnthill.add((Ants) myAntsAgeAnthill);
		}
		for (int k = 0; k < nbrOfDeath; k++) {
			Ants myAntsDeath= new Ants();
			listDeath.add((Ants) myAntsDeath);
		}
		
		for (int j = 0; j < nbrNewBirth; j++) {
			Ants myAntsNewBirth= new Ants();
			listNewBirth.add((Ants) myAntsNewBirth);
		}

	}

}
