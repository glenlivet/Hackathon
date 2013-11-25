package com.kingstar.ngbf.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description 
 * @author liang.ma
 * @date 2013-8-27 下午4:50:47
 * @since 0.0.0.0
 */

public class DemoHandler implements Handler {

	private static final Logger logger = LoggerFactory.getLogger(DemoHandler.class);
	
	@Override
	public void start() throws Exception {
		System.out.println("handler start ..........");
	}

	@Override
	public void stop() throws Exception {
		System.out.println("handler stop ..........");
	}

	@Override
	public boolean isRunning() {
		System.out.println("handler start ..........");
		return false;
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStarting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStopping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStopped() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFailed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addLifeCycleListener(Listener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLifeCycleListener(Listener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handle(String arg0, Request arg1, HttpServletRequest req,
			HttpServletResponse rep) throws IOException, ServletException {
		
		logger.info("ip={}, prot={}, contextPath={}, servletPath={}, pathInfo={}, params={}", new Object[] {
				req.getLocalAddr(), req.getLocalPort(), req.getContextPath(),
				req.getServletPath(), req.getPathInfo(), req.getParameterMap()
		});

		
		logger.info("request uri={},request url={}", new Object[]{arg1.getRequestURI(),arg1.getRequestURI()});
		
		
	}

	@Override
	public void setServer(Server arg0) {
		// TODO Auto-generated method stub

	}

}



