
Nous avons implémenter plusieurs classes qui sont les suivantes : 
	
	->Elevator :  elle correspond à l'ascenseur, elle contient en paramètre le temps d'ouverture des portes, le temps de fermeture
					et le temps d'attente pour que les utilisateurs puissent l'utiliser.
	
	-> Sensor : elle corespond au capteur qui permettront de détecter la passage ou la présence de l'ascenseur.
	
	->Engine : elle correspond au moteur qui permet de déplacer l'ascenseur. il possède une vitesse actuelle "speed" 
				et une vitesse de déplacement qui sera recupérer du settingfile "movingSpeed".
	
	->shaftcage : elle  contient l'ascenceur, les capteur , et le moteur .
				
					Elle contient aussi la fonction "trigger" qui implémente l'interface Event du séquenceur. 
					le trigger sera aussi chargé de notifier au controle systéme son état et sa position.
					
	nous avons aussi créer le fichier settingfile en xml et le parser correspondant qui est implémenté dans la classe
	ElevatorFactory.
	
	
	
	
	bonne fin de soirée chers intégrateurs et j'espère ce texte vous aidera à mieux comprendre notre travail.  