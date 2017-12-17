package com.discover.amazing.designpattern.template;


public abstract class HttpServlet {
	public void service(String req, String resp) {
		if("GET".equals(req)){
			doGet(req, resp);
		} else if ("POST".equals(req)){
			doPost(req, resp);
		}
	}
	
	public void doGet(String req, String resp) {
		System.out.println(this.getClass().getName() + " begin to " + req);
	}
	
	public void doPost(String req, String resp) {
		System.out.println(this.getClass().getName() + " begin to " + req);
	}
}
