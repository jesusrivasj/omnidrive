package com.aiss.omnidrive.client.controllers;

import java.util.Map;

import com.aiss.omnidrive.client.views.drive.DriveContextualMenuView;
import com.aiss.omnidrive.client.views.drive.DriveFileDetailsView;
import com.aiss.omnidrive.client.views.drive.DriveFilesListView;
import com.google.gwt.event.dom.client.ContextMenuEvent;
import com.google.gwt.event.dom.client.ContextMenuHandler;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

public class DriveController {

	private static final String DEFAULT_OPTION = "showFiles";
	
	public static Boolean isConnect(){
		Boolean connected;
		
		connected = false;
		if (Cookies.getCookie("driveToken") != null) {
			connected = true;
		}
		
		return connected;
	}
	
	public static void disconnect(){
		Cookies.removeCookie("driveToken");
		Cookies.removeCookie("driveAccessToken");
	}
	
	public static Boolean hasToken(){
		Boolean hasToken;
		
		hasToken = (Cookies.getCookie("driveAccessToken") != null);
		
		return hasToken;
	}
		
	public static void show(Map<String, String> params){
		String option;
		
		if (params.containsKey("option")) {
			option = params.get("option");
		} else {
			option = DEFAULT_OPTION;
		}
		
		if (option.equals("showFiles")) {
			DriveController.showFiles(params);
		} else if (option.equals("showFileDetails")) {
			DriveController.showFileDetails(params);
		}
	}
	
	public static void showFiles(final Map<String, String> params){
		Panel container = RootPanel.get("container");
		DriveFilesListView filesView = new DriveFilesListView(params);
		container.clear();
		container.sinkEvents(Event.ONCONTEXTMENU);
		container.addHandler(new ContextMenuHandler() {
			
			@Override
			public void onContextMenu(ContextMenuEvent event) {
				// TODO Auto-generated method stub
				event.preventDefault();
				event.stopPropagation();
				String idFile = "root";
				if (params.containsKey("parent")) {
					idFile = params.get("parent");
				}
				new DriveContextualMenuView(idFile, event);
			}
		}, ContextMenuEvent.getType());
		container.add(filesView);
	}
	
	public static void showFileDetails(final Map<String, String> params){
		Panel container = RootPanel.get("container");
		DriveFileDetailsView fileDetails = new DriveFileDetailsView(params);
		container.add(fileDetails);
	}
}
