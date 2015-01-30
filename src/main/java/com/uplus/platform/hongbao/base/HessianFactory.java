package com.uplus.platform.hongbao.base;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianFactory {
	
	private static HessianFactory instance = new HessianFactory();
	
	private HessianProxyFactory factory = null;
	
	private HessianFactory(){
		factory = new HessianProxyFactory();
	}
	
	public static HessianFactory getInstance(){
		return instance;
	}
	
	public Object getDAOInterce(Class<?> clazz, String url) throws MalformedURLException{
		factory.setOverloadEnabled(true);
		return factory.create(clazz, url);
	}
}
