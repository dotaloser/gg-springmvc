package com.dota.gg.jetty.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebApp {
	public static final int PORT = 8081; //端口号
	public static final String CONTEXT = "/gs"; //上下文路径，相当于生成的war包名
	public static void main(String[] args) throws Exception{
		Server server = new Server(PORT);
		WebAppContext webContext = new WebAppContext("src/main/webapp", CONTEXT);
		webContext.setClassLoader(Thread.currentThread().getContextClassLoader());
		server.setHandler(webContext);
		server.start();
		server.join();
	}
}
