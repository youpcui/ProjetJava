package ycui.projet.pgp.proxy;

import java.io.Serializable;

import ycui.projet.pgp.lang.Language;

public class MessageProxy extends Language implements Serializable {
	private static final long serialVersionUID = -2138855284216336998L;
	private String message = null;
	private String data = null;
	private boolean dataReady = false;
	
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		if(data==null){
			setMessage("No data!");
			setdataReady(false);
		}
		this.data = data;
		setdataReady(true);
	}
	public boolean isdataReady() {
		return dataReady;
	}
	private void setdataReady(boolean flag) {
		this.dataReady = flag;
	}
}