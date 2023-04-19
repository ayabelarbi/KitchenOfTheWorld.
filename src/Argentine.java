public class Argentine extends Recettes implements Recette{
	public Argentine(String nom,String[] li, String[] lo, int tn, String[] et,int diff, int nb) throws IntervalException {
		super(nom,"Argentine",li,lo,tn,et,diff,nb);
	}
	
	public Recettes clone(Recettes reclo) throws IntervalException{
		return new Argentine(reclo.getNom(),reclo.listeIngredients,reclo.listeOutils,reclo.getTemps(),reclo.getEtapes(),reclo.getDifficulte(),reclo.getNbPersonne());
	}
	public String toString() {
		System.out.println("------------------------");
		String s="Voila une recette qui sent la plage et le football, une recette qui nous fait voyager en Argentine !\n C'est "+getNom()+"\n";
		s+="Cette recette est de difficulte "+getDifficulte()+", prend "+getTemps()+" minutes à faire. et est faite pour "+getNbPersonne()+" personnes\n";
		return s;
		
	}
}