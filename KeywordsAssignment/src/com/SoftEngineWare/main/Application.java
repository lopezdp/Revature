package com.SoftEngineWare.main;

public class Application {
	
	public static void main(String[] args) {
		System.out.println(StaticClass.staticSum(1.2, 2.2));
		
		System.out.println(FinalClass.myConstant);
		
		ConcreteClass concrete = new ConcreteClass();
		concrete.run();
	}
	
}
