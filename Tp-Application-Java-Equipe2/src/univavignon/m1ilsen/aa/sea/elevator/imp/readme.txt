
Nous avons impl�menter plusieurs classes qui sont les suivantes : 
	
	->Elevator :  elle correspond � l'ascenseur, elle contient en param�tre le temps d'ouverture des portes, le temps de fermeture
					et le temps d'attente pour que les utilisateurs puissent l'utiliser.
	
	-> Sensor : elle corespond au capteur qui permettront de d�tecter la passage ou la pr�sence de l'ascenseur.
	
	->Engine : elle correspond au moteur qui permet de d�placer l'ascenseur. il poss�de une vitesse actuelle "speed" 
				et une vitesse de d�placement qui sera recup�rer du settingfile "movingSpeed".
	
	->shaftcage : elle  contient l'ascenceur, les capteur , et le moteur .
				
					Elle contient aussi la fonction "trigger" qui impl�mente l'interface Event du s�quenceur. 
					le trigger sera aussi charg� de notifier au controle syst�me son �tat et sa position.
					
	nous avons aussi cr�er le fichier settingfile en xml et le parser correspondant qui est impl�ment� dans la classe
	ElevatorFactory.
	
	
	
	
	bonne fin de soir�e chers int�grateurs et j'esp�re ce texte vous aidera � mieux comprendre notre travail.  