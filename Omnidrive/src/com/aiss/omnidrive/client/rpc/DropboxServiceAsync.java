package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.dropbox.files.DropboxFile;
import com.aiss.omnidrive.shared.dropbox.files.DropboxFilesList;
import com.aiss.omnidrive.shared.dropbox.user.DropboxUserInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DropboxServiceAsync {
	void getUserInfo(String token, AsyncCallback<DropboxUserInfo> callback)
			throws IllegalArgumentException;
	
	void getFiles(String token, String parent, AsyncCallback<DropboxFilesList> callback)
			throws IllegalArgumentException;
	
	void getFile(String token, String idFile, AsyncCallback<DropboxFile> callback)
			throws IllegalArgumentException;
}
