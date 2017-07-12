package com.joven.am.guo;

import java.io.IOException;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年7月12日 下午3:35:56 
 * 键盘输入什么  控制台打印什么
 */
public class Demo {

	public static void main(String[] args) {
		int b;
		try {
			while ((b = System.in.read()) != -1) {
				System.out.print((char)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void demo_1(){
	}
}
