package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.drive.files.DriveFilesList;
import com.aiss.omnidrive.shared.drive.user.DriveUserInfo;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("drive")
public interface DriveService extends RemoteService {
	
	DriveUserInfo getUserInfo(String token);
	DriveFilesList getFiles(String token, String parent);
}