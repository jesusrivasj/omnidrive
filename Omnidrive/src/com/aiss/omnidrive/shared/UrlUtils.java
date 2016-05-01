package com.aiss.omnidrive.shared;

import java.util.Map;

public class UrlUtils {

	public static String parseParams(Map<String, String> params){
		String parseParams;
		Boolean first;
		
		first = true;
		parseParams = "";
		
		for (String param : params.keySet()) {
			if (first) {
				parseParams += "?" + param + "=" + params.get(param);
				first = false;
			} else {
				parseParams += "&" + param + "=" + params.get(param);
			}
		}
		
		return parseParams;
	}
	
}
