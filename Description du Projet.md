PARADIGME DES "CAM�N�ONS"

Le but du projet est l��tude de la synchronisation dans une relation de pair � pair, en se servant du paradigme des "cam�n�ons".

1. Jeu des cam�n�ons

Le "cam�n�on" est une vari�t� de l�zard qui prend l�une des trois couleurs : bleu, jaune, rouge. Une population est constitu�e de N "cam�n�ons" qui ont un comportement cyclique. C�est un animal qui habituellement vit seul dans la for�t, mange du ch�vrefeuille et s'entra�ne au jeu de maillet. Au bout d'un certain temps, le "cam�n�on" se sent pr�t pour la comp�tition. Il cherche un compagnon de jeu (un autre "cam�n�on" ), puis entre sur un 'mail' ( (dans le midi de la France, le mail est une promenade bord�e d�arbres, o� l�on jouait jadis au jeu de maillet - ou jeu de mail ) ) o� il peut jouer avec ce compagnon et o� une mutation peut se produire. Quand deux "cam�n�ons" se rencontrent, en effet une mutation peut se produire. Si les deux "cam�n�ons" sont de couleurs diff�rentes, ils changent de couleur et prennent la troisi�me couleur, sinon ils ne changent pas de couleur. Il faut donc simuler la vie des "cam�n�ons" et permettre � deux "cam�n�ons" de se rencontrer et de muter sans interf�rer avec les autres "cam�n�ons". On �tudie ainsi l��volution des couleurs d�une population de N "cam�n�ons".

2. Architecture op�rationnelle globale de l�application

Chaque "cam�n�on" sera repr�sent� par un identifiant unique et une couleur. Chaque "cam�n�on" sera repr�sent� par un processus (une t�che). Bien que plusieurs solutions techniques soient envisageables, il est tr�s difficile de d�finir � l'avance laquelle sera la plus pertinente. On �tudiera deux architectures radicalement diff�rentes :

�	La solution de base est d'utiliser une agora, un lieu de rencontre o� les "cam�n�ons" iront lorsqu'ils voudront se rencontrer. Cette agora sera le centre n�vralgique du syst�me et attribuera les rencontres entre "cam�n�ons". Les �changes sont par cons�quent triviaux, un "cam�n�on" ne communiquera qu'avec l'agora. On peut apparenter cela � un r�seau en �toile. Il y a (n) constituants, dont (1) serveur et (n-1) clients qui peuvent s'y connecter tout en ignorant la pr�sence et l'existence des autres clients. Une fois qu�un "cam�n�on" conna�t un partenaire, il continue le dialogue (le jeu de maillet et l��ventuel changement de couleur) sans passer par l�agora. Les rencontres des "cam�n�ons" se font sur l�agora. Le premier arriv� attend un cong�n�re et lorsque celui-ci arrive, chacun des deux "cam�n�ons" apprend le nom et la couleur de son partenaire puis ils peuvent aller jouer sur un 'mail' et �ventuellement changer de couleur. Une fois que le jeu et la mutation sont termin�s, le cam�n�on peut recommencer un nouveau cycle de vie (manger, s�entra�ner, aller au 'mail' et subir une nouvelle mutation). L�agora peut �tre repr�sent�e par un objet actif ou par un objet passif. On pourra aussi repr�senter l�agora comme un lieu de rencontre o� certains "cam�n�ons" attendent des partenaires, et d�autres cherchent des partenaires pour jouer (mod�le P2P dissym�trique) .

�	L'autre solution, beaucoup plus complexe, est de faire se rencontrer deux "cam�n�ons" au hasard. Cela signifie qu'il n'y a pas d'agora pr�d�finie, les "cam�n�ons" vont d'eux-m�mes chercher leur partenaire. C�est une solution r�partie o� un cam�n�on doit pouvoir lancer une demande de rendez-vous et aussi r�pondre � une demande d�autres "cam�n�ons". Bien entendu, la combinatoire de cette solution est beaucoup plus �lev�e, et la validation d'une telle solution beaucoup plus complexe. Notamment pour garantir l�absence d�interblocage (tous sont en �tat d�appel et aucun n�est en �tat de r�pondre) et pour v�rifier la non pr�sence de famine d'un cam�n�on (la solitude �ternelle).
Il vous est demand� de d�velopper les deux solutions
3. Propri�t�s attendues, QOS
Les propri�t�s attendues sont :

�	Respect du rendez vous entre deux cam�n�ons et deux seulement.

�	Pas d�interblocage.

�	Respect de l��quit�.
