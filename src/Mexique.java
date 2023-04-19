public class Mexique extends Recettes implements Recette{
	public Mexique(String nom,String[] li, String[] lo, int tn, String[] et,int diff, int nb) throws IntervalException {
		super(nom,"Mexique",li,lo,tn,et,diff,nb);
	}
	
	public Recettes clone(Recettes reclo) throws IntervalException{
		return new Mexique(reclo.getNom(),reclo.listeIngredients,reclo.listeOutils,reclo.getTemps(),reclo.getEtapes(),reclo.getDifficulte(),reclo.getNbPersonne());
	}
	
	public String toString() {
		System.out.println("------------------------");
		String s="Voila une recette coloree et qui sent la fete, une recette qui nous fait voyager au Mexique !\n C'est "+getNom()+"\n";
		s+="Cette recette est de difficulte "+getDifficulte()+", prend "+getTemps()+" minutes � faire. et est faite pour "+getNbPersonne()+" personnes\n";
		return s;
		
	}
}