package de.hska.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hska.domain.Teil;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface SetupServiceAsync {
	void setupService(AsyncCallback<Teil> callback)
			throws IllegalArgumentException;
}
