package com.joven.am.guo.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年7月12日 下午5:17:28 类说明
 */
public class Demo {

	@Test
	public void demo_1() {
		try {
			FileInputStream fis = new FileInputStream("T:" + File.separator + "user.txt");
			byte[] b = new byte[512];
			while (fis.read(b, 0, b.length) != -1) {
				System.out.println(new String(b));
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void demo_2() throws Exception{
		FileInputStream fis = new FileInputStream("T:" + File.separator + "user.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		int i;
		char[] zz = new char[512];
		while ((i = isr.read(zz)) != -1) {
			System.out.print(zz);
		}
		isr.close();
		fis.close();
	}
	
	@Test
	public void demo_3() throws Exception{
		FileInputStream fis = new FileInputStream("T:" + File.separator + "user.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader buff = new BufferedReader(isr);
		String text;
		while ((text = buff.readLine()) != null) {
			System.out.print(text);
		}
		buff.close();
		isr.close();
		fis.close();
	}
}
