package com.aiss.omnidrive.server;

import com.aiss.omnidrive.client.rpc.OnedriveService;
import com.aiss.omnidrive.server.resources.DriveResource;
import com.aiss.omnidrive.shared.drive.files.DriveFile;
import com.aiss.omnidrive.shared.drive.files.DriveFilesList;
import com.aiss.omnidrive.shared.drive.user.DriveUserInfo;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class OnedriveServiceImpl extends RemoteServiceServlet implements OnedriveService{
	
	public DriveUserInfo getUserInfo(String token){
		DriveUserInfo userInfo;
		
		userInfo = DriveResource.getUserInfo(token);
		
		return userInfo;
	}
	
	public DriveFilesList getFiles(String token, String parent){
		DriveFilesList files;
		
		files = DriveResource.getFiles(token, parent);
		
		return files;
	}
	
	public DriveFile getFile(String token, String idFile){
		DriveFile file;
		
		file = DriveResource.getFile(token, idFile);
		
		return file;
	}
	
	public String downloadFile(String token, String idFile){
		//FileRepresentation file;
		String file;
		
		file = DriveResource.downloadFile(token, idFile);
		
		return file;
	}
}
