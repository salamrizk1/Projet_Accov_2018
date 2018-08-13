package ProjetDesChameleons;

public class Agora{
	private Couleur ACouleur, BCouleur;
	private boolean premierAppel = true;
	private boolean doitAtendre = false;

	public synchronized Couleur Cooperation(IdChameleon x, Couleur C){
		Couleur resultat ;

		while (doitAtendre)
			try{wait ();} catch( InterruptedException e) {}
		}
		if ( premierAppel ){
			ACouleur = C;
			premierAppel = false ;
			while ( ! premierAppel ){
				try{wait ();} catch( InterruptedException e) {}
			}
			doitAtendre = false ;
			resultat = BCouleur;
			notifyAll ();
		}
		else{
			BCouleur = C;
			resultat = ACouleur;
			premierAppel = true;
			doitAtendre = true;
			notifyAll ();
		}
		return resultat ; 
	}
}