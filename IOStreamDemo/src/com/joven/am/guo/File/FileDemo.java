package com.joven.am.guo.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import com.sun.jndi.toolkit.url.Uri;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年7月12日 下午3:51:32 类说明
 */
public class FileDemo {

	File file = new File("T:/workspace/IOStreamDemo/src/com/joven/am/guo/File/FileDemo.java");
	File file2 = new File("T:" + File.separator, "user.txt");
	File file4 = new File("T:/");

	/**
	 * 读
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void demo_constructor() throws URISyntaxException {
		File file3 = new File(new URI("file:/T:/user.txt"));
		try {
			FileInputStream fis = new FileInputStream(file);
			int b;
			int n = 10;
			byte[] buff = new byte[n];
			while ((b = fis.read(buff, 0, n)) != -1) {
				System.err.print(new String (buff));
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("");
		try {
			FileInputStream fis = new FileInputStream(file);
			int b;
			while ((b = fis.read()) != -1) {
				System.err.print((char) b);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("");
		try {
			FileInputStream fis = new FileInputStream(file3);
			int b;
			while ((b = fis.read()) != -1) {
				System.err.print((char) b);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void demo_2() {
		System.out.println(file4.isFile());
		for (int i = 0; i < file4.list().length; i++) {
			System.out.println(file4.list()[i]);
		}
		System.out.println(file.length());
	}

}
