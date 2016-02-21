package com.io;

public class EncodeDemo {

	public static void main(String[] args) {
		String s1 = "慕课ABC";
		String s2 = "慕课ABC";
		String s3 = new String("慕课ABC");
		
		byte[] bytes1 = s1.getBytes();
		for(byte b : bytes1) {
			System.out.print(b);
		}
		
		
		boolean sq1 = s1.equals(s2);	//true 对比内容
		boolean sq2 = (s1 == s2);		//true 对比对象-内存地址
		boolean sq3 = (s1 == s3);		//false
		System.out.println(sq3);

	}

}
