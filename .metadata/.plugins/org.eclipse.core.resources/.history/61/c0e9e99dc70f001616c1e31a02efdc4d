package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.OAuthToken;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OAuthServiceAsync {
	
	void getAuthUrl(AsyncCallback<String> callback);
	
	void getToken(String service, String code, AsyncCallback<OAuthToken> callback)
			throws IllegalArgumentException;
}
