package com.mytest;

import java.math.BigDecimal;


/**
 * 测试<p>
 * @author LingMin 
 * @date 2016-12-3<br>
 * @version 1.0<br>
 */
public class TestApp {

	static final int num  = -128;
	/**             <p>
	 * @param args <p>
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("(double)0.1+(double)0.2="+((double)0.1+(double)0.2));
		System.out.println("0.1+0.2="+(0.1+0.2));
		System.out.println("0.1f+0.2f="+(0.1f+0.2f));
		// char c1 = 'u00a';
		
		char a = 'a';
		char b = 'b';
		System.out.println("a="+(int)a+"\t b="+(int)b+" \t a+b="+(a+b));
		
		byte byteNum = num;
		System.out.println(byteNum);
		
		int num1 = 129;
		byte byte2 = (byte)num1;
		System.out.println(byte2);
		int i1 = 0;
//		for(float f = 10.1f ;f != 11 && i1 < 10;f+=0.1f,i1++){
//			System.out.println("f="+f);
//		}
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal("0.2");
		System.out.println("0.1+0.2="+ b1.add(b2));
	
		//答：根据贪心规则，前置＋＋优于后置＋＋，结果是（i++）＋j
		 int i = 1 , j = 2;
		 int ij = i+++j;
		 System.out.println("i+++j="+ij+" \t i="+i);
		 
		 //temp = i;i = i + 1; j = temp;
		 i=15;i=i++;
		 System.out.println("i="+i);
		 
		 int num3 = 12;
		// System.out.println(12/0);
		 //System.out.println(12.12/0);
	}

}
