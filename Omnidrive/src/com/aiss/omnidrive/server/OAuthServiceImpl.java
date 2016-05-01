package com.aiss.omnidrive.server;

import com.aiss.omnidrive.client.rpc.OAuthService;
import com.aiss.omnidrive.server.resources.OAuthResource;
import com.aiss.omnidrive.shared.OAuthToken;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class OAuthServiceImpl extends RemoteServiceServlet implements OAuthService {

	public String getAuthUrl(){
		return OAuthResource.getAuthUrl();
	}
	
	public OAuthToken getToken(String service,String code){
		OAuthToken token;
		
		token = null;
		
		if (service == "drive"){
			token = OAuthResource.getDriveToken(code);
		} else if (service == "onedrive") {
			
		} else if (service == "dropbox") {
			
		}
		
		return token;
	}
	
}