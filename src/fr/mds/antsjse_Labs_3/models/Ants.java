package fr.mds.antsjse_Labs_3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ants {
	private int id;
	private int age;
	private int maxAge;
	public static List<Ants> listAgeAnthill = new ArrayList<Ants>();
	public static List<Ants> listNewBirth = new ArrayList<Ants>();
	public static List<Ants> listDeath = new ArrayList<Ants>();
	public static List<Larva> listLarva = new ArrayList<Larva>();
	public static List<Male> listMale= new ArrayList<Male>();
	public static List<Worker> listWorker= new ArrayList<Worker>();
	public static List<Queen> listQueen= new ArrayList<Queen>();
	
	public Ants() {
	}

	public Ants(int id, int age, int maxAge) {
		super();
		this.id = id;
		this.age = age;
		this.maxAge = maxAge;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "Ants [id=" + id + ", age=" + age + ", maxAge=" + maxAge + "]";
	}
	
	public static void AddAll() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "Veuillez saisir le nombre de Larves : " );
        int nbrLarva = scanner.nextInt(); 
        Larva.Add(nbrLarva);
		
        System.out.print( "Veuillez saisir le nombre de Males : " );
        int nbrMale = scanner.nextInt();
        Male.Add(nbrMale);
		
        System.out.print( "Veuillez saisir le nombre de Workers : " );
        int nbrWorker = scanner.nextInt();
        Worker.Add(nbrWorker);
        
        System.out.print( "Veuillez saisir le nombre de Queens : " );
        int nbrQueen = scanner.nextInt();
        Queen.Add(nbrQueen);
		
	}
	
	public static boolean oneChance20(int nbr) {	
		boolean val = false;
		
			for (int i = 0; i < nbr ; i++) {
				if ( val = new Random().nextInt(20)==0) {
					
					val = true;
					break;
				}
		}
			return val;	
	}
	
	public static boolean twoChance20(int nbr) {	
		boolean val = false;
		boolean val2 = false;
		
		for (int i = 0; i < nbr ; i++) {
			
			if ( val = new Random().nextInt(20) == 0 || (val2 = new Random().nextInt(20) == 0)) {
				val = true;
				break;
			}
		}
			return val;	
	}
	
	public static boolean BeMale(int nbr) {
		boolean val = false;
		
		for (int i = 0; i < nbr ; i++) {
			if ( val = new Random().nextInt(2)==0) {
				
				val = true;
				break;
			}
	}
		return val;
	}
	
	public static void showAll() {
		int popolationTotale = listLarva.size() + listMale.size() + listWorker.size() +listQueen.size();
		System.out.println("Population totale : "+popolationTotale);
		Larva.Show();
		Male.Show();
		Worker.Show();
		Queen.Show();
	}
	
	public static void NewBirth() {
		System.out.println("nombre de nouveau née pendant le skip : "+listNewBirth.size());
		
		listNewBirth.removeAll(listNewBirth);
	}
	
	public static void NewDeath() {
		System.out.println("nombre de morts pendant le skip : "+listDeath.size());
		
		listDeath.removeAll(listDeath);
	}
	
	public static void ageOfAnthill() {
		System.out.println("age of Anthill : "+listAgeAnthill.size());
	}
	
}
