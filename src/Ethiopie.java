public class Ethiopie extends Recettes implements Recette{
	public Ethiopie(String nom,String[] li, String[] lo, int tn, String[] et,int diff, int nb) throws IntervalException {
		super(nom,"Ethiopie",li,lo,tn,et,diff,nb);
	}
	
	public Recettes clone(Recettes reclo) throws IntervalException{
		return new Ethiopie(reclo.getNom(),reclo.listeIngredients,reclo.listeOutils,reclo.getTemps(),reclo.getEtapes(),reclo.getDifficulte(),reclo.getNbPersonne());
	}
	
	public String toString() {
		System.out.println("------------------------");
		String s="Voila une recette de guerrier, une recette qui nous fait voyager en Ethiopie !\n C'est "+getNom()+"\n";
		s+="Cette recette est de difficulte "+getDifficulte()+", prend "+getTemps()+" minutes � faire. et est faite pour "+getNbPersonne()+" personnes\n";
		return s;
		
	}
}