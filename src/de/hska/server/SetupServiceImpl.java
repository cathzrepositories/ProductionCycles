package de.hska.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hska.client.remote.SetupService;
import de.hska.domain.Teil;
import de.hska.server.persistence.DAO;


/*
 * Dieser Service initialisiert die Spieldaten
 * Er löscht alle vorhandenen Einträge in der Datenbank
 * und schreibt neue Beispielwerte hinein (=Stammdaten)
 * 
 */
@SuppressWarnings("serial")
public class SetupServiceImpl extends RemoteServiceServlet implements
	SetupService{

	public Teil setupService() throws IllegalArgumentException {
		DAO dao = new DAO();
		
		
		//Alle bestehenden Teile holen		
		List<Teil> teile = dao.getAllTeil();
		//Und löschen
	    if (teile.size()>0) {
	    	dao.deleteTeil(teile);
	    }  
		
	    //Neuen Teile erstellen
	    List<Teil> teile_new = new ArrayList<Teil>();

		//Alle Teile werden initialisiert
	    teile_new.add(new Teil(1, "P", "Kinderfahrrad", null, null, null, null, null));
	    teile_new.add(new Teil(2, "P", "Damenfahrrad", null, null, null, null, null));
	    teile_new.add(new Teil(3, "P", "Herrenrad", null, null, null, null, null));
		//Teile persistieren
	    dao.createTeil(teile);
		
		
	    //Test	
	    teile = null;
	    teile = dao.getAllTeil();
		for (Teil t: teile) {
		    System.out.println(t.toString());
		}
		
		return teile.get(0);
	}

}
