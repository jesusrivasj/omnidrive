package com.aiss.omnidrive.server.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.restlet.data.CacheDirective;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.aiss.omnidrive.shared.OAuthToken;
import com.aiss.omnidrive.shared.UrlUtils;

public class OAuthResource {
	
	private static final String DRIVE_CLIENT_ID = "251525019809-bttumkqg26s43j01qmcqogrtesvv4cie.apps.googleusercontent.com";
	private static final String DRIVE_CLIENT_SECRET = "Be6LpCB1RshhLyg7wXd8-p4A";
	private static final String ONEDRIVE_CLIENT_ID = "";
	private static final String ONEDRIVE_CLIENT_SECRET = "";
	private static final String DROPBOX_CLIENT_ID = "";
	private static final String DROPBOX_CLIENT_SECRET = "";
	
	
	public static String getDriveAuthUrl(){
		String authUrl; 
		Map<String, String> urlParams;
		
		authUrl = "https://accounts.google.com/o/oauth2/v2/auth";
		urlParams = new HashMap<String, String>();
		
		urlParams.put("response_type", "code");
		urlParams.put("client_id", OAuthResource.DRIVE_CLIENT_ID);
		urlParams.put("redirect_uri", "http://127.0.0.1:8888/");
		urlParams.put("scope", "https://www.googleapis.com/auth/drive");
		urlParams.put("state", "driveAuth");
		urlParams.put("access_type", "offline");
		urlParams.put("prompt", "select_account");
		urlParams.put("include_granted_scopes", "true");
		
		authUrl += UrlUtils.parseParams(urlParams);
		
		return authUrl;
	}
	

	public static String getOnedriveAuthUrl(){
		String authUrl; 
		Map<String, String> urlParams;
		
		authUrl = "https://accounts.google.com/o/oauth2/v2/auth";
		urlParams = new HashMap<String, String>();
		
		urlParams.put("response_type", "code");
		urlParams.put("client_id", OAuthResource.ONEDRIVE_CLIENT_ID);
		urlParams.put("redirect_uri", "http://127.0.0.1:8888/");
		urlParams.put("scope", "https://www.googleapis.com/auth/drive");
		urlParams.put("access_type", "offline");
		urlParams.put("prompt", "select_account");
		urlParams.put("include_granted_scopes", "true");
		
		authUrl += UrlUtils.parseParams(urlParams);
		
		return authUrl;
	}
	

	public static String getDropboxAuthUrl(){
		String authUrl; 
		Map<String, String> urlParams;
		
		authUrl = "https://accounts.google.com/o/oauth2/v2/auth";
		urlParams = new HashMap<String, String>();
		
		urlParams.put("response_type", "code");
		urlParams.put("client_id", OAuthResource.DRIVE_CLIENT_ID);
		urlParams.put("redirect_uri", "http://127.0.0.1:8888/");
		urlParams.put("scope", "https://www.googleapis.com/auth/drive");
		urlParams.put("state", "driveAuth");
		urlParams.put("access_type", "offline");
		urlParams.put("prompt", "select_account");
		urlParams.put("include_granted_scopes", "true");
		
		authUrl += UrlUtils.parseParams(urlParams);
		
		return authUrl;
	}
	
	public static OAuthToken getDriveToken(String code){
		OAuthToken token;
		String authUrl, clientId, clientSecret, grantType, redirectUri;
		
		authUrl = "https://www.googleapis.com/oauth2/v4/token";
		clientId = OAuthResource.DRIVE_CLIENT_ID;
		clientSecret = OAuthResource.DRIVE_CLIENT_SECRET;
		grantType = "authorization_code";
		redirectUri = "http://127.0.0.1:8888/";
		
		token = OAuthResource.getToken(authUrl, clientId, clientSecret, grantType, redirectUri, code);
	
		return token;
	}
	
	public static OAuthToken getOnedriveToken(String code){
		OAuthToken token;
		String authUrl, clientId, clientSecret, grantType, redirectUri;
		
		authUrl = "https://www.googleapis.com/oauth2/v4/token";
		clientId = OAuthResource.DRIVE_CLIENT_ID;
		clientSecret = OAuthResource.DRIVE_CLIENT_SECRET;
		grantType = "authorization_code";
		redirectUri = "http://127.0.0.1:8888/";
		
		token = OAuthResource.getToken(authUrl, clientId, clientSecret, grantType, redirectUri, code);
	
		return token;
	}
	
	public static OAuthToken getDropboxToken(String code){
		OAuthToken token;
		String authUrl, clientId, clientSecret, grantType, redirectUri;
		
		authUrl = "https://www.googleapis.com/oauth2/v4/token";
		clientId = OAuthResource.DRIVE_CLIENT_ID;
		clientSecret = OAuthResource.DRIVE_CLIENT_SECRET;
		grantType = "authorization_code";
		redirectUri = "http://127.0.0.1:8888/";
		
		token = OAuthResource.getToken(authUrl, clientId, clientSecret, grantType, redirectUri, code);
	
		return token;
	}
	
	public static OAuthToken getToken(String authUrl, String clientId, String clientSecret, String grantType, String redirectUri, String code){
		OAuthToken token;
		ClientResource connection;
		Form requestBody;
		List<CacheDirective> cacheDirectives;
				
		cacheDirectives = new ArrayList<CacheDirective>();
		
		requestBody = new Form();
		requestBody.add("code", code);
		requestBody.add("client_id", clientId);
		requestBody.add("client_secret", clientSecret);
		requestBody.add("redirect_uri", redirectUri);
		requestBody.add("grant_type", grantType);
		
		connection = new ClientResource(authUrl);
		
		connection.setMethod(Method.POST);
		connection.accept(MediaType.APPLICATION_JSON);
		connection.setProtocol(Protocol.HTTPS);
		//connection.setHostRef("www.googleapis.com");
		cacheDirectives.add(CacheDirective.noCache());
		connection.getResponse().setCacheDirectives(cacheDirectives);
		
		try {
			token = connection.post(requestBody.getWebRepresentation(), OAuthToken.class);
		} catch (ResourceException e) {
			Integer errorCode = e.getStatus().getCode();
			token = new OAuthToken();
			token.setError(errorCode.toString());
		}
		
		return token;
	}
}
