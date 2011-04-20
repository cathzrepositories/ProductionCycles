package de.hska.server.persistence;

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
    
    public void deleteTeil(List<Teil> teile)
    {
    	ofy.delete(teile);
    }
    public void deleteTeil(Teil teil)
    {
    	ofy.delete(teil.getKey());
    }
    
    
    public void createTeil(Teil t)
    {
    	ofy.put(t);
    }
    public void createTeil(List<Teil> t)
    {
    	ofy.put(t);
    }
    
    public void updateTeil(Teil t)
    {
    	ofy.put(t);
    }
    

    
}
