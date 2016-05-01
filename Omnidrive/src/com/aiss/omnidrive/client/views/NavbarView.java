package com.aiss.omnidrive.client.views;

import java.util.HashMap;
import java.util.Map;

import com.aiss.omnidrive.client.controllers.MainController;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;

public class NavbarView extends Composite {
	
	public NavbarView(Map<String, String> params){
		
		Panel navbarContent = new FlowPanel();
		navbarContent.addStyleName("all-size");
		
		Anchor queOfrecemos = new Anchor("Que ofrecemos");
		queOfrecemos.addStyleName("navbar-item");
		queOfrecemos.removeStyleName("gwt-Anchor");
		
		Anchor brand = new Anchor("Omnidrive");
		brand.addStyleName("navbar-item");
		brand.addStyleName("navbar-right");
		brand.addStyleName("navbar-brand");
		brand.removeStyleName("gwt-Anchor");
		
		queOfrecemos.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				Map<String, String> params = new HashMap<String, String>();
				params.put("option", "queOfrecemos");
				MainController.go("index", params);
			}
		});
		
		brand.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				MainController.go("index");
			}
		});
		
		navbarContent.add(queOfrecemos);
		navbarContent.add(brand);
		
		initWidget(navbarContent);
	}
	
}
