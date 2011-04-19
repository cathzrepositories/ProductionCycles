package de.hska.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hska.domain.Teil;

@RemoteServiceRelativePath("setup")
public interface SetupService extends RemoteService {
	Teil setupService() throws IllegalArgumentException;
}
