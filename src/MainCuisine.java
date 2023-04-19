import java.util.ArrayList;

public class MainCuisine {
	public static void main(String[] args) throws IntervalException {
		ContenantRecettes.recettePackBasique();
		String paysVoulu = "France";
		String alimentVoulu = "Persil";
		ArrayList<Recettes> liste = new ArrayList<Recettes>();
		Recettes laRecette; 
		
		if(paysVoulu == null && alimentVoulu == null) {
			liste=ContenantRecettes.getListe();
		}
		
		else if(paysVoulu == null) {
			liste=ContenantRecettes.getListeFonctionIngredient(alimentVoulu);
		}
		
		else if(alimentVoulu == null) {
			liste=ContenantRecettes.getListeFonctionPays(paysVoulu);
		}
		
		else {
			liste=ContenantRecettes.getListeFonctionIngredientEtPays(paysVoulu, alimentVoulu);
		}
		
		if(liste.size() == 0) {
			System.out.println("Erreur, aucune recette trouvée avec les élements spécifiés. Veuillez recommencer.");
			return;
		}
		else if(liste.size() > 1) {
			int nb = (int)(Math.random()*liste.size());
			laRecette = liste.get(nb);
		}
		else {
			laRecette = liste.get(0);
		}
		
		
		System.out.println(laRecette.toString());
		System.out.println("\nListe des ingredients:");
		laRecette.afficherListeIngredients();
		System.out.println("\nListe des outils:");
		laRecette.afficherListeOutils();
		System.out.println("\nListe des etapes: ");
		laRecette.afficherLesEtapes();
	}
}