package com.trial.interviews;

//Reflective Operation Exception is used instead of InvocationTargetException, IllegalAccess, NoSuchMethodException and ClassNotFoundException

public class ReflectiveOperatorException {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.trial.interviews").getMethod("main").invoke(null, new Object [] {});
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
