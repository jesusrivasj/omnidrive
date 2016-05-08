package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.onedrive.files.OnedriveFile;
import com.aiss.omnidrive.shared.onedrive.files.OnedriveFilesList;
import com.aiss.omnidrive.shared.onedrive.user.OnedriveUserInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OnedriveServiceAsync {
	void getUserInfo(String token, AsyncCallback<OnedriveUserInfo> callback)
			throws IllegalArgumentException;
	
	void getFiles(String token, String parent, AsyncCallback<OnedriveFilesList> callback)
			throws IllegalArgumentException;
	
	void getFile(String token, String idFile, AsyncCallback<OnedriveFile> callback)
			throws IllegalArgumentException;
	
	void downloadFile(String token, String idFile, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
