package com.demo.string;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class StringDemo {

	public static void main(String[] args) {
		 String s1 = "你.好.a";
//		 int i = 0;
//		 while(i < s1.length()){
//			 System.out.print(s1.charAt(i++));			 
//		 }
		 
		 String[] strarr = s1.split("\\.");
		 System.out.println(Arrays.toString(strarr));
		 System.out.println(strarr[0]);
		 
//	     String[] aa = "aaa*bbb*ccc".split("*");
	     String[] aa = "aaa|bbb|ccc".split("\\|"); //这样才能得到正确的结果   

//	     for (int i = 0 ; i <aa.length ; i++ ) {
//	       System.out.println("--"+aa[i]);
//	     }
//	     
//	     String[] aa1 = "aaa\\bbb\\bccc".split("\\\\");
//	     for (int i = 0 ; i <aa1.length ; i++ ) {
//		       System.out.println("--"+aa1[i]);
//		     }
	     
	     String s="A,B,C,D";
	     String sub1 = s.substring(1);
	     System.out.println("sub1="+sub1);
	     String sub2 = s.substring(1, 2);
	     System.out.println("sub2="+sub2);
	     
	     
	     String[] sArray=s.split(",",0) ;
	     
	     
	     for(String i : sArray){
	    	 System.out.println(i);
	     }    
	     
	  // Java文件名
			String fileName = "HelloWorld.java1"; 
	        // 邮箱
			String email = "laurenyang@imooc.com";
			
			// 判断.java文件名是否正确：合法的文件名应该以.java结尾
	        /*
	        参考步骤：
	        1、获取文件名中最后一次出现"."号的位置
	        2、根据"."号的位置，获取文件的后缀
	        3、判断"."号位置及文件后缀名
	        */
	        //获取文件名中最后一次出现"."号的位置
			int index = fileName.lastIndexOf(".");
	        
	        // 获取文件的后缀
			String prefix = fileName.substring(index);
	        
			// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
			if ( index != -1 && prefix.equals("java")  ) {
				System.out.println("Java文件名正确");
			} else {
				System.out.println("Java文件名无效");
			}
	     
	     
	     
	}

	private static void i(String[] sArray) {
		// TODO Auto-generated method stub
		
	}

}
