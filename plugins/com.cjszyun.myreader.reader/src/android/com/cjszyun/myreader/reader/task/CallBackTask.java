package com.cjszyun.myreader.reader.task;

import com.cjszyun.myreader.reader.AppData;
import com.cjszyun.myreader.reader.ReadClient;

/**
 * Created by zhuzd on 15/6/1.
 */
abstract public class CallBackTask extends Task {

	private ReadClient client;

	public CallBackTask(String taskName) {
		super(taskName);
		client = AppData.getClient();
	}

	protected boolean sendMessage(int msgID) {
		if (null == client) {
			return false;
		}
		return client.sendCallBackMsg(msgID);
	}
	protected boolean sendMessage(int msgID, Object obj) {
		if (null == client) {
			return false;
		}
		return client.sendCallBackMsg(msgID, obj);
	}
	protected boolean sendMessage(int msgID, int arg1, int arg2) {
		if (null == client) {
			return false;
		}
		return client.sendCallBackMsg(msgID, arg1, arg2);
	}
	protected boolean sendMessage(int msgID, int arg1, int arg2, Object obj) {
		if (null == client) {
			return false;
		}
		return client.sendCallBackMsg(msgID, arg1, arg2, obj);
	}

}
