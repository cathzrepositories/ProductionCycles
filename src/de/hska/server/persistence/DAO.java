package de.hska.server.persistence;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;
import com.googlecode.objectify.helper.DAOBase;

import de.hska.domain.Teil;

public class DAO extends DAOBase
{
    static {
        ObjectifyService.register(Teil.class);
        System.out.println("domain classes registered!");
    }
    
    Objectify ofy = ObjectifyService.begin();

    public List<Teil> getAllTeil()
    {
    	Query<Teil> teilQuery = ofy.query(Teil.class);
    	return teilQuery.list();   	
    }
    
    public void deleteAllTeil(List<Teil> teile)
    {
    	ArrayList<Long> keys = new ArrayList<Long>();
    	for(Teil t:teile) {
    		keys.add(t.getKey());
    	}
    	
    	ofy.delete(keys);
    }
    
    public List<Teil> createAllTeil(List<Teil> teile)
    {
    	//ofy.put();
    	
		return null;
    	
    }

    
}
