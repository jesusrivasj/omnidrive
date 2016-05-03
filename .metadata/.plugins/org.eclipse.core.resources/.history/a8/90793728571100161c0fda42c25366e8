package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.drive.files.DriveFilesList;
import com.aiss.omnidrive.shared.drive.user.DriveUserInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DriveServiceAsync {
	void getUserInfo(String token, AsyncCallback<DriveUserInfo> callback)
			throws IllegalArgumentException;
	
	void getFiles(String token, String parent, AsyncCallback<DriveFilesList> callback)
			throws IllegalArgumentException;
}
