package de.hska.server;

import java.util.ArrayList;
import java.util.List;


import com.google.appengine.api.datastore.QueryResultIterable;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

import de.hska.client.SetupService;
import de.hska.domain.Teil;


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
		//Das gehört eigentlich wo anderst hin....init oder so
		ObjectifyService.register(Teil.class);
		
		
		Objectify ofy = ObjectifyService.begin();
		//Alle bestehenden Teile holen		
		Query<Teil> teilQuery = ofy.query(Teil.class);
		//Und löschen
	    if (teilQuery.count()>0) {
	    	System.out.println("Yeah it's not empty");
	    	QueryResultIterable<Key<Teil>> keys = teilQuery.fetchKeys();
	    	ofy.delete(keys);
	    }  
		
	    //Neuen Teile erstellen
	    List<Teil> teile_new = new ArrayList<Teil>();

		//Alle Teile werden initialisiert
	    teile_new.add(new Teil(1, "P", "Kinderfahrrad", null, null, null, null, null));
	    teile_new.add(new Teil(2, "P", "Damenfahrrad", null, null, null, null, null));
	    teile_new.add(new Teil(3, "P", "Herrenrad", null, null, null, null, null));
		//Teile persistieren
		ofy.put(teile_new);
		
		
	    //Test	
		teilQuery = ofy.query(Teil.class);
		for (Teil t: teilQuery) {
		    System.out.println(t.toString());
		}
		
		return teilQuery.list().get(0);
	}

}
