public class Couleur {
	public int CouleurInterne ;

	private static final int IntBleu = 0;
	private static final int IntRouge = 1;
	private static final int IntJaune = 2;
	
	public static final Couleur BLEU = new Couleur(IntBleu);
	public static final Couleur ROUGE = new Couleur(IntRouge);
	public static final Couleur JAUNE = new Couleur(IntJaune);

	private Couleur(int valeur) { CouleurInterne = valeur % 3;}

	public Couleur CouleurComplementaire(Couleur C){
		if ( CouleurInterne == C. CouleurInterne )
			return new Couleur(CouleurInterne);
		else
	return new Couleur( 3 - CouleurInterne -	C.CouleurInterne);
	}
			public String toString (){
				if ( CouleurInterne == IntBleu )
					return ”bleu”;
			else if (IntBleu == IntRouge )
				return ”rouge”;
			else
				return ”jaune”;
	}
}