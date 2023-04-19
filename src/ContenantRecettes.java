import java.util.ArrayList;

public final class ContenantRecettes {
	
	private static ArrayList<Recettes> listeDesRecettes = new ArrayList<Recettes>();
	
	private ContenantRecettes() {}

	public static ArrayList<Recettes> getListe() {
		return listeDesRecettes;
	}
	
	public static ArrayList<Recettes> getListeFonctionPays(String pays){
		ArrayList<Recettes> nListe=new ArrayList<Recettes>();
		for(int i=0;i<listeDesRecettes.size();i++) {
			if (listeDesRecettes.get(i).getPays()==pays) {
				nListe.add(listeDesRecettes.get(i));
			}
		}
		return nListe;
	}
	
	public static ArrayList<Recettes> getListeFonctionIngredient(String ingredient){
		ArrayList<Recettes> nListe=new ArrayList<Recettes>();
		for(int i=0;i<listeDesRecettes.size();i++) {
			if (listeDesRecettes.get(i).chercherIngredient(ingredient)) {
				nListe.add(listeDesRecettes.get(i));
			}
		}
		return nListe;
	}
	
	public static ArrayList<Recettes> getListeFonctionIngredientEtPays(String pays, String ingredient){
		ArrayList<Recettes> nListe =new ArrayList<Recettes>();
		ArrayList<Recettes> listeP =getListeFonctionPays(pays);
		ArrayList<Recettes> listeI =getListeFonctionIngredient(ingredient);
		for(int i=0;i<listeP.size();i++) {
			for(int j=0;j<listeI.size();j++) {
				if(listeP.get(i)==listeI.get(j)) {
					nListe.add(listeP.get(i));
					break;
				}
			}
		}
		return nListe;
	}
	
	public static void ajouterRecette(Recettes ... r) {
		for(Recettes rec : r) {
			listeDesRecettes.add(rec);
		}
	}
	
	
	public static void recettePackBasique() throws IntervalException {
		//1ère recette Mexique
		String[] im1 = {"(3)tomates", "1oignon","2ail", "1piment", "1Sel","1Poivre", "4tortillas", "(4)œufs","(60g)fromage ", "1coriandre","400gharicots ", "1avocat", "Huile "};
		String[] om1 = {"Mixeur", "Casserole"};
		String[] em1 = {"1. Dans un mixeur, melangez les tomates, le poivron, l’oignon frais et l’ail jusqu’à obtenir une sauce onctueuse. Dans une casserole, faites chauffer un peu d’huile et faites cuire la sauce à feu moyen-doux pendant environ 15 minutes, en remuant regulierement. Assaisonner avec du sel et du poivre. Remuez bien.\n",
				"2. Dans une poele a frire, faites chauffer 4 cuilleres a soupe d’huile a feu moyen. Faites frire les tortillas pendant une minute de chaque cote.\n",
				"3. Dans une autre poele, faites chauffer 6 cuilleres a soupe d’huile d’olive et faites frire les œufs entiers (cote jaune vers le haut). Assaisonner avec du sel et du poivre.\n"};
		Mexique m1 = new Mexique("Huevos rancheros (oeufs campagnards)",im1,om1,60,em1,3,2);
		
		//2ème recette Mexique
		String[] im2 = {"Nachos de mais frits", "Cheddar", "Piment"};
		String[] om2 = {"four"};
		String[] em2 = {"1. Disposez d’abord les chips de tortilla sur une plaque de cuisson, sans les superposer, afin que le fromage, qui sera rape sur le dessus, fonde correctement.\n",
				"2. Raper beaucoup de fromage sur chaque totopo, pour ne pas trouver de Nachos sans fromage, et placer une tranche de jalapeno marine sur le dessus.\n",
				"3. Faites cuire les nachos à environ 200º C jusqu’à ce que le fromage soit complètement fondu et que les pointes des nachos prennent une teinte brune.\n"};
		Mexique m2 = new Mexique("Nachos Traditionnels",im2,om2,10,em2,1,1);
		
		//3ème recette Mexique
		String[] im3 = {"(20g)Maizena", "(120g)Noix de coco rapee", "(100g)Sucre","(4)Oeufs","(160g)Creme fraiche epaisse"};
		String[] om3 = {"four", "saladier", "mixeur"};
		String[] em3 = {"1. Prechauffez le four a th 6/7 (200°C.)\n",
				"2. Dans un saladier, melangez la noix de coco, et le sucre. Ajoutez la Maizena, la creme fraiche et terminez par les jaunes d’œufs. Melangez longuement.\n",
				"3. Montez les blancs en neige et incorporez les a la preparation avec 100 g de [noix de coco] rapee.\n",
				"4. Repartissez la preparation dans des moules individuels et enfournez pour 30 min.\n",
				"5. Saupoudrez du reste de coco et degustez."};
		Mexique m3 = new Mexique("Dessert à la noix de coco", im3,om3,40,em3,2,3);
		
		//1ère recette Argentine
		String[] ia1 = {"4 aubergines", "3 oignons","5 tomates", "300 grammes de mozzarella", "3  ail","1 Huile d’olive", "Sel", "poivre", "Origan"};
		String[] oa1 = {"Four"};
		String[] ea1 = {"1. Prechauffer votre four à 180 degres. A present, coupez en tranche d’un centimetre vos aubergines et vos tomates, emincez finement vos oignons, et hachez l’ail.\n",
				"2. Faire suer dans une casserole les oignons tailles avec l’ail hache dans un peu d’huile d’olive. Assaisonnez, et laissez cuire 3 à 4 minutes. Lorsque les oignons deviennent translucides, c’est alors pret ; reservez pour la suite de la recette\n",
		 		"3. Ensuite, faites sauter quelques minutes vos tranches d’aubergine en les assaisonnant bien. Cela va permettre de gagner beaucoup de temps en cuisson, et de garantir des aubergines tendres et juteuses. Lorsqu’elles commencent à devenir plus souple (sans etre totalement cuites), disposez-les dans un plat allant au four en alternant tranches de tomates et d’aubergines, sur le meme principe que le tian de legumes.\n",
				"4. Disposez un peu du melange ail et oignon, assaisonnez à nouveau ( sel, poivre et origan ) et realisez de nouveau ce procede jusqu’à ne plus avoir de tranches de tomates et d’aubergines. Enfin, saupoudrez votre tian de mozzarella rapee ainsi que d’origan\n",
				"5. Il ne reste plus qu’a enfourner a four chaud a 180°C durant une trentaine de minutes"};
		Argentine a1 = new Argentine("Cazuela de Berenjenas (Gratin d'aubregine)",ia1,oa1,65,ea1,3,6);
		
		//2ème recette Argentine
		String[] ia2 = {"1 peche", "1 banane ","400g ananas", "eau"};
		String[] oa2 = {"four"};
		String[] ea2 = {"1. Dans la cuve de votre mixeur, mettez tout d’abord, la peche coupee en morceaux (sans la peau ni le noyau) si vous avez du mal à l’eplucher\n",
				"2. plongez-la 20 secondes dans une eau bouillante puis sortez-la et refroidissez-la rapidement. Il est bien plus simple à présent de retirer la peau.\n",
				"3. Ajoutez ensuite votre banane tranchee ainsi que vos cubes d’ananas, puis mixez le tout. Si besoin, ajoutez un peu d’eau.\n"};
		Argentine a2 = new Argentine("Smoothie anana groove",ia2,oa2,10,ea2,1,2);
		
		//3ème recette Argentine
		String[] ia3 = {"125g beurre", "75g sucre ","1 oeuf", "1 Vanille", "150g maïzena", "80g farine", "1 levure chimique","250g de confiture de lait", "150g de coco"};
		String[] oa3 = {"Balance", "Plaque"};
		String[] ea3 = {"1.Battre le beurre pommade avec le sucre dans un grand saladier.Lorsque vous obtenez une crème bien blanche, ajoutez l’oeuf ainsi que l’essence de vanille.\n",
				"2.Ensuite, tamisez ensemble la maïzena, la farine ainsi que la levure chimique. Mélangez bien et formez une masse lisse puis, filmez-la et laissez-la reposer au frigo durant 2 heures.\n",
				"3. Préchauffez votre four à 180°C\n",
				"4. À présent, étalez la pâte sur 1,5 cm d’épaisseur puis emporte-piècecez la avec des cercles de 5 cm de diamètre.\n",
				"5. Déposez-les sur une plaque allant au four sur du papier sulfurisé, puis enfournez-les durant 8 à 10 minutes.Retirez-les du four puis laissez refroidir.\n",
				"6. À présent, garnissez généreusement vos biscuits de confiture de lait, puis roulez-les dans de la coco râpée.\n"};
		Argentine a3 = new Argentine("Alfajores (Macaron)",ia3,oa3,40,ea3,3,8);
		
		//1ère recette France
		String[] if1= {"1 Oeufs", "1 Pain", "1 sel", "1 poivre", "beurre"};
		String[] of1= {"Plaque"};
		String[] ef1= {"1. Plonger les œufs dans l’eau froide.  Au premier bouillon, attendre 2 minutes et les rafraîchir à l’eau froide.\n",
				"2. Faire bouillir de l’eau puis y plonger délicatement les œufs. Laisser cuire 4 minutes puis les rafraîchir sous l’eau froide.\n",
				"3. Faire bouillir de l’eau et y déposer les œufs.  Couvrir et laisser cuire 5 minutes en dehors du feu\n"};
		France f1 = new France("Oeuf à la coque et ses mouillettes",if1,of1,10,ef1,1,1);
		
		//2ème recette France
		String[] if2= {"1 kg pomme de terre", "800 g de bœuf ", "120 g beurre","15 cl de lait", "2 bouillon de bœuf","2 chapelure","1 oignon","2 échalotes", "1 persil plat", "1sel", "1poivre"};
		String[] of2= {"Plaque","Four"};
		String[] ef2= {"1. Dans un faitout, portez une grande quantité d’eau à ébullition avec du sel, du poivre, le bouquet garni et les tablettes de bouillon. Plongez la viande dans le liquide frémissant et laissez cuire 1 h 30. Laissez refroidir dans le bouillon et égouttez.\n",
				"2. Dans le même temps, pelez et lavez les pommes de terre. Coupez-les en deux et mettez-les dans une casserole, couvrez d’eau froide, salez et portez à ébullition. Comptez alors 20 min de cuisson.\n",
				"3. Égouttez et passez-les au presse-purée. Salez, poivrez, ajoutez 40 g de beurre et le lait, mélangez vigoureusement avec une cuillère en bois.\n",
				"4. Préchauffez le four à th 6 (180°). Pelez et ciselez finement l’oignon et les échalotes.Faites-les revenir 5 min à la poêle avec 20 g de beurre. Rincez, séchez, effeuillez et ciselez le persil.\n",
				"5. Hachez la viande (au hachoir de préférence). Mélangez-la avec le persil et le contenu de la poêle.\n",
				"6. Beurrez un plat à gratin. Répartissez-y la viande. Couvrez de purée, égalisez à la spatule. Striez la surface avec les dents d’une fourchette, parsemez de chapelure et du reste de beurre en parcelles.\n",
				"7. Faites gratiner 30 min au four et servez très chaud avec une salade verte.\n"};
		France f2 = new France("Hachis Parmentier",if2,of2,180,ef2,4,1);
		
		//3ème recette France
		String[] if3 = {"30g Beurre","250g Farine","1pincée Sel","30g Sucre en poudre","4Oeufs","50cl Lait","3cl Huile"};
		String[] of3 = {"Poele"};
		String[] ef3 = {"1. Faites fondre le beurre au micro-ondes.",
				"2. Versez dans un saladier la farine, le sel, le sucre et formez un puits au centre.",
				"3. Mélangez les œufs battus, le lait et le beurre puis versez ce mélange dans la farine. Mélangez au fouet en commençant par le centre puis en allant de plus en plus vers les bords jusqu'à bien mêler tous les ingrédients. Laisser reposer la pâte pendant 1 h.\n",
				"4. Badigeonnez d'huile une poêle antiadhésive chaude et versez-y une louche de pâte à crêpe. Laissez cuire pendant environ 2 min de chaque côté. Recommencez autant de fois que nécessaire pour finir toute la päte.Faites gratiner 30 min au four et servez très chaud.\n"};
		France f3 = new France("Crêpe",if3,of3,30,ef3,1,6);
		
		//1ère recette Canada
		String[] ic1 = {"5 Pomme de terre", "50g sauce barbecue", "30g de gouda"};
		String[] oc1 = {"Poele"};
		String[] ec1 = {"1. Éplucher les pommes de terre et les couper en forme de frites. Faire frire les pommes de terre à 160-170°C et ensuite à 180-190°C durant 2 min.\n",
				"2. De préférence dans un bol pas trop haut (du style bol à pâtes), y mettre les frites, ajouter le fromage en grains et verser la sauce brune chaude.\n"};
		Canada c1 = new Canada("Poutine",ic1,oc1,25,ec1,1,2);

		//2ème recette Canada
		String[] ic2 = {"250g de farine","1 pincée de sel","1cas de sucre","1 sache de vanille","1/2 sachet de levure chimique","40cl de lait","2 oeufs","50g de beurre fondu"};
		String[] oc2 = {"Saladier","cuillière en bois","fouet","louche","poele"};
		String[] ec2 = {"1. Dans un saladier, mélanger farine + sucre + sucre vanillé + levure + sel.",
						"2. Dans un autre récipient, mélanger jaunes d'œufs + lait.",
						"3. Verser ce mélange dans le premier saladier petit à petit afin d’éviter les grumeaux.",
						"4. Ajouter le beurre fondu et bien mélanger.",
						"5. Battre les blancs en neige ferme avec 1 pincée de sel",
						"6. Les incorporer à la préparation délicatement afin de ne pas les casser.",
						"7. Pour la cuisson, à feu très doux : huiler une petite poêle, mettre 1 louche de préparation puis attendre que toute la surface soit couverte de trous et qu’elle paraisse « sèche » et la retourner pour qu’elle cuise de l’autre côté environ 1 minute."};
		Canada c2 = new Canada("Pancakes",ic2,oc2,40,ec2,1,3);
		
		
		//1ère recette Maroc
		String[] ima1 = {"1 concombre", "6 tomate","1 oignon", "1 persil", "1 cumin", "1 huile", "vinaigre","sel", "poivre"};
		String[] oma1 = {"Saladier"};
		String[] ema1 = {"1. Dans un petit saladier, couper les tomates et le concombre en petits morceaux comme sur la photo.\n",
				"2. Hacher l'oignon et le persil et le rajouter au reste, puis mettre le cumin, l'huile, le cumin, le sel et le poivre.\n"};
		Maroc ma1 = new Maroc("Chlada (salade) tomate concombre",ima1,oma1,15,ema1,1,4);
		
		//2ème recette Maroc
		String[] ima2 = {"600 g viande hachée de bœuf","4 oeufs","2 oignons","Persil","6 tomates","2 cuillères à café de cumin","2 cuillères à café de paprika","2 cuillères à café de gingembre","1 gousse d’ail","Sel","Poivre"};
		String[] oma2 = {"Saladier"};
		String[] ema2 = {"1. Ajouter les boulettes de viande hachée, mettez le couvercle du plat à tajine et continuez la cuisson à feu doux durant 10 à 15 minutes. Vous pouvez ensuite casser vos œufs dans votre plat, couvrir et laisser cuire deux à trois minutes. Surveillez-bien pour ne pas que le jaune durcisse et soit coulant à la dégustation ! Ciselez du persil et décorez votre tajine kefta oeuf.\n",
				"2. Ajoutez un oignon haché au préalable, 1 cuillère à café de cumin, de paprika et de gingembre, l'ail pilé et coupez le tomates en quartiers. Faites cuire cette sauce, dans le même plat de tajine kefta oeuf qu'ont cuit les boulettes de viande, 15 minutes à feu doux, tout en remuant de temps en temps avec une cuillère en bois.\n",
				"3. Mettez quelques goutes d'huile d'olive dans votre plat à tajine, faites la chauffer et ajoutez vos boulettes de viande. Faites les dorer juste quelques minutes puis retirez-les du plat\n",
				"4. Pour la réalisation de votre tajine kefta oeuf, commencez par réaliser les boulettes de viande hachée de bœuf. Hachez finement 1 oignons, ajoutez les épices : 1 cuillère à café de cumin, de paprika et de gingembre, du persil. Vous pouvez ajouter de la cannelle si vous aimez bien le goût mais ce n'est pas impératif. Prenez votre viande hachée et mélangez le tout pour que la viande de votre tajine kefta oeuf s'imprègne bien des épices.\n"};
		Maroc ma2 = new Maroc("tajine oeuf kefta",ima2,oma2,15,ema2,1,4);
		
		//1ère recette Ethiopie 
		String[] ie1 = {"3 tasse riz", "200ml d’huile", "500g d’agneau", "1 oignon", "2 c à s de moutarde","1 carotte, pelée et coupée", "4 gousses d’ail émincés","2 pommes de terre, épluchées et coupées","2 feuilles de laurier","2 cubes de bouillon","1 pièce de potiron","Du chou vert haché","3 piments","Du sel et du poivre"};
		String[] oe1 = {"Saladier"};
		String[] ee1 = {"1. Dans un saladier, assaisonnez votre viande en ajoutant un cube de bouillon, du sel et poivre noir. Mélangez. Chauffez de l’huile végétale dans une casserole. Frire la viande en rajoutant la moutarde, l’oignon, l’ail, le poivre noir, un cube de bouillon et 2 feuilles de laurier. Laissez pendant 5 minutes et assurez vous d’obtenir une pâte onctueuse. Ajoutez un demi litre d’eau ainsi que les légumes ( chou, potiron,carottes, pommes de terre, piment) .Faire cuire les légumes à point dans la préparation environ 35 minutes à feu doux.\n",
				"2. Quand ils sont cuits, rétirer les légumes. Ajoutez votre riz préalablement lavé à la préparation. Salez à votre convenance. Faire cuire le riz dans sa sauce et le retournez aussi souvent que vous le pouvez pour ne rien bruler.\n",
				"3. Servez et disposez les légumes\n"};
		Ethiopie e1 = new Ethiopie("Injera (Riz a la viande)",ie1,oe1,60,ee1,4,4);

		//2ème recette Ethiopie 
		String[] ie2 = {"farine de blé noir","2 oignons","600g de boeuf", "safran","paprika","1 tomate","huile d'olive","cumin en poudre"};
		String[] oe2 = {"cocottes"};
		String[] ee2 = {"1. Avec la farine de tef (ou de blé noir), préparez de la pâte à crèpes sans sucre, sans sel. ",
						"2. Pour environ 10/12 crèpes (les crèpes devront être assez épaisses, mais légères.",
						"3. A la cocotte, faire suer a feu doux les oignons émincés et la tomate. Ajoutez 1/2 cuillère à café de cumin et 1/2 cuillère à café de safran + paprika. Ajouter la viande émincée.",
						"4. Possibilité de faire griller (à sec) la viande 30 secondes avant de la mettre en cocotte.",
						"5. Laissez mijoter à feu doux. La viande doit être bien cuite. Salez et poivrez à convenance.",
						"6. Découpez de larges bandes (8/10 cm) dans les crèpes, soit environ 3 bandes par crèpes.",
						"7. Disposez dans chaque assiette 3 bandes de facon a recouvrir l'assiette. Ajoutez dessus la viande (avec oignons, tomate).",
						"8. Sur un bord, disposez un peu de safran de cumin et de paprika. Laissez a disposition de chaque convive une ou deux bandes de crèpe, roulées."};
		Ethiopie e2 = new Ethiopie("Tibs (viande a la sauce)",ie2,oe2,55,ee2,2,4);


		//1ère recette Nepal
		String[] in1 = {"150g de farine complète","140g de farine normal", "1cac de sel","2cas d'huile d'olive", "180ml d'eau chaude"};
		String[] on1 = {"Bol"};
		String[] en1 = {"1. Dans un large saladier, melanger le sel et la farine. Utiliser la cuillères en bois pour ajouter l'huile d'olive et assez d'eau pour faire une pâte qui soit elastique sans être collante\n",
					"2. Pétrir la pâte sur une surface légèrement farinée pendant 5 à 10 minutes jusqu'à ce qu'elle soit lisse. Divisez en 10 morceaux, ou moins si vous voulez des pains plus gros. Rouler chaque morceau en boule. Laisser reposer quelques minutes.\n",
					"3. Faire chauffer une poêle à feu moyen jusqu'à ce qu'elle soit chaude et la graisser légèrement. Sur une surface légèrement farinée, utilisez un rouleau à pâtisserie fariné pour étaler les boules de pâte jusqu'à ce qu'elles soient très fines comme une tortilla.\n",
					"4. Lorsque la poêle commence à fumer, mettez un chapati dessus. Cuire jusqu'à ce que le dessous ait des taches brunes, environ 30 secondes, puis retourner et cuire de l'autre côté. Mettre sur une assiette et garder au chaud pendant que vous faites cuire le reste des chapatis.\n"};
		Nepal n1 = new Nepal("Chapati (Galette)",in1,on1,25,en1,2,2);

		//2ème recette Nepal 
		String[] in2 = {"9 gousses d'ail","50g de gingembre", "2 carottes","2 pommes de terre","250g de riz","huile d'olive","basilic","250g de lentilles vertes","6 oignons","garam masala","poivre,sel","3cas de curry"};
		String[] on2 = {"Bol"};
		String[] en2 = {"Préparation du Dhal. Hacher 2 oignons et 3 gousses d'ail. Ajouter le garam masala, du sel et du poivre.",
					"2.Faire revenir avec de 2 cuillères à soupe d'huile pendant 6 minutes.",
					"3. Ajouter les lentilles et faire revenir le tout pendant 3 minutes.",
					"4. Ajouter 360 g d'eau et faire cuire à feu doux pendant 40 minutes.",
					"5. Préparation du Sak (la verdure). Hacher 2 oignons et 3 gousses d'ail. Saler, poivrer.",
					"6. Faire revenir avec de 2 cuillères à soupe d'huile pendant 6 minutes.",
					"7.Ajouter les épinards et le gingembre râpé. Faire revenir le tout pendant 15 minutes à feu doux.",
					"8. Préparation du Tarkari (le curry de légumes) Hacher 2 oignons et 3 gousses d'ail. Ajouter le curry, du sel et du poivre.",
					"9. Faire revenir avec de 2 cuillères à soupe d'huile pendant 6 minutes.",
					"10. Couper les pommes de terre et les carottes en petits morceaux.",
					"11. Les ajouter et faire revenir le tout pendant 10 minutes.",
					"12. Ajouter 3/4 d'eau et faire cuire à feu doux après ébullition pendant 40 minutes.",
					"13. Préparation du Bhat (le riz). Verser le riz dans 2,5 volumes froide et salée. Porter à ébullition et cuire à feu doux jusqu'à évaporation complète de l'eau."};

		Nepal n2 = new Nepal("Dal Bhat (Riz au lentilles)",in2,on2,150,en2,4,8);


		
		ajouterRecette(m1,m2,m3,a1,a2,a3,f1,f2,f3,c1,c2,ma1,ma2,e1,e2,n1,n2);
	}
}