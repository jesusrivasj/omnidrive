package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.dropbox.files.DropboxFile;
import com.aiss.omnidrive.shared.dropbox.files.DropboxFilesList;
import com.aiss.omnidrive.shared.dropbox.user.DropboxUserInfo;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("dropbox")
public interface DropboxService extends RemoteService {
	
	DropboxUserInfo getUserInfo(String token);
	DropboxFilesList getFiles(String token, String parent);
	DropboxFile getFile(String token, String idFile);	
	
}
