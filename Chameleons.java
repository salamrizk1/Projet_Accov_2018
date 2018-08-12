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
manger();
entrainer();
AllerAlAgora();
Mutation();
		}
	}
}
	}
