public class France extends Recettes implements Recette{
	public France(String nom,String[] li, String[] lo, int tn, String[] et,int diff, int nb) throws IntervalException {
		super(nom,"France",li,lo,tn,et,diff,nb);
	}
	
	public Recettes clone(Recettes reclo) throws IntervalException{
		return new France(reclo.getNom(),reclo.listeIngredients,reclo.listeOutils,reclo.getTemps(),reclo.getEtapes(),reclo.getDifficulte(),reclo.getNbPersonne());
	}
	
	public String toString() {
		System.out.println("------------------------");
		String s="Voila une recette riche qui rappelle les berets et les mimes, une recette qui nous fait voyager en France !\n C'est "+getNom()+"\n";
		s+="Cette recette est de difficulte "+getDifficulte()+" \n elle prend "+getTemps()+" minutes � faire. Elle est fait pour "+getNbPersonne()+" personnes\n";
		return s;
		
	}
}