package com.aiss.omnidrive.client.views;

import java.util.Map;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;

public class ContentContainerView extends Composite {
	
	public ContentContainerView(Map<String, String> params){
		Panel contentContainer; 
		
		contentContainer = new SimplePanel();
		contentContainer.getElement().setId("content");;
		contentContainer.addStyleName("container");
		
		initWidget(contentContainer);
	}

}
