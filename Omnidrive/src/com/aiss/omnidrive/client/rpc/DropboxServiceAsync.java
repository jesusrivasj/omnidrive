package com.aiss.omnidrive.client.rpc;

import com.aiss.omnidrive.shared.dropbox.user.DropboxUserInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DropboxServiceAsync {
	void getUserInfo(String token, AsyncCallback<DropboxUserInfo> callback)
			throws IllegalArgumentException;
}
