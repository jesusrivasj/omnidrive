package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.OAuthToken;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OAuthServiceAsync {
	
	void getAuthUrl(String service, AsyncCallback<String> callback);
	
	void getToken(String service, String code, AsyncCallback<OAuthToken> callback)
			throws IllegalArgumentException;
	
	void refreshToken(String service, String refreshToken, AsyncCallback<OAuthToken> callback)
			throws IllegalArgumentException;
}
