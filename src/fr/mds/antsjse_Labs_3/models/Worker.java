package fr.mds.antsjse_Labs_3.models;

import java.util.ListIterator;

public class Worker extends Ants {

	public Worker(int id, int age, int maxAge) {
		super(id, age, maxAge);
		
	}

	public Worker() {
	}

	@Override
	public String toString() {
		return "Worker: " + super.toString() + "]";
	}
	
	public static void Add(int nbr) {
		for (int i = 0; i < nbr; i++) {
			Ants myAntsWorker = new Worker(i, 0, 20);
			listWorker.add((Worker) myAntsWorker);
		}
	}
	
	public static void ChangeDay(int nbr) {
		int nbrOfDeath = 0;
		for (Worker nbrMale : listWorker) {
			nbrMale.setAge(nbrMale.getAge() + nbr);

		}
		
		for (int i = 0; i < nbr; i++) {
			
			ListIterator<Worker> it = listWorker.listIterator();
			while (it.hasNext()) {
				Ants v = it.next();
				if (v.getAge() >= v.getMaxAge()) {
					System.out.println("Worker Died");
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
		System.out.println("nbr of Workers : " + listWorker.size());
		System.out.println(listWorker);
	}

}
