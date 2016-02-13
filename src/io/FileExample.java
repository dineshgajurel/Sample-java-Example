package io;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		
		//instantiate file
File f=new File("E:\\b.txt");

//check if above path is directory
boolean isDirectory=f.isDirectory();
System.out.println(isDirectory);

//file exists or not 
boolean isFileExists=f.exists();
System.out.println(isFileExists);

//create directory
File fd=new File("E:\\java");
boolean b=fd.mkdir();
if(b){
	System.out.println("java folder is successfully created");
	
}

//list name of files
String fname[]=fd.list();
for (String fnames: fname) {
System.out.println(fnames);	
}

//list of files
File files[]=fd.listFiles();
for(File filess:files){
	System.out.println(filess.getAbsolutePath()+ "  " +filess.isDirectory());
	System.out.println(filess.listFiles());
}

	}

}
