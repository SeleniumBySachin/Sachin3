package Exception;

import java.io.*;
class Throws 
{
	public static void main(String[] args) throws Exception
	{
		writeFile();
	}
	public static void writeFile()throws Exception{
		String patch="D.//java/New1/a2.txt";
		FileOutputStream f=new FileOutputStream(patch);
		System.out.println("File is created & read to write");
		String s="Sheela";
		byte[]b=s.getBytes();
		f.write(b);
		f.close();
		
	}
}
