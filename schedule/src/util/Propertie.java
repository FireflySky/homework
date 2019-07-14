package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 读取配置文件的类
 * @author Administrator
 *
 */
public class Propertie {
	private static FileInputStream inStream=null;
	static BufferedReader read=null;
	
	public static ArrayList getProperties(String path){
		File f = new File(path);
		ArrayList<String> arr=new ArrayList<>();
		try {
			if(!f.exists()){
				System.out.println("文件不存在");
				return null;
			}
			read=new BufferedReader(new FileReader(f));
			String len=null;
			while ((len=read.readLine())!=null) {
				arr.add(len);
			}
			return arr;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(read!=null)
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
