package com.sjoj.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputFileSave {

	public void saveFile(int problem_id,String test_input,String test_output) throws IOException{
		//生成input的路径
		StringBuffer sbinputpath=new StringBuffer();
		sbinputpath.append("F://TestData//").append(String.valueOf(problem_id)+"//").append("input");
		//生成output的路径
		StringBuffer sboutputpath=new StringBuffer();
		sboutputpath.append("F://TestData//").append(String.valueOf(problem_id)+"//").append("output");
		System.out.println("路径名："+sboutputpath+"\n"+sboutputpath);
		//查看是否存在路径，没有就创建路径
		File inputfilepath=new File(sbinputpath.toString());
		File outputfilepath=new File(sboutputpath.toString());
		if(!inputfilepath.exists()||!outputfilepath.exists()){
			inputfilepath.mkdirs();
			outputfilepath.mkdirs();
		}
		//生成input文件名
		StringBuffer sbinputname=new StringBuffer();
		sbinputname.append(String.valueOf(problem_id)).append("_input.in");
		//生成input文件名
		StringBuffer sboutputname=new StringBuffer();
		sboutputname.append(String.valueOf(problem_id)).append("_output.in");
		//生成文件，如果文件不存在，就新建文件
		File inputfile=new File(sbinputpath.toString(), sbinputname.toString());
		File outputfile=new File(outputfilepath.toString(), sboutputname.toString());
		if (!inputfile.exists()||!outputfile.exists()) {
			inputfile.createNewFile();
			outputfile.createNewFile();		
		}
		//把输入输出样例一字符的形式存放
		byte[] inoutcontent=test_input.getBytes();
		byte[] outputcontent=test_output.getBytes();
		//使用输出流向输入输出文件写内容
		FileOutputStream foi=new FileOutputStream(inputfile);
		foi.write(inoutcontent);
		foi.close();
		
		FileOutputStream foo=new FileOutputStream(outputfile);
		foo.write(outputcontent);
		foo.close();
	    
	}

	public static void main(String[] args) throws IOException {
		InputOutputFileSave ioFileSave=new InputOutputFileSave();
		ioFileSave.saveFile(123343, "asdsad", "sadsa\r\ndasdsad   \r\nasdsafdsf");
	}

}
