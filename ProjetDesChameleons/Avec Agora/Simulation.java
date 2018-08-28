package ProjetDesChameleons;

public class Simulation{

	static Couleur[] Couleurs =
		{Couleur.JAUNE,
			Couleur.BLEU,
			Couleur.ROUGE,
			Couleur.BLEU,
			Couleur.JAUNE,
			Couleur.BLEU
		} ;

	static Chameleons[] chameleon = new Chameleons[Couleurs.length];

	public static void main(String args []){
		Agora monAgora = new Agora();

		for ( int i =0; i<Couleurs.length; i++){
			chameleon[i] =
				new Chameleons( monAgora, new IdChameleon(i), Couleurs[i] );
		}
		for ( int i =0; i<Couleurs.length; i++){
			chameleon[i].start ();
		}
	}
}