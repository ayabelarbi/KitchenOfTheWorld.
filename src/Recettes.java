public abstract class Recettes implements Recette {
	private String nom;
	private String pays;
	protected String[] listeIngredients;
	protected String[] listeOutils;
	private int tempsNecessaire;
	private String[] etapes;
	private static int nbRecettes=0;
	private int difficulte;
	private int nbPersonne;
	
	public Recettes(String nom,String pays,String[] li, String[] lo, int tn, String[] et,int diff, int nb) throws IntervalException{
		this.nom=nom;
		this.pays=pays;
		listeIngredients=li;
		listeOutils=lo;
		etapes=et;
		if(tn<0) {
			throw new IntervalException("Vous ne pouvez pas rentrer un nombre negatif d'etape.");
		}
		if(diff<1) {
			throw new IntervalException("Vous ne pouvez pas rentrer une difficulte inferieure a 1.");
		}
		else if(diff>5) {
			throw new IntervalException("Vous ne pouvez pas rentrer une difficulte superieure a 5.");
		}
		if(nb<0) {
			throw new IntervalException("Vous ne pouvea pas rentrer un nombre negatif de personne.");
		}
		tempsNecessaire=tn;
		difficulte=diff;
		nbPersonne=nb;
		nbRecettes++;
	}

	public void afficherListeIngredients() {
		for(int i=0;i<listeIngredients.length;i++) {
			System.out.println("	Ingredient "+(i+1)+": "+listeIngredients[i]);
		}
	}
	
	public void afficherListeOutils() {
		for(int i=0;i<listeOutils.length;i++) {
			System.out.println("	Outil "+(i+1)+": "+listeOutils[i]);
		}
	}
	
	public void afficherLesEtapes() {
		for(int i=0;i<etapes.length;i++) {
			System.out.println("Etape "+(i+1)+": "+etapes[i]);
		}
	}
	
	public void afficherEtapeSpecifique(int numero) {
		try {
			System.out.println("Etape numero "+numero+": "+etapes[numero-1]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erreur: cette etape n'existe pas");	
		}
	}
	
	public abstract String toString();
	
	public static int getNbRecettes() {
		return nbRecettes;
	}
	
	public String getPays() {
		return pays;
	}
	
	public int getDifficulte() {
		return difficulte;
	}
	
	public int getNbPersonne() {
		return nbPersonne;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getTemps() {
		return tempsNecessaire;
	}
	
	public String[] getEtapes(){
		return etapes;
	}
	
	public boolean chercherIngredient(String ingredient) {
		boolean dedans=false;
		for(int i=0;i<listeIngredients.length;i++) {
			if (listeIngredients[i]==ingredient){
				dedans=true;
			}
		}
		return dedans;
	}
	
	public abstract Recettes clone(Recettes reclo) throws IntervalException;
}