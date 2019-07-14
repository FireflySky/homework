package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import bean.Personnel;
import util.Factory;
import util.ReturnDate;

public class Frame {
	private ArrayList<String> arr=null;//值日人员集合
	private static Frame f=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		f=new Frame();
		f.start();
		
	}
	
	private void start(){
		Factory factory=new Factory();
		Personnel p=(Personnel)factory.getProperties("personnel");
		arr=p.draw();
		ArrayList<String> day=new ReturnDate().getDate();
		//得到上次排班最后一天的值日人员
		String oldUser=arr.get(1).split("=>")[1];
		int indexOf=2;
		//得到最后人员的下标
		for(int i=2;i<arr.size();i++){
			if(oldUser.equals(arr.get(i))){
				indexOf=i;
			};
		}
		//输出值班表
		System.out.println("日期\t\t值班人员\n");
		for(String s:day){
			System.out.println(s+"\t"+arr.get(indexOf));
			indexOf++;
			if(indexOf>=arr.size()){
				indexOf=2;
			}
		}
		//更新最后值班人员
		arr.set(1,"本月末排班人员=>"+arr.get(indexOf-1));
		f.writer(p.PATH);
	}
	//更新人员配置文件
	private void writer(String path){
		BufferedWriter out =null;
		try{
			out=new BufferedWriter(new FileWriter(new File(path)));
			for(int i=0;i<arr.size();i++){
				out.write(arr.get(i));
				out.newLine();
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
