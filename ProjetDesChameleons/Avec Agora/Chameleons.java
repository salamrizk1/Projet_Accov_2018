package ProjetDesChameleons;

import java.awt.Font;

/**
 * Represente les cameleons qui demandent les mutations
 * un thread pour chaque cameleon
 * un cameleon est identifie par un "id", un "couleur", et l'agora dans lequelle doit muter 
 * 
 * @author Salam
 */

public class Chameleons extends Thread{
	private Agora agora;
	private IdChameleon id;
	private Couleur maCouleur, autreCouleur;

	private Chameleons(Agora a, IdChameleon id, Couleur c){
		this.agora = a;
		this.id = id;
		this.maCouleur = c;
	}
	private void Message (String message){
		System.out.println("(" + id.toString() + ") Je suis" + maCouleur.toString() + " et " + message);
	}
	private void manger(){
		Message("Je suis en train de manger");
	}
	private void entrainer(){
		Message("Je suis en train de m'entrainer");
	}
	private void AllerAlAgora(){
		Message("Je vais à l'Agora");
	}
	private void Mutation(){
		Message("Je veux faire une mutation");
		autreCouleur = Agora.Cooperation(id, maCouleur);
		maCouleur = maCouleur.CouleurComplementaire(autreCouleur);
		Message("J'ai fait une mutation");
	}
	public void run(){
		while(true){
			try{
			
			manger();
	    		TimeUnit.SECONDS.sleep(Simulation.timeOutInSeconds) ;

			entrainer();
			TimeUnit.SECONDS.sleep(Simulation.timeOutInSeconds) ;

			AllerAlAgora();
			TimeUnit.SECONDS.sleep(Simulation.timeOutInSeconds) ;

			Mutation();
			TimeUnit.SECONDS.sleep(Simulation.timeOutInSeconds) ;

			}
		catch (InterruptedException ex) {
                Logger.getLogger(Cameleon.class.getName()).log(Level.SEVERE, null, ex);
            }
		}
	}
}
