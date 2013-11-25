package com.kingstar.ngbf.demo;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

import com.kingstar.ngbf.demo.servlet.DemoHandler;

/**
 * @description 
 * @author liang.ma
 * @date 2013-8-26 下午5:16:15
 * @since 0.0.0.0
 */

public class JettyEmbedServer2 {

	
	public static void main(String[] args) {
		
		final Server server = new Server(8081); 
		
		try {
			ContextHandler context = new ContextHandler(); 
			context.setContextPath("/demo"); 
			context.setResourceBase("./src/main/webapp"); 
			context.setClassLoader(Thread.currentThread().getContextClassLoader()); 
			server.setHandler(context); 
			context.setHandler(new DemoHandler()); 
			
			
			server.start();
			server.join(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					server.stop();
				} catch (Exception e) {
					System.out.println("run main stop error!"+e.getMessage());
				}
			}
		});

		
	}

}



