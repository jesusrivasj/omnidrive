package com.aiss.omnidrive.client.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aiss.omnidrive.client.views.NavbarView;
import com.aiss.omnidrive.client.views.SidenavView;
import com.aiss.omnidrive.shared.UrlUtils;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;


public class IndexController {

	private static final String DEFAULT_OPTION = "index";
	
	public static void show(Map<String, String> params){
		String option;
		
		if (params.containsKey("option")) {
			option = params.get("option");
		} else {
			option = DEFAULT_OPTION;
		}
		
		if (option == "index") {
			IndexController.index(params);
		} else if (option == "queOfrecemos") {
			IndexController.queOfrecemos(params);
		}/* else if (option == "updateSidenav") {
			IndexController.updateSidenav(params);
		}*/
	}
	
	protected static void index(Map<String, String> params){
		Panel navbar = RootPanel.get("navbar");
		Panel sidenav = RootPanel.get("sidenav");
		Panel container = RootPanel.get("container");
		Map<String, List<String>> requestParams = Window.Location.getParameterMap();
		
		if (IndexController.isAuthRedirect()) {
			Window.Location.replace(IndexController.getAuthUrl());
		} 
		
		if (!History.getToken().isEmpty()) {
			if (History.getToken().equals("driveConnect")) {
				params.put("option", "connect");
				MainController.go("drive", params);
			}
		}
		
		navbar.clear();
		container.clear();
		navbar.add(new NavbarView(params));
		sidenav.add(new SidenavView(params));
	}
	
	protected static void updateSidenav(Map<String, String> params){
		Panel sidenav = RootPanel.get("sidenav");
		sidenav.clear();
		sidenav.add(new SidenavView(params));
	}
	
	protected static void queOfrecemos(Map<String, String> params){
		Panel container = RootPanel.get("container");
		container.clear();
		final HTML text = new HTML(
			"<p>" + 
			"Omnidrive" +
			"</p>"
		);
		container.add(text);
	}
	
	
	protected static Boolean isAuthRedirect(){
		Boolean isAuthRedirect;
		Map<String, List<String>> urlParameters;
		
		isAuthRedirect = false;
		urlParameters = Window.Location.getParameterMap();
		
		if (urlParameters.containsKey("code") || urlParameters.containsKey("error")) {
			isAuthRedirect = true;
		}
		
		return isAuthRedirect;
	}
	
	protected static String getAuthUrl(){
		String authUrl;
		
		authUrl = GWT.getHostPageBaseURL() + UrlUtils.parseParams(IndexController.getAuthParams()) + IndexController.getAuthToken();
		
		return authUrl;
	}
	
	protected static String getAuthToken(){
		String authToken;
		Map<String, List<String>> urlParams;
		
		urlParams = Window.Location.getParameterMap();
		authToken = "";
		
		if (urlParams.containsKey("state")) {
			if (urlParams.get("state").get(0).equals("driveAuth")) {
				authToken = "#driveConnect";
			} else if (urlParams.get("state").get(0).equals("dropboxAuth")) {
				authToken = "#dropboxConnect";
			}
		} else {
			authToken = "#onedriveConnect";
		}
		
		return authToken;
	}
	
	protected static Map<String, String> getAuthParams(){
		Map<String, String> authParams;
		Map<String, List<String>> urlParams;
		
		authParams = new HashMap<String, String>();
		urlParams = Window.Location.getParameterMap();
		
		authParams.put("authCode", urlParams.get("code").get(0));
		
		return authParams;
	}
	
}
