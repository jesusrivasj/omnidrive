package com.aiss.omnidrive.client.rpc;

import org.restlet.representation.FileRepresentation;

import com.aiss.omnidrive.shared.drive.files.DriveFile;
import com.aiss.omnidrive.shared.drive.files.DriveFilesList;
import com.aiss.omnidrive.shared.drive.user.DriveUserInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OnedriveServiceAsync {
	void getUserInfo(String token, AsyncCallback<DriveUserInfo> callback)
			throws IllegalArgumentException;
	
	void getFiles(String token, String parent, AsyncCallback<DriveFilesList> callback)
			throws IllegalArgumentException;
	
	void getFile(String token, String idFile, AsyncCallback<DriveFile> callback)
			throws IllegalArgumentException;
	
	void downloadFile(String token, String idFile, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
