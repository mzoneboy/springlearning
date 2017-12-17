package com.discover.amazing.designpattern.template;

public class FrameworkServlet extends HttpServlet {
	public void service(String req, String resp) {
		super.service(req, resp);
	}

	public void doGet(String req, String resp) {
		System.out.println(this.getClass().getName() + " begin to " + req);
	}

	public void doPost(String req, String resp) {
		System.out.println(this.getClass().getName() + " begin to " + req);
	}
	
	public static void main(String[] args) {
		FrameworkServlet frameworkServlet = new FrameworkServlet();
		frameworkServlet.service("POST", "");
	}
}
