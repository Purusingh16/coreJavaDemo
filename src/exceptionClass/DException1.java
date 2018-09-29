package exceptionClass;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DException1 
{
	static DataInputStream dis=null;
	static FileOutputStream fos=null;

	public static void main(String[] args) throws IOException
	{
		try
		{
		 dis=new DataInputStream(System.in);
		 fos=new FileOutputStream("DTest.txt",true);
		char ch1;
		System.out.println("Enter the data(@ at the end)");
		while((ch1=(char)dis.read())!='@')
		{
			fos.write(ch1);
		}//end of while
		}
		finally
		{
			dis.close();
			fos.close();
		}
		

	}

}
