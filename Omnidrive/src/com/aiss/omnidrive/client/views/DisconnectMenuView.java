package com.aiss.omnidrive.client.views;

import com.aiss.omnidrive.client.controllers.DriveController;
import com.aiss.omnidrive.client.controllers.DropboxController;
import com.aiss.omnidrive.client.controllers.MainController;
import com.aiss.omnidrive.client.controllers.OnedriveController;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Panel;

public class DisconnectMenuView extends Composite {

	
	public DisconnectMenuView(){
		final Panel disconnectMenu;
		int connected = 0;
		
		disconnectMenu = new FlowPanel();
		disconnectMenu.addStyleName("sidenavMenuContent");
		
		if (DriveController.isConnect()) {
			HTML driveDisconnectLink = new HTML("Desconectar Google Drive");
			driveDisconnectLink.addStyleName("menuOption");
			driveDisconnectLink.addClickHandler(new ClickHandler() {
					
				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					DriveController.disconnect();
					MainController.go("index");
				}
			});
			disconnectMenu.add(driveDisconnectLink);
			connected++;
		}
		
		if (OnedriveController.isConnect()) {
			HTML onedriveDisconnectLink = new HTML("Desconectar Onedrive");
			onedriveDisconnectLink.addStyleName("menuOption");
			onedriveDisconnectLink.addClickHandler(new ClickHandler() {
				
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				OnedriveController.disconnect();
				MainController.go("index");
			}
		});
			disconnectMenu.add(onedriveDisconnectLink);
			connected++;
		}
		
		if (DropboxController.isConnect()) {
			HTML dropboxDisconnectLink = new HTML("Desconectar Dropbox");
			dropboxDisconnectLink.addStyleName("menuOption");
			dropboxDisconnectLink.addClickHandler(new ClickHandler() {
				
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				DropboxController.disconnect();
				MainController.go("index");
			}
		});
			disconnectMenu.add(dropboxDisconnectLink);
			connected++;
		}
		
		if (connected > 1) {
			HTML disconnectAllLink = new HTML("Desconectar todo");
			disconnectAllLink.addStyleName("menuOption");
			disconnectAllLink.addClickHandler(new ClickHandler() {
				
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				DriveController.disconnect();
				OnedriveController.disconnect();
				DropboxController.disconnect();
				MainController.go("index");
			}
		});
			disconnectMenu.add(disconnectAllLink);
			connected++;
		}
		
		initWidget(disconnectMenu);
	}
}
