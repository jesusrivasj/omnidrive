package com.aiss.omnidrive.client.controllers;

import com.google.gwt.user.client.Cookies;

public class DropboxController {

	public static Boolean isConnect(){
		Boolean connected;
		
		connected = false;
		if (Cookies.getCookie("dropboxToken") != null) {
			connected = true;
		}
		
		return connected;
	}
	
}
