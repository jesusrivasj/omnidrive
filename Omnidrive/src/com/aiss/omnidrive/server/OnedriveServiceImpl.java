package com.aiss.omnidrive.server;

import com.aiss.omnidrive.client.rpc.OnedriveService;
import com.aiss.omnidrive.server.resources.DriveResource;
import com.aiss.omnidrive.server.resources.OnedriveResource;
import com.aiss.omnidrive.shared.onedrive.files.OnedriveFile;
import com.aiss.omnidrive.shared.onedrive.files.OnedriveFilesList;
import com.aiss.omnidrive.shared.onedrive.user.OnedriveUserInfo;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class OnedriveServiceImpl extends RemoteServiceServlet implements OnedriveService{
	
	public OnedriveUserInfo getUserInfo(String token){
		OnedriveUserInfo userInfo;
		
		userInfo = OnedriveResource.getUserInfo(token);
		userInfo.getQuota().clearAdditionalProperties();
		
		return userInfo;
	}
	
	public OnedriveFilesList getFiles(String token, String parent){
		OnedriveFilesList files;
		
		files = OnedriveResource.getFiles(token, parent);
		
		return files;
	}
	
	public OnedriveFile getFile(String token, String idFile){
		OnedriveFile file;
		
		file = OnedriveResource.getFile(token, idFile);
		
		return file;
	}
	
	public String downloadFile(String token, String idFile){
		//FileRepresentation file;
		String file;
		
		file = DriveResource.downloadFile(token, idFile);
		
		return file;
	}
}
