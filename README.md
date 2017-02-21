# coursWebServices
page perso du prof : http://mahdi.zargayouna.free.fr/MIAGEIF
#rmi

#rmiEvolue
- L'interface doit etre dans le coté client et le coté serveur
- Creer le stub coté serveur rmic nom_de_la_classe_qui_implemente_l'interface
- Le client doit recevoir une instance de ce stub (lookup en var primitive)
 1- Gestionnaire de sécurité du coté client : System.setSecurityManager(new RMISecurityManager());
 2- Définir une stragtègie de sécurité, un fichier pour définir une politique de sec security.policy et faire : System.setProperty("java.security.policy", "security.policy");    ce niveau, le client ne voit pas le codebase
 3- Définir un "codebase" ou rechercher le .class du stub : String codeBase = "file:///users/nianse15/Bureau/rmiEvolue/Server/";
		    System.setProperty("java.rmi.server.codebase", codeBase);
