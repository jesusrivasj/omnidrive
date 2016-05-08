package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.onedrive.files.OnedriveFile;
import com.aiss.omnidrive.shared.onedrive.files.OnedriveFilesList;
import com.aiss.omnidrive.shared.onedrive.user.OnedriveUserInfo;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("onedrive")
public interface OnedriveService extends RemoteService {
	
	OnedriveUserInfo getUserInfo(String token);
	OnedriveFilesList getFiles(String token, String parent);
	OnedriveFile getFile(String token, String idFile);	
	String downloadFile(String token, String idFile);
}
