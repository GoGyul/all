package ex05_proxyPattern;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		
		ProtectionInterface pi = new ProtectionSubjectImpl("alpha");
		
		ProtectionInterface userProxy = getProxy(pi);
		System.out.println(userProxy.getName());
		userProxy.setName("beta");
		System.out.println(userProxy.getName());
		
		ProtectionInterface  notUserProxy = getNotUserProxy(pi);
		System.out.println(notUserProxy.getName());
		notUserProxy.setName("NotUser");
		System.out.println(notUserProxy.getName());
		
	}

	private static ProtectionInterface getProxy(ProtectionInterface pi) {
		return (ProtectionInterface) Proxy.newProxyInstance(
				pi.getClass().getClassLoader(), 
				pi.getClass().getInterfaces(), 
				new UserHandler(pi));
	}
	
	private static ProtectionInterface getNotUserProxy(ProtectionInterface pi) {
		return (ProtectionInterface)Proxy.newProxyInstance(
				pi.getClass().getClassLoader(), 
				pi.getClass().getInterfaces(), 
				new NotUserHandler(pi));
	}
	
}
