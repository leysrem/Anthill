package fr.mds.antsjse_Labs_3.models;

import java.util.ListIterator;

public class Male extends Ants {
	
	
	

	public Male(int id, int age, int maxAge) {
		super(id, age, maxAge);
		
	}
	
	

	public Male() {
		
	}

	@Override
	public String toString() {
		return "Male: " + super.toString() + "]";
	}
	
	public static void Add(int nbr) {
		for (int i = 0; i < nbr; i++) {
			Ants myAntsMale = new Male(i, 0, 20);
			listMale.add((Male) myAntsMale);
		}
	}
	
	public static void ChangeDay(int nbr) {
		int nbrOfDeath = 0;
		for (Male nbrMale : listMale) {
			nbrMale.setAge(nbrMale.getAge() + nbr);

		}
		
		for (int i = 0; i < nbr; i++) {
			
			ListIterator<Male> it = listMale.listIterator();
			while (it.hasNext()) {
				Ants v = it.next();
				if (v.getAge() >= v.getMaxAge()) {
					System.out.println("Male Died");
					it.remove();
					nbrOfDeath++;
				}
			}
		}
		
		for (int k = 0; k < nbrOfDeath; k++) {
			Ants myAntsDeath= new Ants();
			listDeath.add((Ants) myAntsDeath);
		}
		
	}
		
	public static void Show() {
		System.out.println("nbr of Males : " + listMale.size());
		System.out.println(listMale);
	}



}
