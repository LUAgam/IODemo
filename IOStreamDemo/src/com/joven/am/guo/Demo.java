package com.joven.am.guo;

import java.io.IOException;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��7��12�� ����3:35:56 
 * ��������ʲô  ����̨��ӡʲô
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
