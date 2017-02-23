package com.alibaba.test;

public class test {
	//volatile类型数据，保证数据原子操作
	private static Integer vi = 0;
	
	public static void run1(){
		for(int i = 0 ; i < 10 ; i++){
			vi = vi + i;
		}
		System.out.println("run1:"+vi);
		System.out.println("==============");
	}
	
	public static void run2(){
		for(int i = 0 ; i < 10 ; i++){
			vi = vi + i;
		}
		System.out.println("run2:"+vi);
	}
	
	public static void main(String[] args) {
		run2();
		run1();
	}

}
