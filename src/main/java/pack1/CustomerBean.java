package pack1;

import java.io.Serializable;

public class CustomerBean implements Serializable{
	private String cUname,cPwd, cFname, cLname, cAddrs, cMail, cMobile;
	
	public CustomerBean() {
		
	}
	public String getcUname() {
		return cUname;
	}

	public void setcUname(String cUname) {
		this.cUname = cUname;
	}

	public String getcPwd() {
		return cPwd;
	}

	public void setcPwd(String cPwd) {
		this.cPwd = cPwd;
	}

	public String getcFname() {
		return cFname;
	}

	public void setcFname(String cFname) {
		this.cFname = cFname;
	}

	public String getcLname() {
		return cLname;
	}

	public void setcLname(String cLname) {
		this.cLname = cLname;
	}

	public String getcAddrs() {
		return cAddrs;
	}

	public void setcAddrs(String cAddrs) {
		this.cAddrs = cAddrs;
	}

	public String getcMail() {
		return cMail;
	}

	public void setcMail(String cMail) {
		this.cMail = cMail;
	}

	public String getcMobile() {
		return cMobile;
	}

	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}
	
	
}
